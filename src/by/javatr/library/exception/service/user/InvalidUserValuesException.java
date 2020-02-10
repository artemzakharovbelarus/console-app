package by.javatr.library.exception.service.user;

import by.javatr.library.exception.service.ServiceException;
import by.javatr.library.util.validator.UserValuesValidator;

/**
 *Class Exception of {@link UserValuesValidator#}, extends {@link ServiceException}
 *no properties
 *@author Zakharov Artem
 *@version 1.0
 */
public class InvalidUserValuesException extends ServiceException {

    /** field serialVersionUID */
    static final long serialVersionUID = 1829377491853626307L;

    /**
     * Default constructor - creating new object
     * @see InvalidUserValuesException#InvalidUserValuesException()
     */
    public InvalidUserValuesException() {
        super();
    }

    /**
     * Constructor - creating new object
     * @param message - text of exception
     * @see InvalidUserValuesException#InvalidUserValuesException(String)
     */
    public InvalidUserValuesException(String message) {
        super(message);
    }

    /**
     * Constructor - creating new object
     * @param message - text of exception
     * @param cause - object of {@link Throwable}
     * @see InvalidUserValuesException#InvalidUserValuesException(String, Throwable)
     */
    public InvalidUserValuesException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructor - creating new object
     * @param cause - object of {@link Throwable}
     * @see InvalidUserValuesException#InvalidUserValuesException(Throwable)
     */
    public InvalidUserValuesException(Throwable cause) {
        super(cause);
    }

    /**
     * Constructor - creating new object
     * @param message - text of exception
     * @param cause - object {@link Throwable}
     * @param enableSuppression - suppression
     * @param writableStackTrace - stack trace
     * @see InvalidUserValuesException#InvalidUserValuesException(String, Throwable, boolean, boolean)
     */
    protected InvalidUserValuesException(String message, Throwable cause, boolean enableSuppression,
                                       boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
