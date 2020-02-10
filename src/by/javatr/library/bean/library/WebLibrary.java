package by.javatr.library.bean.library;

import by.javatr.library.bean.book.WebBook;

import java.util.ArrayList;
import java.util.List;

/**
 *Class of web-library that extends {@link BaseLibrary} with properties:
 *<b>id</b>
 *<b>webAddress</b>
 *@author Zakharov Artem
 *@version 2.0
 */
public class WebLibrary extends BaseLibrary{

    /** field webAddress*/
    private String webAddress;

    /** field list of web books*/
    private List<WebBook> books;

    /**
     * Default constructor - creating new object
     * @see WebLibrary#WebLibrary()
     */
    public WebLibrary() {
        super();
    }

    /**
     * Constructor - creating new object
     * @see WebLibrary#WebLibrary(ArrayList)
     */
    public WebLibrary(ArrayList<WebBook> booksFromDeveloper) {
        super();
        setBooks(booksFromDeveloper);
    }

    /**
     * Method of getting the value of the field {@link WebLibrary#webAddress}
     * @return {@link String} object
     */
    public String getWebAddress() {
        return webAddress;
    }

    /**
     * Method of setting the value to the field {@link WebLibrary#webAddress}
     * @param webAddressFromDeveloper - webAddress
     */
    public void setWebAddress(String webAddressFromDeveloper) {
        webAddress = webAddressFromDeveloper;
    }

    /**
     * Returns an object of {@link WebBook} from list
     * @param index index of web book in data structure
     * @return an object of {@link WebBook}
     */
    public WebBook getBooks(int index) {
        return books.get(index);
    }

    /**
     * Sets a list of web book to {@link WebLibrary}
     * @param booksFromDeveloper list of web books
     */
    public void setBooks(List<WebBook> booksFromDeveloper) {
        books = booksFromDeveloper;
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
        if (!super.equals(o)) return false;
        WebLibrary library = (WebLibrary) o;
        if (null == webAddress){
            return (webAddress == library.webAddress);
        } else {
            if (!webAddress.equals(library.webAddress)){
                return false;
            }
        }
        if (null == books){
            return books == library.books;
        } else{
            if(!books.equals(library.books)){
                return false;
            }
        }
        return true;
    }

    /**
     * Method that count's hashcode of the object of {@link WebLibrary}
     * @return simple "int" type
     */
    @Override
    public int hashCode() {
        return (int)(31 * super.hashCode() + (null == webAddress ? 0 : webAddress.hashCode()) + ((null == books ? 0 :
                books.hashCode())));
    }

    /**
     * Method that convert all fields to {@link String} type
     * @return {@link String} object
     */
    @Override
    public String toString() {
        String result = getClass().getName() + "@" + super.toString() + "Library type: web" +
                "\nWeb-address: " + webAddress;
        for (int i = 0; i < books.size(); i++) {
            result += books.get(i).toString() + ", ";
        }
        return result + ";";
    }
}

