package by.javatr.library.exception.command;

import by.javatr.library.controller_command.Command;

/**
 *Class Exception of {@link Command}, extends {@link Exception}
 *no properties
 *@author Zakharov Artem
 *@version 1.0
 */
public class CommandException extends Exception{

    /** field serialVersionUID */
    static final long serialVersionUID = -3146384002564927693L;

    /**
     * Default constructor - creating new object
     * @see CommandException#CommandException()
     */
    public CommandException() {
        super();
    }

    /**
     * Constructor - creating new object
     * @param message - text of exception
     * @see CommandException#CommandException(String)
     */
    public CommandException(String message) {
        super(message);
    }

    /**
     * Constructor - creating new object
     * @param message - text of exception
     * @param cause - exception of {@link Throwable}
     * @see CommandException#CommandException(String, Throwable)
     */
    public CommandException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructor - creating new object
     * @param cause - exception of {@link Throwable}
     * @see CommandException#CommandException(Throwable)
     */
    public CommandException(Throwable cause) {
        super(cause);
    }

    /**
     * Constructor - creating new object
     * @param message - text of exception
     * @param cause - exception of {@link Throwable}
     * @param enableSuppression - suppression
     * @param writableStackTrace - stack trace
     * @see CommandException#CommandException(String, Throwable, boolean, boolean)
     */
    protected CommandException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
