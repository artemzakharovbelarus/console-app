package by.javatr.library.controller_command.factory;

import by.javatr.library.console.ConsoleRequest;
import by.javatr.library.controller_command.Command;
import by.javatr.library.controller_command.impl.*;
import by.javatr.library.exception.command.CommandException;
import org.junit.Test;

public class TestCommandFactory {

    private CommandFactory factory = CommandFactory.getINSTANCE();
    private final static ConsoleRequest request = null;
    private Command command;

    @Test(expected = CommandException.class)
    public void createCommand_invalid_commandException() throws CommandException{

        //given
        factory.createCommand("NoSuchCommand", request);
        //then expecting Command exception
    }

    @Test
    public void createCommand_signIn_correct() throws CommandException{

        //given
        command = factory.createCommand("signIn", request);
        //then
        assert(command instanceof SignInCommand);
    }

    @Test
    public void createCommand_signUp_correct() throws CommandException{

        //given
        command = factory.createCommand("signUp", request);
        //then
        assert(command instanceof SignUpCommand);
    }

    @Test
    public void createCommand_addPaperBook_correct() throws CommandException{
        //given
        command = factory.createCommand("addPaperBook", request);
        //then
        assert(command instanceof AddPaperBookCommand);
    }

    @Test
    public void createCommand_addWebBook_correct() throws CommandException{
        //given
        command = factory.createCommand("addWebBook", request);
        //then
        assert(command instanceof AddWebBookCommand);
    }

    @Test
    public void createCommand_ChangePassword_correct() throws CommandException{
        //given
        command = factory.createCommand("changePassword", request);
        //then
        assert(command instanceof ChangePasswordCommand);
    }

    @Test
    public void createCommand_deleteWebBookById_correct() throws CommandException{
        //given
        command = factory.createCommand("deleteWebBookById", request);
        //then
        assert(command instanceof DeleteWebBookByIdCommand);
    }

    @Test
    public void createCommand_getAllBook_correct() throws CommandException{
        //given
        command = factory.createCommand("getAllBooks", request);
        //then
        assert(command instanceof GetAllBooksCommand);
    }

    @Test
    public void createCommand_getAllUsers_correct() throws CommandException{
        //given
        command = factory.createCommand("getAllUsers", request);
        //then
        assert(command instanceof GetAllUsersCommand);
    }

    @Test
    public void createCommand_getBookSorted_correct()throws CommandException{
        //given
        command = factory.createCommand("getBooksSorted", request);
        //then
        assert(command instanceof GetBooksSortedCommand);
    }

    @Test
    public void createCommand_getUserById_correct() throws CommandException{
        //given
        command = factory.createCommand("getUserById", request);
        //then
        assert(command instanceof GetUserByIdCommand);
    }

    @Test
    public void createCommand_getUsersSorted_correct() throws CommandException{
        //given
        command = factory.createCommand("getUsersSorted", request);
        //then
        assert(command instanceof GetUsersSortedCommand);
    }

    @Test
    public void createCommand_givePaperBookBackById_correct() throws CommandException{
        //given
        command = factory.createCommand("givePaperBookBack", request);
        //then
        assert(command instanceof GivePaperBookBackByIdCommand);
    }

    @Test
    public void createCommand_signOut_correct() throws CommandException{
        //given
        command = factory.createCommand("signOut", request);
        //then
        assert(command instanceof SignOutCommand);
    }

    @Test
    public void createCommand_takeBookById_correct() throws CommandException{
        //given
        command = factory.createCommand("takeBookBack", request);
        //then
        assert(command instanceof TakeBookByIdCommand);
    }
}