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

/**
 * Wraps the different type of errors that can be returned by the League of Legends API into
 * a single easy to deal with exception.
 */
class UltiException extends RuntimeException {

    public enum Type {
        BAD_REQUEST,
        UNAUTHORIZED,
        NO_DATA_FOUND,
        RATE_LIMIT_EXCEEDED,
        INTERNAL_SERVER_ERROR,
        SERVICE_UNAVAILABLE,
        INVALID_PARAMETERS,
        UNKNOWN,

    }

    public UltiException(Type type) {
        super(getMessage(type));
    }

    /**
     * Provides a message regarding what type of exception occured
     *
     * @param   type the type of exception
     * @return  a {@link java.lang.String} describing what the type of exception means
     */
    private static String getMessage(Type type) {
        String message;
        switch (type) {
            case BAD_REQUEST:
                message = "Bad request.";
                break;
            case UNAUTHORIZED:
                message = "Unauthorized request.";
                break;
            case NO_DATA_FOUND:
                message = "No data found for the given parameters.";
                break;
            case RATE_LIMIT_EXCEEDED:
                message = "API rate limit has been exceeded!";
                break;
            case INTERNAL_SERVER_ERROR:
                message = "An internal server error occurred.";
                break;
            case SERVICE_UNAVAILABLE:
                message = "The API currently has no service.";
                break;
            case UNKNOWN:
            default:
                message = "Unknown error";
        }

        return message;
    }
}
