package by.javatr.library.controller_command.impl;

import by.javatr.library.controller_command.Command;
import by.javatr.library.console.ConsoleRequest;
import by.javatr.library.console.ConsoleResponse;
import by.javatr.library.exception.command.CommandException;
import by.javatr.library.service.AdministratorService;
import by.javatr.library.service.impl.AdministratorServiceImpl;

/**
 *class of getting all sorted information about books, implements{@link Command}
 *@author Zakharov Artem
 *@version 1.0
 */
public class GetBooksSortedCommand implements Command {
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
    public GetBooksSortedCommand(ConsoleRequest requestFromUser) {
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
//        String sortParameter = request.getParameter("sortParameter");
//        int sortType = Integer.parseInt(request.getParameter("sortType"));
//        try {
//            List<BaseBook> books;//write command in service and dao
//        } catch (ServiceException e){
//            throw new CommandException(e);
//        }
//        return response.getResponse();
        return null;
    }
}
