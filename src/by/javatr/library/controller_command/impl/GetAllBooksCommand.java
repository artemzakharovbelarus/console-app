package by.javatr.library.controller_command.impl;

import by.javatr.library.bean.book.BaseBook;
import by.javatr.library.controller_command.Command;
import by.javatr.library.console.ConsoleRequest;
import by.javatr.library.console.ConsoleResponse;
import by.javatr.library.exception.command.CommandException;
import by.javatr.library.exception.service.ServiceException;
import by.javatr.library.service.AdministratorService;
import by.javatr.library.service.impl.AdministratorServiceImpl;

import java.util.List;

/**
 *class of getting all information about books, implements{@link Command}
 *@author Zakharov Artem
 *@version 1.0
 */
public class GetAllBooksCommand implements Command {
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
    public GetAllBooksCommand(ConsoleRequest requestFromUser) {
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
        int bookType = Integer.valueOf(request.getParameter("bookType"));
        try {
            List<BaseBook> books = service.seeAllBooks(bookType);
            response = new ConsoleResponse(books.toString());
        } catch (ServiceException e){
            throw new CommandException(e);
        }
        return response.getResponse();
    }
}
