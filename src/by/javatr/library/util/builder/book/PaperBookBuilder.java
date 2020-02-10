package by.javatr.library.util.builder.book;

import by.javatr.library.bean.book.BaseBook;
import by.javatr.library.bean.book.PaperBook;

/**
 *Class builder that will create objects of {@link PaperBook}, extends {@link BaseBookBuilder} with properties:
 *<b>id</b>
 *<b>title</b>
 *<b>author</b>
 *<b>dateOfPublishing</b>
 *<b>bookAmount</b>
 *@author Zakharov Artem
 *@version 1.0
 */
public class PaperBookBuilder extends BaseBookBuilder{

    /** field bookAmount */
    private int bookAmount;

    /**
     * Default constructor - creating new object
     * @see PaperBookBuilder#PaperBookBuilder()
     */
    public PaperBookBuilder() {
        super();
    }

    /**
     * Constructor - creating new object
     * @param idFromDeveloper - id
     * @see PaperBookBuilder#PaperBookBuilder(int)
     */
    public PaperBookBuilder(int idFromDeveloper) {
        super(idFromDeveloper);
    }

    /**
     * Method of setting the value to the field {@link PaperBookBuilder#bookAmount}
     * @param bookAmountFromDeveloper - bookAmount
     * @return {@link PaperBookBuilder} object
     */
    public PaperBookBuilder setBookAmount(int bookAmountFromDeveloper){
        bookAmount = bookAmountFromDeveloper;
        return this;
    }

    /**
     * Method of getting the value of the field {@link PaperBookBuilder#bookAmount}
     * @return simple "int" type
     */
    public int getBookAmount() {
        return bookAmount;
    }

    /**
     * We are building and returning an object of {@link PaperBook} with parameters:
     * (id, title, author, dateOfPublishing, bookAmount)
     * @return {@link PaperBook} object with the information
     */
    @Override
    public BaseBook create() {
        super.create();
        PaperBook paperBook = new PaperBook(super.getId());
        paperBook.setTitle(super.getTitle());
        paperBook.setAuthor(super.getAuthor());
        paperBook.setDateOfPublishing(super.getDateOfPublishing());
        paperBook.setBookAmount(bookAmount);

        return paperBook;
    }
}
