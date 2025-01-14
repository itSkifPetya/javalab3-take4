package exceptions;

public class NotLocationObjectException extends Exception {
    public NotLocationObjectException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "[Exception!] " + super.getMessage();
    }
}
