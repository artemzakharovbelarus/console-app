package by.javatr.library.controller_command.impl;

import by.javatr.library.controller_command.Command;
import by.javatr.library.console.ConsoleRequest;
import by.javatr.library.console.ConsoleResponse;
import by.javatr.library.exception.command.CommandException;
import by.javatr.library.exception.service.ServiceException;
import by.javatr.library.service.AdministratorService;
import by.javatr.library.service.impl.AdministratorServiceImpl;

/**
 *class of deleting web book by id, implements{@link Command}
 *@author Zakharov Artem
 *@version 1.0
 */
public class DeleteWebBookByIdCommand implements Command {
    /** field service*/
    private AdministratorService service;
    /** field request*/
    private ConsoleRequest request;
    /** field response*/
    private ConsoleResponse response;

    /**
     * Constructor - makes an object
     * @param requestFromUser request with some information
     */
    public DeleteWebBookByIdCommand(ConsoleRequest requestFromUser) {
        service = AdministratorServiceImpl.getINSTANCE();
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
        String flag = request.getParameter("flag");
        try {
            service.deleteWebBook(id);
            response = new ConsoleResponse("Web book with" + id + " was deleted");
        } catch (ServiceException e){
            throw new CommandException(e);
        }
        return response.getResponse();
    }
}
