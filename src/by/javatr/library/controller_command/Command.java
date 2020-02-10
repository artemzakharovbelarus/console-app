package by.javatr.library.controller_command;

import by.javatr.library.exception.command.CommandException;

/**
 *Interface command
 *no properties
 *@author Zakharov Artem
 *@version 1.0
 */
public interface Command {

    /**
     * Abstract method
     * @return {@link String} object
     * @throws  CommandException if was an error during the getting information
     */
    String execute() throws CommandException;
}
