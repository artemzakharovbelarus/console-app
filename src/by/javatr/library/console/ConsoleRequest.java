package by.javatr.library.console;

import by.javatr.library.bean.userstatus.UserStatus;
import by.javatr.library.exception.console.ConsoleRequestException;

/**
 * class of console request
 * <b>title</b>
 * <b>author</b>
 * <b>publishingDate</b>
 * <b>bookAmount</b>
 * <b>resource</b>
 * <b>price</b>
 * <b>userName</b>
 * <b>email</b>
 * <b>status</b>
 * <b>password</b>
 * <b>newPassword</b>
 * <b>confirmedPassword</b>
 * <b>id</b>
 * <b>sortParameter</b>
 * <b>sortType</b>
 * <b>bookType</b>
 * <b>flag</b>
 *@author Zakharov Artem
 *@version 1.0
 */
public class ConsoleRequest {
    /**
     * General fields that can come to the constructor of class
     */
    private String title;
    private String author;
    private int publishingDate;
    private int bookAmount;
    private String resource;
    private int price;
    private String userName;
    private String email;
    private UserStatus status;
    private String password;
    private String newPassword;
    private String confirmedPassword;
    private int id;
    private String sortParameter;
    private int sortType;
    private int bookType;
    private String flag;
    //private final String nullRequest = "null request";

    /**
     * All this constructors are made for initializing object {@link ConsoleRequest}
     */
    public ConsoleRequest(){}

    public ConsoleRequest(String titleFromAdmin, String authorFromAdmin, int publishingDateFromAdmin,
                          int priceFromAdmin, String resourceFromAdmin){
        title = titleFromAdmin;
        author = authorFromAdmin;
        publishingDate = publishingDateFromAdmin;
        price = priceFromAdmin;
        resource = resourceFromAdmin;
    }

    public ConsoleRequest(String titleFromAdmin, String authorFromAdmin, int publishingDateFromAdmin,
                          int bookAmountFromAdmin){
        title = titleFromAdmin;
        author = authorFromAdmin;
        publishingDate = publishingDateFromAdmin;
        bookAmount = bookAmountFromAdmin;
    }

    public ConsoleRequest(int idFromUser, String flagFromDeveloper){
        id = idFromUser;
        flag = flagFromDeveloper;
    }

    public ConsoleRequest(int bookTypeFromUser) {
        bookType = bookTypeFromUser;
    }

    public ConsoleRequest(String sortParameterFromUser, int sortTypeFromUser) {
        sortParameter = sortParameterFromUser;
        sortType = sortTypeFromUser;
    }

    public ConsoleRequest(int idFromUser, String passwordFromUser, String newPasswordFromUser,
                          String confirmedPasswordFromUser) {
        id = idFromUser;
        password = passwordFromUser;
        newPassword = newPasswordFromUser;
        confirmedPassword = confirmedPasswordFromUser;
    }

    public ConsoleRequest(String password) {
        this.password = password;
    }

    public ConsoleRequest(String userNameFromUser, String passwordFromUser) {
        userName = userNameFromUser;
        password = passwordFromUser;
    }

    public ConsoleRequest(String userNameFromUser, String emailFromUser, UserStatus statusFromUser,
                          String passwordFromUser, String confirmedPasswordFromUser) {
        userName = userNameFromUser;
        email = emailFromUser;
        status = statusFromUser;
        password = passwordFromUser;
        confirmedPassword = confirmedPasswordFromUser;
    }

    /**
     * Method that return parameter of some information
     * @param parameter parameter name from developer
     * @return text value output
     * @throws ConsoleRequestException if was an error during the getting information
     */
    public String getParameter(String parameter) throws ConsoleRequestException{
        String result = null;
        parameter = parameter.toUpperCase();
        switch (parameter){
            case "USERNAME":
                result = getUserName();
                break;
            case "EMAIL":
                result = getEmail();
                break;
            case "PASSWORD":
                result = getPassword();
            case "CONFIRMEDPASSWORD":
                result = getConfirmedPassword();
                break;
            case "NEWPASSWORD":
                result = getNewPassword();
                break;
            case "WRITE_ID":
                result = String.valueOf(getId());
                break;
            case "SORTPARAMETER":
                result = getSortParameter();
                break;
            case "SORTTYPE":
                result = String.valueOf(getSortType());
                break;
            case "BOOKTYPE":
                result = String.valueOf(getBookType());
                break;
            case "FLAG":
                result = getFlag();
                break;
            case "PRICE":
                result = String.valueOf(getPrice());
                break;
            case "AMOUNT":
                result = String.valueOf(getBookAmount());
                    break;
            case "TITLE":
                result = getTitle();
                break;
            case "AUTHOR":
                result = getAuthor();
                break;
            case "DATE":
                result = String.valueOf(getPublishingDate());
                break;
            case "RESOURCE":
                result = getResource();
                break;
        }
        if (result == null){
            throw new ConsoleRequestException("Invalid parameter name!");
        }
        return result;
    }

    /**
     * All private (get)methods for method getParameter(String parameter);
     */
    private String getResource() {
        return resource;
    }

    private int getPublishingDate() {
        return publishingDate;
    }

    private String getAuthor() {
        return author;
    }

    private String getTitle() {
        return title;
    }

    private int getBookAmount() {
        return bookAmount;
    }

    private int getPrice() {
        return price;
    }

    private String getUserName() {
        return userName;
    }

    private String getPassword() {
        return password;
    }

    private String getEmail() {
        return email;
    }

    private String getConfirmedPassword() {
        return confirmedPassword;
    }

    private UserStatus getStatus() {
        return status;
    }

    private String getNewPassword() {
        return newPassword;
    }

    private int getId() {
        return id;
    }

    private String getSortParameter() {
        return sortParameter;
    }

    private int getSortType() {
        return sortType;
    }

    private int getBookType() {
        return bookType;
    }

    private String getFlag() {
        return flag;
    }
}
