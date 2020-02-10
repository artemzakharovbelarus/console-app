package by.javatr.library.exception.service.book;

import by.javatr.library.exception.service.ServiceException;

public class InvalidWebBookValuesException extends ServiceException {

    public InvalidWebBookValuesException(String message) {
        super(message);
    }

    public InvalidWebBookValuesException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidWebBookValuesException(Throwable cause) {
        super(cause);
    }

    protected InvalidWebBookValuesException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
