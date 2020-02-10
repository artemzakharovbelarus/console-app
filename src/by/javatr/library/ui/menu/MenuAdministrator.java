package by.javatr.library.ui.menu;

import by.javatr.library.controller_command.Command;
import by.javatr.library.console.ConsoleRequest;
import by.javatr.library.console.ConsoleResponse;
import by.javatr.library.controller_command.impl.*;
import by.javatr.library.exception.command.CommandException;
import by.javatr.library.exception.ui.*;
import by.javatr.library.exception.ui.InvalidBooksOperationException;
import by.javatr.library.exception.ui.InvalidChosenLibraryException;
import by.javatr.library.exception.ui.InvalidLibraryOperationException;
import by.javatr.library.exception.ui.InvalidUsersOperationException;
import by.javatr.library.util.scanner.DataScanner;

public class MenuAdministrator implements MenuConfiguration {
    private static final MenuAdministrator INSTANCE = new MenuAdministrator();

    private MenuAdministrator(){}

    public static MenuAdministrator getINSTANCE() {
        return INSTANCE;
    }

    private int operation;
    private Command command;
    private ConsoleRequest request;
    private ConsoleResponse response;
    private final static String flag = "flag";

    @Override
    public void configuration() throws UserInterfaceException{
        int choseLibrary = chosenLibrary();
        switch (choseLibrary){
            case 1:
                int booksOrUsersWeb = choiceBooksOrUsers();
                switch (booksOrUsersWeb){
                    case 1:
                        int seeWebBooks = seeBooks();
                        switch (seeWebBooks){
                            case 1:
                                int bookType = 1;
                                outputAllBooks(bookType);

                                int deleteOrAdd = deleteOrAddChoice();
                                switch (deleteOrAddChoice()){
                                    case 1:
                                        deleteWebBookById();
                                        break;
                                    case 2:
                                        addWebBook();
                                        break;
                                }
                                break;
                            case 2:
                                //get book by id
                                break;
                            case 3:
                                //get books sorted
                                break;
                                default:
                                    throw new InvalidBooksOperationException("Book operation was not found!");
                        }
                        break;
                    case 2:
                        int choice = choiceOfStep2();
                        switch (choice){
                            case 1:
                                changePassword();
                                break;
                            case 2:
                                seeAllUsers();
                                break;
                            case 3:
                                seeUserById();
                            case 4:
                                seeUsersSorted();
                                break;
                                default:
                                    throw new InvalidUsersOperationException("User operation was not found!");
                        }
                        break;
                        default:
                            throw new InvalidLibraryOperationException("Books and users were not chosen!");
                }
                break;
            case 2:
                int booksOrUsersReal = choiceBooksOrUsers();
                switch (booksOrUsersReal){
                    case 1:
                        int seeRealBooks = seeBooks();
                        switch (seeRealBooks){
                            case 1:
                                int bookType = 0;
                                outputAllBooks(bookType);

                                int addChoice = addChoice();
                                if (addChoice == 2){
                                    addPaperBook();
                                }
                                break;
                            case 2:
                                //get book by id
                                break;
                            case 3:
                                //get book sorted
                                break;
                                default:
                            throw new InvalidBooksOperationException("Book operation was not found!");
                        }
                        break;
                    case 2:
                        int choice = choiceOfStep2();
                        switch (choice){
                            case 1:
                                changePassword();
                                break;
                            case 2:
                                seeAllUsers();
                                break;
                            case 3:
                                seeUserById();
                            case 4:
                                seeUsersSorted();
                                break;
                            default:
                                throw new InvalidUsersOperationException("User operation was not found!");
                        }
                        break;
                        default:
                            throw new InvalidLibraryOperationException("Books and users were not chosen!");
                }
                break;
                default:
                    throw new InvalidChosenLibraryException("Not found library command!");
        }
    }
    private void seeUsersSorted() throws UserInterfaceException{
        System.out.println(MenuPhrases.WRITE_PARAMETER);
        String parameterSort = DataScanner.textFromConsole();
        System.out.println(MenuPhrases.WRITE_SORT_TYPE);
        int typeSort = DataScanner.integerFromConsole();

        try{
            request = new ConsoleRequest(parameterSort, typeSort);
            command = new GetUsersSortedCommand(request);

            System.out.println(command.execute());
        } catch (CommandException e){
            throw new UserInterfaceException(e);
        }
    }

    private void seeUserById() throws UserInterfaceException{
        System.out.println(MenuPhrases.WRITE_USER_ID);
        int id = DataScanner.integerFromConsole();
        try{
            request = new ConsoleRequest(id, flag);
            command = new GetUserByIdCommand(request);

            System.out.println(command.execute());
        } catch (CommandException e){
            throw new UserInterfaceException(e);
        }
    }

    private void seeAllUsers() throws UserInterfaceException{
        try{
            request = new ConsoleRequest();
            command = new GetAllUsersCommand(request);

            System.out.println(command.execute());
        } catch (CommandException e){
            throw new UserInterfaceException(e);
        }
    }

