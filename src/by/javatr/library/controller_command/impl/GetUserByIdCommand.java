package by.javatr.library.controller_command.impl;

import by.javatr.library.bean.user.User;
import by.javatr.library.controller_command.Command;
import by.javatr.library.console.ConsoleRequest;
import by.javatr.library.console.ConsoleResponse;
import by.javatr.library.exception.command.CommandException;
import by.javatr.library.exception.service.ServiceException;
import by.javatr.library.service.AdministratorService;
import by.javatr.library.service.impl.AdministratorServiceImpl;

/**
 *class of getting user information by id, implements{@link Command}
 *@author Zakharov Artem
 *@version 1.0
 */
public class GetUserByIdCommand implements Command {
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
    public GetUserByIdCommand(ConsoleRequest requestFromUser) {
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
        try {
            User user = service.seeUserById(id);
            response = new ConsoleResponse("Your user: \n" + user.toString());

            return response.getResponse();
        } catch (ServiceException e){
            response = new ConsoleResponse("User with id: " + id + " was not found in base!");
            throw new CommandException(response.getResponse(), e);
        }
    }
}
