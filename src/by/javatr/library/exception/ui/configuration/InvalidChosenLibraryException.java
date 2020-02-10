package by.javatr.library.exception.ui;

public class InvalidChosenLibraryException extends UserInterfaceException{
    public InvalidChosenLibraryException(String message) {
        super(message);
    }

    public InvalidChosenLibraryException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidChosenLibraryException(Throwable cause) {
        super(cause);
    }

    protected InvalidChosenLibraryException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
