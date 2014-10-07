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

import com.google.common.base.Joiner;

import java.util.Iterator;
import java.util.Map;

/**
 * Utility class to prepare parts of a apiQuery and to validate that the input is allowed
 */
class QueryUtils {
    private static Joiner joiner = Joiner.on(",");

    /**
     * Helper function to determine if the list is within bounds of {@code max}
     *
     * @param   list the list to check the length of
     * @param   max the max length {@code list} can be
     * @return  true if the list is within bounds, otherwise false
     */
    static boolean passLengthConstraint(Object[] list, int max) {
        return list.length <= max;
    }

    /**
     * Helper function to get {@code list} into a format that the api will accept. This function will make
     * all strings in {@code list} lower case and remove any extra whitespace (before, in the middle, and after the
     * string). The list is then comma separated.
     *
     * @param   list a list of {@link java.lang.String}
     * @return  a comma separated, whitespace free, string containing all strings in {@code list}
     */
    static String prepare(String[] list) {
        for (int i = 0; i < list.length; i++) {
            list[i] = normalize(list[i]);
        }

        return joiner.join(list);
    }

    /**
     * Similar to {@link #prepare(String[]) parepare} but accepts an additional parameters that controls whether the
     * Strings should be cast to a lower case. Certain API calls require the case to remain intact. Those calls should
     * use this version of prepare
     *
     * @param   list list a list of {@link java.lang.String}
     * @param   modify true if strings in the list should be lower case, otherwise false
     * @return  a comma separated, whitespace free, string containing all strings in {@code list}
     */
    static String prepare(String[] list, boolean modify) {
        if (modify) {
            return prepare(list);
        }
        return joiner.join(list);
    }

    /**
     * Functions similarly as {@link #prepare(String[]) prepare}
     *
     * @param   list a list of {@link java.lang.Object}
     * @return  a comma separated string containing the string representations of the {@link java.lang.Object}s
     */
    static String prepare(Object[] list) {
        return joiner.join(list);
    }

    static String normalize(String name) {
        return name.toLowerCase().replaceAll("\\s+", "");
    }

    static String toStringList(Map<String, String> stringMap, String delim) {
        Iterator<Map.Entry<String, String>> iter = stringMap.entrySet().iterator();
        StringBuilder sb = new StringBuilder();

        Map.Entry<String, String> entry = iter.next();
        sb.append(entry.getKey() + "=" + entry.getValue());

        while (iter.hasNext()) {
            sb.append(delim + entry.getKey() + "=" + entry.getValue());
        }

        return sb.toString();
    }
}
