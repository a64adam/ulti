package api;

import com.google.common.base.Joiner;

/**
 * Utility class to prepare parts of a query and to validate that the input is allowed
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
}
