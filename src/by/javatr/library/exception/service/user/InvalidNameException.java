package by.javatr.library.exception.service.user;

import by.javatr.library.bean.user.User;
import by.javatr.library.exception.service.ServiceException;

/**
 *Class exception of {@link User} field: name, extends {@link ServiceException}
 *no properties
 *@author Zakharov Artem
 *@version 1.0
 */
public class InvalidNameException extends ServiceException {

    /** field serialVersionID */
    static final long serialVersionUID = 8067971793521057176L;

    /**
     * Default constructor - creating new object
     * @see InvalidNameException#InvalidNameException()
     */
    public InvalidNameException() {
        super();
    }

    /**
     * Constructor - creating new object
     * @param message - text of exception
     * @see InvalidNameException#InvalidNameException(String)
     */
    public InvalidNameException(String message) {
        super(message);
    }

    /**
     * Constructor - creating new object
     * @param message - text of exception
     * @param cause - object of {@link Throwable}
     * @see InvalidNameException#InvalidNameException(String, Throwable)
     */
    public InvalidNameException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructor - creating new object
     * @param cause - object {@link Throwable}
     * @see InvalidNameException#InvalidNameException(Throwable)
     */
    public InvalidNameException(Throwable cause) {
        super(cause);
    }

    /**
     * Constructor - creating new object
     * @param message - text of exception
     * @param cause - object of {@link Throwable}
     * @param enableSuppression - suppression
     * @param writableStackTrace - stack trace
     * @see InvalidNameException#InvalidNameException(String, Throwable, boolean, boolean)
     */
    protected InvalidNameException(String message, Throwable cause, boolean enableSuppression,
                                   boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
