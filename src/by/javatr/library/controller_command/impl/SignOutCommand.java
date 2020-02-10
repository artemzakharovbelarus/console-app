package by.javatr.library.controller_command.impl;

import by.javatr.library.controller_command.Command;
import by.javatr.library.console.ConsoleRequest;
import by.javatr.library.console.ConsoleResponse;
import by.javatr.library.exception.command.CommandException;
import by.javatr.library.exception.service.ServiceException;
import by.javatr.library.service.GeneralService;
import by.javatr.library.service.impl.GeneralServiceImpl;

/**
 *Class of command "sign out from system", implements {@link Command}
 *no properties
 *@author Zakharov Artem
 *@version 1.0
 */
public class SignOutCommand implements Command {
    /** field service*/
    private GeneralService service;
    /** field request*/
    private ConsoleRequest request;
    /** field response*/
    private ConsoleResponse response;

    /**
     * Constructor - makes an object
     * @param requestFromUser request with some information
     */
    public SignOutCommand(ConsoleRequest requestFromUser) {
        service = GeneralServiceImpl.getINSTANCE();
        request = requestFromUser;
    }

    /**
     * Method with UI logic
     * @return text of {@link ConsoleResponse}
     * @throws CommandException if was an error during the getting information
     */
    @Override
    public String execute() throws CommandException {
        String password = request.getParameter("password");
        try{
            service.signOutOperation(password);
            response = new ConsoleResponse("Good bye!");

            return response.getResponse();
        } catch (ServiceException e){
            response = new ConsoleResponse("Invalid password!");
            throw new CommandException(response.getResponse(), e);
        }
    }
}
