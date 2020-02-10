package by.javatr.library.dao;

import by.javatr.library.bean.user.User;
import by.javatr.library.exception.dao.DAOException;

import java.util.List;

/**
 *DAO interface of {@link User}, all abstract methods throws {@link DAOException}
 *no properties
 *@author Zakharov Artem
 *@version 1.0
 */
public interface UserDAO {

    /**
     * Method of getting all users and their information
     * @return list of {@link User}
     * @throws DAOException if was an error during the process of getting the information
     */
    List<User> seeAllUsers() throws DAOException;

    /**
     * Method of getting an object of {@link User} with given id
     * @param id identifier of object
     * @return object of {@link User}
     * @throws DAOException if was an error during the process of getting the information
     */
    User getUserById(int id) throws DAOException;

    /**
     * Method of getting a sorted list of users by given parameter and sort type
     * @param sortParameter parameter of sorting
     * @param sortType ascending or descending
     * @return list of {@link User}
     * @throws DAOException if was an error during the process of getting the information
     */
    List<User> seeAllUsersSorted(String sortParameter, int sortType) throws DAOException;

    /**
     * Method of deleting a user by id
     * @param id identifier of user
     * @throws DAOException if was an error during the process of getting the information
     */
    void deleteUserById(int id) throws DAOException;

    /**
     * Method of creating account of new user
     * @param user object of {@link User}
     * @param encoded password
     * @throws DAOException if was an error during the process of getting the information
     */
    void createAccount(User user, String encoded) throws DAOException;

    /**
     * Method that returns an object of {@link User} from some source file (example: text file, database)
     * @param name name of {@link User}
     * @param encoded password
     * @return object of {@link User}
     * @throws DAOException if was an error during the process of getting the information
     */
    User getUser(String name, String encoded) throws DAOException;

    /**
     * Method of changing old password to a new one
     * @param id identifier of user
     * @param encodedNewPassword new password
     * @throws DAOException if was an error during the process of setting the information
     */
    void changePassword(int id, String encodedNewPassword) throws DAOException;
}
