package by.javatr.library.bean.library;

import by.javatr.library.bean.book.PaperBook;

import java.util.ArrayList;
import java.util.List;

/**
 *Class of real library that extends {@link BaseLibrary} with properties:
 *<b>id</b>
 *<b>address</b>
 *@author Zakharov Artem
 *@version 2.0
 */
public class RealLibrary extends BaseLibrary{

    /** field address*/
    private String address;

    /** field list of paper books*/
    private List<PaperBook> books;

    /**
     * Default constructor - creating new object
     * @see RealLibrary#RealLibrary()
     */
    public RealLibrary() {
        super();
    }

    /**
     * Constructor - creating new Object
     * @param booksFromDeveloper storage of paper books
     * @see RealLibrary#RealLibrary(ArrayList)
     */
    public RealLibrary(ArrayList<PaperBook> booksFromDeveloper) {
        super();
        setBooks(booksFromDeveloper);
    }

    /**
     * Method of getting the value of the field {@link RealLibrary#address}
     * @return {@link String} object
     */
    public String getAddress() {
        return address;
    }

    /**
     * Method of setting the value to the field {@link RealLibrary#address}
     * @param addressFromDeveloper - address
     */
    public void setAddress(String addressFromDeveloper) {
        address = addressFromDeveloper;
    }

    /**
     * Returns one {@link PaperBook} object from list
     * @param indexOfBook index of element in data structure
     * @return object of {@link PaperBook} with given index in list
     */
    public PaperBook getBook(int indexOfBook) {
        return books.get(indexOfBook);
    }

    /**
     * Sets a list of paper books to {@link RealLibrary}
     * @param booksFromDeveloper list of paper books
     */
    public void setBooks(List<PaperBook> booksFromDeveloper) {
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
        RealLibrary library = (RealLibrary) o;
        if (null == address){
            return address == library.address;
        } else{
            if (!address.equals(library.address)){
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
     * Method that count's hashcode of the object of {@link RealLibrary}
     * @return simple "int" type
     */
    @Override
    public int hashCode() {
        return (int)(31 * super.hashCode() + (address == null ? 0 : address.hashCode()) + (books == null ? 0 :
                books.hashCode()));
    }

    /**
     * Method that convert all fields to {@link String} type
     * @return {@link String} object
     */
    @Override
    public String toString() {
        String result = getClass().getName() + "@" + super.toString() + ", Address: " + address;
        for (int i = 0; i < books.size(); i++) {
            result += books.get(i).toString() + ", ";
        }
        result += ";";
        return result;
    }
}

