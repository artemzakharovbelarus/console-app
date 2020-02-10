package by.javatr.library.service;

import by.javatr.library.bean.user.User;
import by.javatr.library.bean.userstatus.UserStatus;
import by.javatr.library.exception.service.ServiceException;

/**
 *Interface of general operations, all abstract methods throws {@link ServiceException}
 *no properties
 *@author Zakharov Artem
 *@version 1.0
 */
public interface GeneralService {

    /**
     * Method of signing user or administrator into system
     * @param name parameter of {@link User}
     * @param password password of {@link User}
     * @return object of {@link User} with information about logged in user or administrator
     * @throws ServiceException if was an error during the process of getting the information
     */
    User signInOperation(String name, String password) throws ServiceException;

    /**
     * Method of signing up a user or administrator into system
     * @param name name of {@link User}
     * @param email email of {@link User}
     * @param status status of user
     * @param password password of {@link User}
     * @param confirmedPassword confirming a password of {@link User}
     * @throws ServiceException if was an error during the process of getting the information
     */
    void signUpOperation(String name, String email, UserStatus status, String password, String confirmedPassword)
            throws ServiceException;

    /**
     * Method of signing out from system
     * @param password parameter of {@link User} - "write password if you are sure that you want to exit from system"
     * @throws ServiceException if was an error during the process of signing out
     */
    void signOutOperation(String password) throws ServiceException;

    /**
     * Method of changing a password of {@link User}
     * @param id identifier of user
     * @param oldPassword old password
     * @param newPassword new password
     * @param confirmedNewPassword confirming a new password
     * @throws ServiceException if was an error during the process of changing a password
     */
    void changePassword(int id,String oldPassword, String newPassword, String confirmedNewPassword)
            throws ServiceException;
}
