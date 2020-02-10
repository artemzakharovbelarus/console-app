package by.javatr.library.exception.dao.user;

import by.javatr.library.exception.dao.DAOException;

public class InvalidNameOrPasswordException extends DAOException {
    public InvalidNameOrPasswordException(String message) {
        super(message);
    }

    public InvalidNameOrPasswordException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidNameOrPasswordException(Throwable cause) {
        super(cause);
    }

    public InvalidNameOrPasswordException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
