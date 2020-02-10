package by.javatr.library.service;

import by.javatr.library.bean.book.BaseBook;
import by.javatr.library.bean.book.PaperBook;
import by.javatr.library.bean.book.WebBook;
import by.javatr.library.bean.user.User;
import by.javatr.library.exception.service.ServiceException;

import java.util.List;

/**
 *Interface of admin's service, all abstract methods throws {@link ServiceException}
 *no properties
 *@author Zakharov Artem
 *@version 1.0
 */
public interface AdministratorService {

    /**
     * Method of getting information about all users
     * @return list of {@link User}
     * @throws ServiceException if was an error during the process of getting the information
     */
    List<User> seeAllUsers() throws ServiceException;

    /**
     * Method of getting information about user with given id
     * @param id identifier of user
     * @return object of {@link User} with given id
     * @throws ServiceException if was an error during the process of getting the information
     */
    User seeUserById(int id) throws ServiceException;

    /**
     * Method of getting information about all users and sorted in accordance with given parameter of sorting
     * @param sortParameter sorting parameter (example: id, name)
     * @param sortType sorting type (means ascending or descending)
     * @return sorted list of {@link User}
     * @throws ServiceException if was an error during the process of getting the information
     */
    List<User> seeAllUsersSorted(String sortParameter, int sortType) throws ServiceException;

    /**
     * Method of adding a new paper book
     * @param title title of new paper book
     * @param author author of new paper book
     * @param dateOfPublishing publishing date of new paper book
     * @param bookAmount amount of examples of new paper book
     * @throws ServiceException if was an error during the process of adding new paper book
     */
    void addBook(String title, String author, int dateOfPublishing, int bookAmount)
            throws ServiceException;

    /**
     * Method of adding a new paper book
     * @param title title of new paper book
     * @param author author of new paper book
     * @param publishingDate date of publishing
     * @param price price of book
     * @param source web source of book
     * @throws ServiceException if was an error during the process of adding new paper book
     */
    void addBook(String title, String author, int publishingDate, int price, String source)
            throws ServiceException;

    /**
     * Method of deleting a web book by id
     * @param id identifier of web book, we want to delete
     * @throws ServiceException if was an error during the process of deleting a web book
     */
    void deleteWebBook(int id)throws ServiceException;

    /**
     * Method of getting information about all books
     * @param bookType type of book (1 - paper, 0 - web)
     * @return list of {@link PaperBook} or {@link WebBook}
     * @throws ServiceException if was an error during the process of getting the information
     */
    List<BaseBook> seeAllBooks(int bookType) throws ServiceException;

}
