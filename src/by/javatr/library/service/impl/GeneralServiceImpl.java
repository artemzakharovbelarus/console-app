package by.javatr.library.service.impl;

import by.javatr.library.bean.user.User;
import by.javatr.library.bean.userstatus.UserStatus;
import by.javatr.library.dao.UserDAO;
import by.javatr.library.dao.impl.UserDAOImpl;
import by.javatr.library.exception.dao.DAOException;
import by.javatr.library.exception.dao.user.InvalidNameOrPasswordException;
import by.javatr.library.exception.dao.user.UsedEmailException;
import by.javatr.library.exception.service.ServiceException;
import by.javatr.library.exception.service.user.InvalidEmailException;
import by.javatr.library.exception.service.user.InvalidPasswordException;
import by.javatr.library.exception.service.user.InvalidUserValuesException;
import by.javatr.library.service.GeneralService;
import by.javatr.library.util.builder.user.UserBuilder;
import by.javatr.library.util.password.PasswordKeeper;
import by.javatr.library.util.validator.UserValuesValidator;

/**
 *Class of general service, implements {@link GeneralService} all methods throws {@link ServiceException}
 *with properties: INSTANCE
 *@author Zakharov Artem
 *@version 1.0
 */
public class GeneralServiceImpl implements GeneralService {
    private static final GeneralServiceImpl INSTANCE = new GeneralServiceImpl();

    private GeneralServiceImpl(){}

    public static GeneralServiceImpl getINSTANCE() {
        return INSTANCE;
    }

    private UserDAO userDAO = UserDAOImpl.getINSTANCE();


    @Override
    public User signInOperation(String name, String password) throws ServiceException {
        if (!UserValuesValidator.validate(name, password)){
            throw new InvalidUserValuesException("Invalid user values!");
        }
        String encoded = PasswordKeeper.generateHash(name, password);
        try{
            return userDAO.getUser(name, encoded);
        } catch (InvalidNameOrPasswordException e){
            throw new InvalidUserValuesException(e);
        } catch (DAOException e){
            throw new ServiceException(e);
        }
    }

    @Override
    public void signUpOperation(String name, String email, UserStatus status, String password, String confirmedPassword)
            throws ServiceException {
        if (!UserValuesValidator.validate(name, email, status, password, confirmedPassword)){
            throw new InvalidUserValuesException("Invalid user values!");
        }
        UserBuilder builder = new UserBuilder();
        User user = builder.setName(name).setEmail(email)
                           .setStatus(status).create();
        String encoded = PasswordKeeper.generateHash(name, password);
        try {
            userDAO.createAccount(user, encoded);
        } catch (UsedEmailException e){
            throw new InvalidEmailException(e);
        } catch (DAOException e){
            throw new ServiceException(e);
        }
    }

    @Override
    public void signOutOperation(String password) throws ServiceException {
//        try {
//            DON'T Know WHAT TO DO??? HOW TO EXIT??
//        } catch (DAOException e){
//            throw new ServiceException(e);
//        }
    }

    @Override
    public void changePassword(int id, String oldPassword, String newPassword, String confirmedNewPassword)
            throws ServiceException {
        if (!UserValuesValidator.validate(oldPassword, newPassword, confirmedNewPassword)){
            throw new InvalidUserValuesException("Invalid user values!");
        }
        try {
            User user = userDAO.getUserById(id);
            String name = user.getName();
            String encodedOldPassword = PasswordKeeper.generateHash(name, oldPassword);
            String encodedNewPassword = PasswordKeeper.generateHash(name, newPassword);
            userDAO.getUser(name, encodedOldPassword);
            userDAO.changePassword(id, encodedNewPassword);
        } catch (InvalidNameOrPasswordException e){
            throw new InvalidPasswordException(e);
        } catch (DAOException e){
            throw new ServiceException(e);
        }
    }


}
