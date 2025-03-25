package enumeration.test.http;

public enum ReHttpStatus {
    OK(200, "OK"),
    BAD_REQUEST(400, "Bad Request"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error");

    private final int code;
    private final String message;

    ReHttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static ReHttpStatus reFindByCode(int code) {
        ReHttpStatus[] values = values();
        for (ReHttpStatus value : values) {
            if (value.getCode() == code) {
                return value;
            }

        }
        return null;

    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public boolean isSuccess(){
        return code >= 200 && code < 300;
    }
}
