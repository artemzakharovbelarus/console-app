package by.javatr.library.controller_command.impl;

import by.javatr.library.controller_command.Command;
import by.javatr.library.console.ConsoleRequest;
import by.javatr.library.console.ConsoleResponse;
import by.javatr.library.exception.command.CommandException;
import by.javatr.library.exception.service.ServiceException;
import by.javatr.library.service.UserService;
import by.javatr.library.service.impl.UserServiceImpl;

/**
 *class of giving paper book back by id, implements {@link Command}
 *@author Zakharov Artem
 *@version 1.0
 */
public class GivePaperBookBackByIdCommand implements Command {
    /** field service*/
    private UserService service;
    /** field request*/
    private ConsoleRequest request;
    /** field response*/
    private ConsoleResponse response;

    /**
     * Constructor - makes an object
     * @param requestFromUser request with some information
     */
    public GivePaperBookBackByIdCommand(ConsoleRequest requestFromUser) {
        service = UserServiceImpl.getINSTANCE();
        request = requestFromUser;
    }

    /**
     * Method with UI logic
     * @return text of {@link ConsoleResponse}
     * @throws CommandException if was an error during the getting information
     */
    @Override
    public String execute() throws CommandException {
        int id = Integer.valueOf(request.getParameter("id"));
        try {
            service.givePaperBookBack(id);
            response = new ConsoleResponse("Book is your\'s!");

            return response.getResponse();
        } catch (ServiceException e){
            response = new ConsoleResponse("Invalid id: " + id);
            throw new CommandException(response.getResponse(), e);
        }
    }
}
