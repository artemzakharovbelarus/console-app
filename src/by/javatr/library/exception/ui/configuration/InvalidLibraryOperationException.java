package by.javatr.library.exception.ui;

public class InvalidLibraryOperationException extends UserInterfaceException{
    public InvalidLibraryOperationException(String message) {
        super(message);
    }

    public InvalidLibraryOperationException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidLibraryOperationException(Throwable cause) {
        super(cause);
    }

    protected InvalidLibraryOperationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
