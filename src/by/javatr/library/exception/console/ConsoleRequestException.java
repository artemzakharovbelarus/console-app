package by.javatr.library.exception.console;

import by.javatr.library.exception.command.CommandException;

public class ConsoleRequestException extends CommandException {
    public ConsoleRequestException(String message) {
        super(message);
    }

    public ConsoleRequestException(String message, Throwable cause) {
        super(message, cause);
    }

    public ConsoleRequestException(Throwable cause) {
        super(cause);
    }

    protected ConsoleRequestException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
