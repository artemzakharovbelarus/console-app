package by.javatr.library.exception.service.book;

import by.javatr.library.exception.service.ServiceException;

public class InvalidPaperBookValuesException extends ServiceException {
    public InvalidPaperBookValuesException(String message) {
        super(message);
    }

    public InvalidPaperBookValuesException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidPaperBookValuesException(Throwable cause) {
        super(cause);
    }

    protected InvalidPaperBookValuesException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
