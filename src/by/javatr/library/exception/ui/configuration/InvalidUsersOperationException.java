package by.javatr.library.exception.ui;

public class InvalidUsersOperationException extends UserInterfaceException{
    public InvalidUsersOperationException(String message) {
        super(message);
    }

    public InvalidUsersOperationException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidUsersOperationException(Throwable cause) {
        super(cause);
    }

    protected InvalidUsersOperationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
