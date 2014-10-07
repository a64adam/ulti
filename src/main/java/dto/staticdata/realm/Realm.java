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

package dto.staticdata.realm;

import java.util.Map;

public class Realm {

    private String cdn;
    private String css;
    private String dd;
    private String l;
    private String lg;
    private Map<String, String> n;
    private int profileiconmax;
    private String store;
    private String v;

    /**
     * @return  the base CDN url
     */
    public String getCdn() {
        return cdn;
    }

    /**
     * @return  latest changed version of Dragon Magic's css file
     */
    public String getCss() {
        return css;
    }

    /**
     * @return  latest changed version of Dragon Magic
     */
    public String getDd() {
        return dd;
    }

    /**
     * @return  default language for this realm
     */
    public String getL() {
        return l;
    }

    /**
     * @return  legacy script mode for IE6 or older :/
     */
    public String getLg() {
        return lg;
    }

    /**
     * @return  a {@link java.util.Map} of the latest changed version for each data type listed
     */
    public Map<String, String> getN() {
        return n;
    }

    /**
     * Special behavior number identifying the largest profileicon id that can be used under 500.
     * Any profileicon that is requested between this number and 500 should be mapped to 0.
     */
    public int getProfileiconmax() {
        return profileiconmax;
    }

    /**
     * @return  additional api data drawn from other sources that may be related to data dragon functionality.
     */
    public String getStore() {
        return store;
    }

    /**
     * @return  current version of this file for this realm
     */
    public String getV() {
        return v;
    }
}
