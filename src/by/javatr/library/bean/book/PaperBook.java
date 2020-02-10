package by.javatr.library.bean.book;

import javax.xml.bind.annotation.*;

/**
 *Class of paper books that extends {@link BaseBook} with properties:
 *<b>id</b>
 *<b>title</b>
 *<b>author</b>
 *<b>dateOfPublishing</b>
 *<b>bookAmount</b>
 *@author Zakharov Artem
 *@version 2.0
 */
public class PaperBook extends BaseBook{

    /** field bookAmount*/
    private int bookAmount;

    /**
     * Constructor - creating new object
     * @see PaperBook#PaperBook()
     */
    public PaperBook() {
        super();
    }

    /**
     * Method of getting the value of field {@link PaperBook#bookAmount}
     * @return simple "int" type
     */
    public int getBookAmount() {
        return bookAmount;
    }

    /**
     * Method of setting the value to the field {@link PaperBook#bookAmount}
     * @param bookAmountFromDeveloper - bookAmount
     */
    public void setBookAmount(int bookAmountFromDeveloper) {
        bookAmount = bookAmountFromDeveloper;
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
        PaperBook paperBook = (PaperBook) o;
        if(bookAmount != paperBook.bookAmount){
            return false;
        }
        return true;
    }

    /**
     * Method that count's hashcode of the object of {@link PaperBook}
     * @return simple "int" type
     */
    @Override
    public int hashCode() {
        return (int) (31 * super.hashCode() * bookAmount);
    }

    /**
     * Method that convert all fields to {@link String} type
     * @return {@link String} object
     */
    @Override
    public String toString() {
        return getClass().getName() + "@" + super.toString() + "\nBook type: paper" +
                "\nBook amount: " + bookAmount;
    }
}