    private void changePassword() throws UserInterfaceException{
        System.out.println(MenuPhrases.WRITE_USER_ID);
        int id = DataScanner.integerFromConsole();
        System.out.println(MenuPhrases.WRITE_OLD_PASSWORD);
        String oldPassword = DataScanner.textFromConsole();
        System.out.println(MenuPhrases.WRITE_NEW_PASSWORD);
        String newPassword = DataScanner.textFromConsole();
        System.out.println(MenuPhrases.WRITE_CONFIRMED_PASSWORD);
        String confirmedPassword = DataScanner.textFromConsole();

        try{
            request = new ConsoleRequest(id, oldPassword, newPassword, confirmedPassword);
            command = new ChangePasswordCommand(request);

            System.out.println(command.execute());
        } catch (CommandException e){
            throw new UserInterfaceException(e);
        }
    }

    private int choiceOfStep2(){
        System.out.println(MenuPhrases.CHANGE_PASSWORD.getText() + MenuPhrases.SEE_USERS.getText()
        + MenuPhrases.SEE_USER_BY_ID.getText() + MenuPhrases.SEE_USERS_SORTED.getText());
        operation = DataScanner.integerFromConsole();

        return operation;
    }

    private void addPaperBook() throws UserInterfaceException{
        System.out.println(MenuPhrases.WRITE_TITLE);
        String title = DataScanner.textFromConsole();
        System.out.println(MenuPhrases.WRITE_AUTHOR);
        String author = DataScanner.textFromConsole();
        System.out.println(MenuPhrases.WRITE_PUBLISHING);
        int date = DataScanner.integerFromConsole();
        System.out.println(MenuPhrases.WRITE_AMOUNT);
        int amount = DataScanner.integerFromConsole();

        try{
            request = new ConsoleRequest(title, author, date, amount);
            command = new AddPaperBookCommand(request);

            System.out.println(command.execute());
        } catch (CommandException e){
            throw new UserInterfaceException(e);
        }
    }

    private int addChoice(){
        System.out.println(MenuPhrases.ADD.getText());
        int operation = 2;

        return operation;
    }

    private void exit() throws UserInterfaceException{
        System.out.println(MenuPhrases.WRITE_PASSWORD);
        String password = DataScanner.textFromConsole();
        try {
            request = new ConsoleRequest(password);
            command = new SignOutCommand(request);

            System.out.println(command.execute());
        } catch (CommandException e){
            throw new UserInterfaceException(e);
        }
    }

    private void addWebBook() throws UserInterfaceException{
        System.out.println(MenuPhrases.WRITE_TITLE);
        String title = DataScanner.textFromConsole();
        System.out.println(MenuPhrases.WRITE_AUTHOR);
        String author = DataScanner.textFromConsole();
        System.out.println(MenuPhrases.WRITE_PUBLISHING);
        int date = DataScanner.integerFromConsole();
        System.out.println(MenuPhrases.WRITE_PRICE);
        int price = DataScanner.integerFromConsole();
        System.out.println(MenuPhrases.WRITE_RESOURCE);
        String resource = DataScanner.textFromConsole();

        try{
            request = new ConsoleRequest(title, author, date, price, resource);
            command = new AddWebBookCommand(request);

            System.out.println(command.execute());
        } catch (CommandException e){
            throw new UserInterfaceException(e);
        }
    }

    private void deleteWebBookById() throws UserInterfaceException{
        System.out.println(MenuPhrases.WRITE_ID.getText());
        int id = DataScanner.integerFromConsole();
        try {
            request = new ConsoleRequest(id, flag);
            command = new DeleteWebBookByIdCommand(request);

            System.out.println(command.execute());
        } catch (CommandException e){
            throw new UserInterfaceException(e);
        }
    }

    private int choiceBooksOrUsers(){
        System.out.println(MenuPhrases.WORK_WITH_BOOKS.getText() + MenuPhrases.WORK_WITH_USERS);
        operation = DataScanner.integerFromConsole();

        return operation;
    }

    private int chosenLibrary(){
        System.out.println(MenuPhrases.WEB_LIBRARY.getText() + MenuPhrases.REAL_LIBRARY);
        operation = DataScanner.integerFromConsole();

        return operation;
    }

    private int seeBooks(){
        System.out.println(MenuPhrases.SEE_BOOKS.getText() + MenuPhrases.SEE_BOOK_BY_ID.getText()
        + MenuPhrases.SEE_BOOKS_SORTED_BY.getText());
        operation = DataScanner.integerFromConsole();

        return operation;
    }

    private int deleteOrAddChoice(){
        System.out.println(MenuPhrases.DELETE.getText() + MenuPhrases.ADD.getText());
        operation = DataScanner.integerFromConsole();

        return operation;
    }

    private void outputAllBooks(int bookType) throws UserInterfaceException{
        try {
            request = new ConsoleRequest(bookType);
            command = new GetAllBooksCommand(request);

            System.out.println(command.execute());
        } catch (CommandException e){
            throw new UserInterfaceException(e);
        }
    }

//    private void outputBookById(){
//        System.out.println(MenuPhrases.WRITE_ID);
//        int id = DataScanner.integerFromConsole();
//        String flag = "flag";
//        try{
//            request = new ConsoleRequest(id, flag);
//            command = new
//        }
//    }

    private void outputBooksSorted(){
        System.out.println(MenuPhrases.WRITE_PARAMETER);
        String parameter = DataScanner.textFromConsole();
        int sortType = DataScanner.integerFromConsole();

        //write method in service and dao, command
    }
}
