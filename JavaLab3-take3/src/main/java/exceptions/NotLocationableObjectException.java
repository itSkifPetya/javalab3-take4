package exceptions;

public class NotLocationableObjectException extends Exception {
    public NotLocationableObjectException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
