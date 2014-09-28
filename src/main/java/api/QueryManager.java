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
        endpoints.put(Region.NA, "https://na.api.pvp.net/api/lol/na/");
    }

    private String apiKey;
    private String endpoint;

    private final OkHttpClient client;

    private final RateLimiter shortRateLimiter;
    private final RateLimiter longRateLimiter;

    public QueryManager(String apiKey) {
        this.apiKey = apiKey;

        client = new OkHttpClient();

        shortRateLimiter = RateLimiter.create(DEFAULT_SHORT_RATE_LIMIT);
        longRateLimiter = RateLimiter.create(DEFAULT_LONG_RATE_LIMIT);

        // Default endpoint to NA
        setEndpoint(Region.NA);
    }

    Reader query(String path) {
        // Obey the rate limit
        shortRateLimiter.acquire();
        longRateLimiter.acquire();

        // Build request
        Request request = new Request.Builder()
                .url(endpoint + path + "?api_key=" + apiKey)
                .build();

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

        // Return JSON as a Reader
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

    void setShortRateLimit(int qps) {
        shortRateLimiter.setRate(qps);
    }

    void setLongRateLimit(int qps) {
        longRateLimiter.setRate(qps);
    }

    void setEndpoint(Region region) {
        endpoint = endpoints.get(region);
    }
}
