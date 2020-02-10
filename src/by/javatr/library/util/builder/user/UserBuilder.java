package by.javatr.library.util.builder.user;

import by.javatr.library.bean.user.User;
import by.javatr.library.bean.userstatus.UserStatus;

/**
 *Class builder of objects of {@link User} with properties:
 *<b>id</b>
 *<b>name</b>
 *<b>email</b>
 *<b>status</b>
 *@author Zakharov Artem
 *@version 1.0
 */
public class UserBuilder {

    /** field id*/
    private int id;
    /** field name*/
    private String name;
    /** field email*/
    private String email;
    /** field status*/
    private UserStatus status;

    /**
     * Default constructor - creating new object
     * @see UserBuilder#UserBuilder()
     */
    public UserBuilder(){}

    /**
     * Constructor - creating new object
     * @param idFromDeveloper - id
     * @see UserBuilder#UserBuilder(int)
     */
    public UserBuilder(int idFromDeveloper) {
        id = idFromDeveloper;
    }

    /**
     * Method of getting the value of the field {@link UserBuilder#id}
     * @return simple "int" type
     */
    public int getId() {
        return id;
    }

    /**
     * Method of setting id to user
     * @param idFromDeveloper identifier of user
     * @return object of {@link UserBuilder}
     */
    public UserBuilder setId(int idFromDeveloper) {
        id = idFromDeveloper;
        return this;
    }

    /**
     * Method of setting the value to the field {@link UserBuilder#name}
     * @param nameFromDeveloper - name
     * @return {@link UserBuilder} object - current builder of {@link User}
     */
    public UserBuilder setName(String nameFromDeveloper) {
        name = nameFromDeveloper;
        return this;
    }

    /**
     * Method of getting the value of the field {@link UserBuilder}
     * @return {@link String} object
     */
    public String getName() {
        return name;
    }

    /**
     * Method of setting the value to the field {@link UserBuilder#email}
     * @param emailFromDeveloper - email
     * @return {@link UserBuilder} object - current builder of {@link User}
     */
    public UserBuilder setEmail(String emailFromDeveloper){
        email = emailFromDeveloper;
        return this;
    }

    /**
     * Method of getting the value of the field {@link UserBuilder#email}
     * @return {@link String} object
     */
    public String getEmail() {
        return email;
    }

    /**
     * Method of setting the value to the field {@link UserBuilder#status}
     * @param statusFromDeveloper - status
     * @return {@link UserBuilder} object - current builder of {@link User};
     */
    public UserBuilder setStatus(UserStatus statusFromDeveloper){
        status = statusFromDeveloper;
        return this;
    }

    /**
     * Method of getting the value of the field {@link UserBuilder#email}
     * @return {@link String} object
     */
    public UserStatus getStatus() {
        return status;
    }

    /**
     * We are building and returning an object of {@link User} with parameters:
     * (id, name, email, status)
     * @return {@link User} object with the information
     */
    public User create(){
        User user = new User(id);
        user.setName(name);
        user.setEmail(email);
        user.setStatus(status);

        return user;
    }
}
