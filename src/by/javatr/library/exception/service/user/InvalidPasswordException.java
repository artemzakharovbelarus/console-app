package by.javatr.library.exception.service.user;

import by.javatr.library.bean.user.User;
import by.javatr.library.exception.service.ServiceException;

/**
 *Class Exception of {@link User#} for password, extends {@link ServiceException}
 *no properties
 *@author Zakharov Artem
 *@version 1.0
 */
public class InvalidPasswordException extends ServiceException {

    /** field serialVersionUID */
    static final long serialVersionUID = -7247719997604331207L;

    /**
     * Default constructor - creating new object
     * @see InvalidPasswordException#InvalidPasswordException()
     */
    public InvalidPasswordException() {
        super();
    }

    /**
     * Constructor - creating new object
     * @param message - text of exception
     * @see InvalidPasswordException#InvalidPasswordException(String)
     */
    public InvalidPasswordException(String message) {
        super(message);
    }

    /**
     * Constructor - creating new object
     * @param message - text of exception
     * @param cause - object of {@link Throwable}
     * @see InvalidPasswordException#InvalidPasswordException(String, Throwable)
     */
    public InvalidPasswordException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructor - creating new object
     * @param cause - object of {@link Throwable}
     * @see InvalidPasswordException#InvalidPasswordException(Throwable)
     */
    public InvalidPasswordException(Throwable cause) {
        super(cause);
    }

    /**
     * Constructor - creating new object
     * @param message - text of exception
     * @param cause - object of {@link Throwable}
     * @param enableSuppression - suppression
     * @param writableStackTrace - stack trace
     * @see InvalidPasswordException#InvalidPasswordException(String, Throwable, boolean, boolean)
     */
    protected InvalidPasswordException(String message, Throwable cause, boolean enableSuppression,
                                    boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
