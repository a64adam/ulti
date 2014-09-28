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
