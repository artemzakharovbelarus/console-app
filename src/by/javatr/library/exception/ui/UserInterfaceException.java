package by.javatr.library.exception.ui;

public class UserInterfaceException extends Exception{
    public UserInterfaceException(String message) {
        super(message);
    }

    public UserInterfaceException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserInterfaceException(Throwable cause) {
        super(cause);
    }

    protected UserInterfaceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
