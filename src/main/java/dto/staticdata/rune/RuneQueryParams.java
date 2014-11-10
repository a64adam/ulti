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

package dto.staticdata.rune;

import api.QueryParams;
import com.google.common.base.Joiner;

import java.util.HashMap;
import java.util.Map;

/**
 * Helper class for passing in parameters when querying rune list data via the static API
 */
public class RuneQueryParams implements QueryParams {
    private String locale;
    private String version;
    private RuneListData[] runeListData;

    private RuneQueryParams(Builder builder) {
        this.locale = builder.locale;
        this.version = builder.version;
        this.runeListData = builder.runeListData;
    }

    @Override
    public Map<String, String> getParams() {
        Map<String, String> map = new HashMap<String, String>();
        if (locale != null) map.put("locale", locale);
        if (version != null) map.put("version", version);
        if (runeListData != null) map.put("runeListData", Joiner.on(",").join(runeListData));

        return map;
    }

    public static class Builder {
        private String locale;
        private String version;
        private RuneListData[] runeListData;

        /**
         * @param   locale Locale code for returned data (e.g., en_US, es_ES). If not specified, the default
         *          locale for the region is used.
         */
        public Builder locale(String locale) {
            this.locale = locale;
            return this;
        }

        /**
         * @param   version Data dragon version for returned data. If not specified, the latest version for the region
         *          is used. List of valid versions can be obtained from the /versions endpoint
         *
         * @see     api.Ulti#getStaticVersions()
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        /**
         * @param   runeListData Tags to return additional data. Only type, version, data, id, name, rune, and
         *                       description are returned by default if this parameter isn't specified. To return all
         *                       additional data, use the tag 'all'.
         *
         * @see     dto.staticdata.rune.RuneListData
         */
        public Builder runeListData(RuneListData... runeListData) {
            this.runeListData = runeListData;
            return this;
        }

        public RuneQueryParams build() {
            return new RuneQueryParams(this);
        }
    }
}
