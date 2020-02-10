package by.javatr.library.util.builder.book;

import by.javatr.library.bean.book.BaseBook;

/**
 *Abstract Class builder that will not create objects of {@link BaseBook} with properties:
 *<b>id</b>
 *<b>title</b>
 *<b>author</b>
 *<b>dateOfPublishing</b>
 *@author Zakharov Artem
 *@version 1.0
 */
public abstract class BaseBookBuilder {

    /** field id*/
    private int id;
    /** field title*/
    private String title;
    /** field author*/
    private String author;
    /** field dateOfPublishing*/
    private int dateOfPublishing;

    /**
     * Default constructor - declaring new object
     */
    public BaseBookBuilder(){}

    /**
     * Constructor - creating new Object
     * @param idFromDeveloper - id
     * @see BaseBookBuilder#BaseBookBuilder(int)
     */
    public BaseBookBuilder(int idFromDeveloper){
        setId(idFromDeveloper);
    }

    /**
     * Method of setting the value to the field {@link BaseBookBuilder#id}
     * @param idFromDeveloper - id
     * @return {@link BaseBookBuilder} object
     */
    public BaseBookBuilder setId(int idFromDeveloper){
        id = idFromDeveloper;
        return this;
    }

    /**
     * Method of getting the value of the field {@link BaseBookBuilder#id}
     * @return simple "int" type
     */
    public int getId() {
        return id;
    }

    /**
     * Method of setting the value to the field {@link BaseBookBuilder#title}
     * @param titleFromDeveloper - title
     * @return {@link BaseBookBuilder} object
     */
    public BaseBookBuilder setTitle(String titleFromDeveloper){
        title = titleFromDeveloper;
        return this;
    }

    /**
     * Method of getting the value of the field {@link BaseBookBuilder#title}
     * @return {@link String} object
     */
    public String getTitle() {
        return title;
    }

    /**
     * Method of setting the value to the field {@link BaseBookBuilder#author}
     * @param authorFromDeveloper - author
     * @return {@link BaseBookBuilder} object
     */
    public BaseBookBuilder setAuthor(String authorFromDeveloper){
        author = authorFromDeveloper;
        return this;
    }

    /**
     * Method of getting the value of the field {@link BaseBookBuilder#author}
     * @return {@link String} object
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Method of setting the value to the field {@link BaseBookBuilder#dateOfPublishing}
     * @param dateOfPublishingFromDeveloper - dateOfPublishing
     * @return {@link BaseBookBuilder} object
     */
    public BaseBookBuilder setDateOfPublishing(int dateOfPublishingFromDeveloper){
        dateOfPublishing = dateOfPublishingFromDeveloper;
        return this;
    }

    /**
     * Method of getting the value of the field {@link BaseBookBuilder#dateOfPublishing}
     * @return simple "int" type
     */
    public int getDateOfPublishing() {
        return dateOfPublishing;
    }

    /**
     * We are building and returning an object of {@link BaseBook} with parameters:
     * (id, title, author, dateOfPublishing)
     * @return {@link BaseBook} object with the information
     */
    public BaseBook create(){
        BaseBook baseBook = null;
        baseBook.setId(id);
        baseBook.setTitle(title);
        baseBook.setAuthor(author);
        baseBook.setDateOfPublishing(dateOfPublishing);

        return baseBook;
    }
}
