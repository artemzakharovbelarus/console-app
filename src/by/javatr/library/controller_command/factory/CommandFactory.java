package by.javatr.library.controller_command.factory;

import by.javatr.library.console.ConsoleRequest;
import by.javatr.library.controller_command.Command;
import by.javatr.library.controller_command.impl.*;
import by.javatr.library.exception.command.CommandException;

/**
 *Factory class of command:
 *<b>INSTANCE</b>
 *@author Zakharov Artem
 *@version 2.0
 */
public class CommandFactory{
    /**
     * @value field INSTANCE
     */
    private static final CommandFactory INSTANCE = new CommandFactory();

    /**
     * Default constructor - don't create object
     */
    private CommandFactory(){}

    /**
     * Method of getting a @value INSTANCE
     * @return object of {@link CommandFactory}
     */
    public static CommandFactory getINSTANCE() {
        return INSTANCE;
    }

    /**
     * Method that creates a command
     * @param command name of command
     * @param request Console request
     * @return an object of class that implements {@link Command}
     * @throws CommandException if was an error
     */
    public Command createCommand(String command, ConsoleRequest request)
            throws CommandException{

        command = command.toUpperCase();
        switch (command){
            case "SIGNIN":
                return new SignInCommand(request);
            case "SIGNOUT":
                return new SignOutCommand(request);
            case "CHANGEPASSWORD":
                return new ChangePasswordCommand(request);
            case "DELETEWEBBOOKBYID":
                return new DeleteWebBookByIdCommand(request);
            case "GETALLBOOKS":
                return new GetAllBooksCommand(request);
            case "GETALLUSERS":
                return new GetAllUsersCommand(request);
            case "GETUSERBYID":
                return new GetUserByIdCommand(request);
            case "GETUSERSSORTED":
                return new GetUsersSortedCommand(request);
            case "GIVEPAPERBOOKBACK":
                return new GivePaperBookBackByIdCommand(request);
            case "SIGNUP":
                return new SignUpCommand(request);
            case "TAKEBOOKBYID":
                return new TakeBookByIdCommand(request);
            case "ADDPAPERBOOK":
                return new AddPaperBookCommand(request);
            case "ADDWEBBOOK":
                return new AddWebBookCommand(request);
            case "GETBOOKSSORTED":
                return new GetBooksSortedCommand(request);
            case "TAKEBOOKBACK":
                return new TakeBookByIdCommand(request);
        }
        throw new CommandException("Invalid command name!");
    }
}
