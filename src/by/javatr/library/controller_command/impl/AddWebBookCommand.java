package by.javatr.library.controller_command.impl;

import by.javatr.library.controller_command.Command;
import by.javatr.library.console.ConsoleRequest;
import by.javatr.library.console.ConsoleResponse;
import by.javatr.library.exception.command.CommandException;
import by.javatr.library.exception.service.ServiceException;
import by.javatr.library.service.AdministratorService;
import by.javatr.library.service.impl.AdministratorServiceImpl;

/**
 *class of adding web book, implements {@link Command}
 *@author Zakharov Artem
 *@version 1.0
 */
public class AddWebBookCommand implements Command {
    /** field request*/
    private ConsoleRequest request;
    /** field response*/
    private ConsoleResponse response;
    /** field service*/
    private AdministratorService service;

    /**
     * Constructor - makes an object
     * @param requestFromUser request with some information
     */
    public AddWebBookCommand(ConsoleRequest requestFromUser){
        request = requestFromUser;
        service = AdministratorServiceImpl.getINSTANCE();
    }

    /**
     * Method with UI logic
     * @return text of {@link ConsoleResponse}
     * @throws CommandException if was an error during the getting information
     */
    @Override
    public String execute() throws CommandException {
        String title = request.getParameter("title");
        String author = request.getParameter("author");
        int publishingDate = Integer.valueOf(request.getParameter("date"));
        int price = Integer.valueOf(request.getParameter("price"));
        String resource = request.getParameter("resource");
        try {
            service.addBook(title, author, publishingDate, price, resource);
            response = new ConsoleResponse("Book was added to the library!");

            return response.getResponse();
        } catch (ServiceException e){
            response = new ConsoleResponse("Book wasn't added to the library!");
            throw new CommandException(response.getResponse(), e);
        }
    }
}
