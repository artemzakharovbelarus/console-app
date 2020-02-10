package by.javatr.library.dao;

import by.javatr.library.bean.book.BaseBook;
import by.javatr.library.bean.book.PaperBook;
import by.javatr.library.bean.book.WebBook;
import by.javatr.library.exception.dao.DAOException;

import java.util.List;

/**
 *DAO interface of {@link PaperBook}, all abstract methods throws {@link DAOException}
 *no properties
 *@author Zakharov Artem
 *@version 1.0
 */
public interface BookDAO {

    /**
     * Returns a book from some source file (example: text file, database)
     * according to given parameter (Book id)
     * @param id identifier of book we want to find
     * @return object of {@link PaperBook} or {@link WebBook} with given id
     * @throws DAOException if was an error during the process of getting the information
     */
    BaseBook getBookById(int id) throws DAOException;

    /**
     * Returns a list of books from some source file(example: text file, database)
     * @param bookType type of book (1 - paper, 0 - web)
     * @return list of {@link PaperBook} or {@link WebBook}
     * @throws DAOException if was an error during the process of getting the information
     */
    List<BaseBook> getAllBooks(int bookType) throws DAOException;

    /**
     * Adds new ook to some source file (example: text file, database)
     * @param book object of {@link PaperBook} or {@link WebBook} with hole necessary information
     * @throws DAOException if was an error during the process of getting the information
     */
    void addBook(BaseBook book) throws DAOException;

    /**
     * Takes a book according to id of book from some source
     * file (example: text file, database)
     * @param id identifier of book we want to take
     * @throws DAOException if was an error during the process of taking a book
     */
    void takeBookById(int id) throws DAOException;

    /**
     * Giving paper book back to some source file (example: text file, database)
     * @param id identifier of paper book, we want to give back
     * @throws DAOException if was an error during the process of giving book back
     */
    void giveBookBackById(int id) throws DAOException;

    /**
     * Method of deleting a web book by id
     * @param id identifier of web book
     * @throws DAOException if was an error during the process of deleting web book
     */
    void deleteWebBookById(int id) throws DAOException;

}
