package by.javatr.library.exception.ui;

public class InvalidBooksOperationException extends UserInterfaceException{
    public InvalidBooksOperationException(String message) {
        super(message);
    }

    public InvalidBooksOperationException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidBooksOperationException(Throwable cause) {
        super(cause);
    }

    protected InvalidBooksOperationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
