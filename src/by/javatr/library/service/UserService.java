package by.javatr.library.service;

import by.javatr.library.bean.book.BaseBook;
import by.javatr.library.bean.book.PaperBook;
import by.javatr.library.bean.book.WebBook;
import by.javatr.library.exception.service.ServiceException;

import java.util.List;

/**
 *Interface of user's service, all abstract methods throws {@link ServiceException}
 *no properties
 *@author Zakharov Artem
 *@version 1.0
 */
public interface UserService {

    /**
     * Method of getting information about all books
     * @param bookType type o book (1 - paper, 0 - web)
     * @return list of {@link PaperBook} or {@link WebBook}
     * @throws ServiceException if was an error during the process of getting the information
     */
    List<BaseBook> seeAllBooks(int bookType) throws ServiceException;

    /**
     * Method of taking a book by user
     * @param id identifier of book parameter
     * @throws ServiceException if was an error during the process of getting a book
     */
    void takeBookById(int id) throws ServiceException;

    /**
     * Method of giving a paper book back to the library
     * @param id identifier of paper book
     * @throws ServiceException if was an error during the process of giving back a paper book
     */
    void givePaperBookBack(int id) throws ServiceException;
}
