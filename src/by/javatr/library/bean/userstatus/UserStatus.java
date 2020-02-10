package by.javatr.library.bean.userstatus;

import by.javatr.library.bean.Entity;

/**
 *Enum of user's statuses that implements {@link Entity} with properties:
 *<b>statusId</b>
 *@author Zakharov Artem
 *@version 2.0
 */
public enum UserStatus implements Entity{

    /** object "ADMINISTRATOR(1)" */
    ADMINISTRATOR(1),
    /** object READER(2) */
    READER(2);

    /** field statusId */
    private int statusId;

    /**
     * Constructor - creating new object with parameters
     * @param statusIdFromDeveloper - statusId
     */
    UserStatus(int statusIdFromDeveloper) {
        statusId = statusIdFromDeveloper;
    }

    /**
     * Method of getting the value of the field {@link UserStatus#statusId}
     * @return simple "int" type
     */
    public int getStatusId() {
        return statusId;
    }

    /**
     * Method that convert all fields to {@link String} type
     * @return {@link String} object
     */
    @Override
    public String toString() {
        return  getClass().getName() + "@" + "\nUserStatus " +
                "statusId: " + statusId;
    }
}
