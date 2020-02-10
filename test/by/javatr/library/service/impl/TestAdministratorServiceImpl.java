package by.javatr.library.service.impl;

import by.javatr.library.dao.BookDAO;
import by.javatr.library.dao.UserDAO;
import by.javatr.library.dao.impl.BookDAOImpl;
import by.javatr.library.dao.impl.UserDAOImpl;
import org.junit.BeforeClass;

public class TestAdministratorServiceImpl {

    private AdministratorServiceImpl service = AdministratorServiceImpl.getINSTANCE();
    private BookDAO bookDAO = BookDAOImpl.getINSTANCE();
    private UserDAO userDAO = UserDAOImpl.getINSTANCE();

    @BeforeClass
    public void init() {
        service.setBookDAO(bookDAO);
        service.setUserDAO(userDAO);
    }

    //MOCKITO FRAMEWORK FOR TESTING BUSINESS LOGIC IS NECESSARY
}