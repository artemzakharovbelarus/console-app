package by.javatr.library.controller_command.impl;

import by.javatr.library.controller_command.Command;
import by.javatr.library.console.ConsoleRequest;
import by.javatr.library.console.ConsoleResponse;
import by.javatr.library.exception.command.CommandException;
import by.javatr.library.exception.service.ServiceException;
import by.javatr.library.service.AdministratorService;
import by.javatr.library.service.impl.AdministratorServiceImpl;

/**
 *class of adding paper book, implements {@link Command}
 *@author Zakharov Artem
 *@version 1.0
 */
public class AddPaperBookCommand implements Command {
    /** field request*/
    private ConsoleRequest request;
    /** field service*/
    private AdministratorService service;
    /** field response*/
    private ConsoleResponse response;

    /**
     * Constructor - makes an object
     * @param requestFromUser request with some information
     */
    public AddPaperBookCommand(ConsoleRequest requestFromUser){
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
        int date = Integer.valueOf(request.getParameter("date"));
        int amount = Integer.valueOf(request.getParameter("amount"));

        try {
            service.addBook(title, author, date, amount);
            response = new ConsoleResponse("Book was added to the list!");

            return response.getResponse();
        } catch (ServiceException e){
            response = new ConsoleResponse("Book was not added to the list!");
            throw new CommandException(response.getResponse(), e);
        }
    }
}
