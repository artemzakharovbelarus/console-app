package by.javatr.library.bean.book;

import by.javatr.library.bean.Entity;
import by.javatr.library.util.generator.IdGenerator;


/**
 *Abstract class of books that implements {@link Entity} with properties:
 *<b>id</b>
 *<b>title</b>
 *<b>author</b>
 *<b>dateOfPublishing</b>
 *@author Zakharov Artem
 *@version 2.0
 */
public abstract class BaseBook implements Entity{


    /** field id*/
    private int id;

    /** field title*/
    private String title;

    /** field author*/
    private String author;

    /** field dateOfPublishing*/
    private int dateOfPublishing;

    /**
     * Constructor - declaring new object
     * @see BaseBook#BaseBook()
     */
    public BaseBook() {
        id = IdGenerator.generate();
    }

    /**
     * Method of getting the value of field {@link BaseBook#id}
     * @return simple "int" type
     */
    public final int getId() {
        return id;
    }

    /**
     * Method of getting the value of field {@link BaseBook#title}
     * @return {@link String} object
     */
    public final String getTitle() {
        return title;
    }

    /**
     * Method of setting the value to the field {@link BaseBook#title}
     * @param titleFromDeveloper - title
     */
    public final void setTitle(String titleFromDeveloper) {
        title = titleFromDeveloper;
    }

    /**
     * Method of getting the value of field {@link BaseBook#author}
     * @return {@link String} object
     */
    public final String getAuthor() {
        return author;
    }

    /**
     * Method of setting the value to the field {@link BaseBook#author}
     * @param authorFromDeveloper - author
     */
    public final void setAuthor(String authorFromDeveloper) {
        author = authorFromDeveloper;
    }

    /**
     * Method of getting the value of field {@link BaseBook#dateOfPublishing}
     * @return simple "int" type
     */
    public final int getDateOfPublishing() {
        return dateOfPublishing;
    }

    /**
     * Method of setting the value to the field {@link BaseBook#dateOfPublishing}
     * @param dateOfPublishingFromDeveloper - author
     */
    public final void setDateOfPublishing(int dateOfPublishingFromDeveloper) {
        dateOfPublishing = dateOfPublishingFromDeveloper;
    }


    /**
     * Method that compares two objects
     * @param o - object of {@link Object}
     * @return simple "boolean" type
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseBook baseBook = (BaseBook) o;
        if (id != baseBook.id){
            return false;
        }
        if (dateOfPublishing != baseBook.dateOfPublishing){
            return false;
        }
        if (null == title){
            return (title == baseBook.title);
        } else {
            if (!title.equals(baseBook.title)){
                return false;
            }
        }
        if (null == author){
            return (author == baseBook.author);
        } else {
            if (!author.equals(baseBook.author)){
                return false;
            }
        }
        return true;
    }

    /**
     * Method that count's hashcode of the object of {@link BaseBook}
     * @return simple "int" type
     */
    @Override
    public int hashCode() {
        return (int) (31 * id * dateOfPublishing + ((title == null ? 0 : title.hashCode()) + (author == null ?
                0 : author.hashCode())));
    }

    /**
     * Method that convert all fields to {@link String} type
     * @return {@link String} object
     */
    @Override
    public String toString() {
        return "\n" + getClass().getName() + "@" + "Book id: " + id +
                ", Title: " + title +
                ", Author: " + author +
                ", Date of publishing: " + dateOfPublishing;
    }
}

