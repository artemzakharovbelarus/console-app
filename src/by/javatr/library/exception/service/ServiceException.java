package by.javatr.library.exception.service;

/**
 *Class exception of service layer, extends {@link Exception}
 *no properties
 *@author Zakharov Artem
 *@version 1.0
 */
public class ServiceException extends Exception {

    /** field serialVersionUID */
    static final long serialVersionUID = -1546033952374026095L;

    /**
     * Default constructor - creating new object
     * @see ServiceException#ServiceException()
     */
    public ServiceException() {
        super();
    }

    /**
     * Constructor - creating new object
     * @param message - text of exception
     * @see ServiceException#ServiceException(String)
     */
    public ServiceException(String message) {
        super(message);
    }

    /**
     * Constructor - creating new object
     * @param message - text of exception
     * @param cause - object of {@link Throwable}
     * @see ServiceException#ServiceException(String, Throwable)
     */
    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructor - creating new object
     * @param cause - object of {@link Throwable}
     * @see ServiceException#ServiceException(Throwable)
     */
    public ServiceException(Throwable cause) {
        super(cause);
    }

    /**
     * Constructor - creating new object
     * @param message - text of exception
     * @param cause - object of {@link Throwable}
     * @param enableSuppression - suppression
     * @param writableStackTrace - stack trace
     * @see ServiceException#ServiceException(String, Throwable, boolean, boolean)
     */
    protected ServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
