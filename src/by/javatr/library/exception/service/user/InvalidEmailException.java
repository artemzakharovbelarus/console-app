package by.javatr.library.exception.service.user;

import by.javatr.library.bean.user.User;
import by.javatr.library.exception.service.ServiceException;

/**
 *Class Exception of {@link User#} field: email, extends {@link ServiceException}
 *no properties
 *@author Zakharov Artem
 *@version 1.0
 */
public class InvalidEmailException extends ServiceException {

    /** field serialVersionUID */
    static final long serialVersionUID = 5100231066478925110L;

    /**
     * Default constructor - creating new object
     * @see InvalidEmailException#InvalidEmailException()
     */
    public InvalidEmailException() {
        super();
    }

    /**
     * Constructor - creating new object
     * @param message - text of exception
     * @see InvalidEmailException#InvalidEmailException(String)
     */
    public InvalidEmailException(String message) {
        super(message);
    }

    /**
     * Constructor - creating new object
     * @param message - text of exception
     * @param cause - object of {@link Throwable}
     * @see InvalidEmailException#InvalidEmailException(String, Throwable)
     */
    public InvalidEmailException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructor - creating new object
     * @param cause - object of {@link Throwable}
     * @see InvalidEmailException#InvalidEmailException(Throwable)
     */
    public InvalidEmailException(Throwable cause) {
        super(cause);
    }

    /**
     * Constructor - creating new object
     * @param message - text of exception
     * @param cause - object of {@link Throwable}
     * @param enableSuppression - suppression
     * @param writableStackTrace - stack trace
     * @see InvalidEmailException#InvalidEmailException(String, Throwable, boolean, boolean)
     */
    protected InvalidEmailException(String message, Throwable cause, boolean enableSuppression,
                                    boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
