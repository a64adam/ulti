/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 Adam Alyyan
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software
 * and associated documentation files (the "Software"), to deal in the Software without restriction,
 *  including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software
 * is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING
 * BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package api;

import com.google.common.util.concurrent.RateLimiter;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import dto.Region;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

class QueryManager {
    private static QueryManager queryManager = null;

    /**
     * Riot default API limits
     */
    private static final double DEFAULT_SHORT_RATE_LIMIT = 10 / 10.0;
    private static final double DEFAULT_LONG_RATE_LIMIT = 600 / 500.0;

    /**
     * Maintains a mapping of each region to their respective endpoints
     */
    private static final Map<Region, String> endpoints = new HashMap<Region, String>();
    static {
        endpoints.put(Region.NA, "https://na.api.pvp.net/api/lol/");
        endpoints.put(Region.EUW, "https://euw.api.pvp.net/api/lol/");
        endpoints.put(Region.EUNE, "https://kr.api.pvp.net/api/lol/");
        endpoints.put(Region.BR, "https://br.api.pvp.net/api/lol/");
        endpoints.put(Region.LAS, "https://las.api.pvp.net/api/lol/");
        endpoints.put(Region.LAN, "https://lan.api.pvp.net/api/lol/");
        endpoints.put(Region.OCE, "https://oce.api.pvp.net/api/lol/");
        endpoints.put(Region.TR, "https://tr.api.pvp.net/api/lol/");
        endpoints.put(Region.RU, "https://ru.api.pvp.net/api/lol/");
        endpoints.put(Region.GLOBAL, "https://global.api.pvp.net/api/lol/");
    }

    private String apiKey;
    private String endpoint;
    private Region region;

    private final OkHttpClient client;

    private final RateLimiter shortRateLimiter;
    private final RateLimiter longRateLimiter;

    static QueryManager getInstance() {
        if (queryManager == null) {
            queryManager = new QueryManager();
        }

        return queryManager;
    }

    private QueryManager() {
        client = new OkHttpClient();

        longRateLimiter = RateLimiter.create(DEFAULT_LONG_RATE_LIMIT);
        shortRateLimiter = RateLimiter.create(DEFAULT_SHORT_RATE_LIMIT);

        // Default endpoint to NA
        endpoint = endpoints.get(Region.NA);

        // Default region to NA
        region = Region.NA;
    }

    Reader apiQuery(String path) {
        return query(path, null);
    }

    Reader apiQuery(String path, Map<String, String> params) {
        return query(path, params);
    }

    Reader query(String path, Map<String, String> params) {
        // Obey the rate limit
        longRateLimiter.acquire();
        shortRateLimiter.acquire();

        String sParams = "";
        if (params != null && !params.isEmpty()) {
            sParams = "&" + QueryUtils.toStringList(params, "&");
        }

        // Build request
        Request request = new Request.Builder()
                .url(endpoint + region + "/" + path + "?api_key=" + apiKey + sParams)
                .build();

        return exeucteRequest(request);
    }

    Reader staticQuery(String path) {
        // Build request
        Request request = new Request.Builder()
                .url(endpoint + "static-data/" + region + "/" + path + "?api_key=" + apiKey)
                .build();

        return exeucteRequest(request);
    }

    Reader statusQuery(String path) {
        Request request = new Request.Builder()
                .url("http://status.leagueoflegends.com/" + path)
                .build();

        return exeucteRequest(request);
    }

    private Reader exeucteRequest(Request request) {
        // Get response
        Response response = null;
        try {
            response = client.newCall(request).execute();
        } catch (IOException e) {
            // Handle error
        }

        // Handle any errors
        if (!response.isSuccessful()) {
            handleErrorCode(response.code());
        }

        return response.body().charStream();
    }

    private void handleErrorCode(int code) {
        switch (code) {
            case 400:
                throw new UltiException(UltiException.Type.BAD_REQUEST);
            case 401:
                throw new UltiException(UltiException.Type.UNAUTHORIZED);
            case 404:
                throw new UltiException(UltiException.Type.NO_DATA_FOUND);
            case 429:
                throw new UltiException(UltiException.Type.RATE_LIMIT_EXCEEDED);
            case 500:
                throw new UltiException(UltiException.Type.INTERNAL_SERVER_ERROR);
            case 503:
                throw new UltiException(UltiException.Type.SERVICE_UNAVAILABLE);
            default:
                throw new UltiException(UltiException.Type.UNKNOWN);
        }
    }

    void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    void setShortRateLimit(int qps) {
        shortRateLimiter.setRate(qps);
    }

    void setLongRateLimit(int qps) {
        longRateLimiter.setRate(qps);
    }

    void setEndpoint(Region region) {
        endpoint = endpoints.get(region);
    }

    void setRegion(Region region) {
        this.region = region;
    }
}
