package by.javatr.library.controller_command.impl;

import by.javatr.library.controller_command.Command;
import by.javatr.library.console.ConsoleRequest;
import by.javatr.library.console.ConsoleResponse;
import by.javatr.library.exception.command.CommandException;
import by.javatr.library.exception.service.ServiceException;
import by.javatr.library.service.GeneralService;
import by.javatr.library.service.impl.GeneralServiceImpl;

/**
 *class of changing password, implements{@link Command}
 *@author Zakharov Artem
 *@version 1.0
 */
public class ChangePasswordCommand implements Command {
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
    public ChangePasswordCommand(ConsoleRequest requestFromUser) {
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

        int id = Integer.parseInt(request.getParameter("id"));
        String oldPassword = request.getParameter("oldPassword");
        String newPassword = request.getParameter("newPassword");
        String confirmedPassword = request.getParameter("confirmedPassword");
        try {
            service.changePassword(id, oldPassword, newPassword, confirmedPassword);
            response = new ConsoleResponse("Password was changed successful");

            return response.getResponse();
        } catch (ServiceException e){
            response = new ConsoleResponse("Password was not changed!");
            throw new CommandException(response.getResponse(), e);
        }
    }
}
