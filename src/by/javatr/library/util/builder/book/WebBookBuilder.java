package by.javatr.library.util.builder.book;

import by.javatr.library.bean.book.BaseBook;
import by.javatr.library.bean.book.WebBook;

/**
 *Class builder that will create objects of {@link WebBook}, extends {@link BaseBookBuilder} with properties:
 *<b>id</b>
 *<b>title</b>
 *<b>author</b>
 *<b>dateOfPublishing</b>
 *<b>price</b>
 *<b>source</b>
 *@author Zakharov Artem
 *@version 1.0
 */
public class WebBookBuilder extends BaseBookBuilder{

    /** field price */
    private int price;
    /** field source */
    private String source;

    /**
     * Default constructor - creating new object
     * @see WebBookBuilder#WebBookBuilder()
     */
    public WebBookBuilder() {
        super();
    }

    /**
     * Constructor - creating new object
     * @param idFromDeveloper - id
     * @see WebBookBuilder#WebBookBuilder(int)
     */
    public WebBookBuilder(int idFromDeveloper) {
        super(idFromDeveloper);
    }

    /**
     * Method of setting the value to the field {@link WebBookBuilder#price}
     * @param priceFromDeveloper - price
     * @return {@link WebBookBuilder} object
     */
    public WebBookBuilder setPrice(int priceFromDeveloper){
        price = priceFromDeveloper;
        return this;
    }

    /**
     * Method of getting the value of the field {@link WebBookBuilder#price}
     * @return simple "int" type
     */
    public int getPrice() {
        return price;
    }

    /**
     * Method of setting the value to the field {@link WebBookBuilder#source}
     * @param sourceFromDeveloper - source
     * @return {@link WebBookBuilder} object
     */
    public WebBookBuilder setSource(String sourceFromDeveloper){
        source = sourceFromDeveloper;
        return this;
    }

    /**
     * Method of getting the value of the field {@link WebBookBuilder#source}
     * @return {@link String} object
     */
    public String getSource() {
        return source;
    }

    /**
     * We are building and returning an object of {@link WebBook} with parameters:
     * (id, title, author, dateOfPublishing, price, source)
     * @return {@link WebBook} object with the information
     */
    @Override
    public BaseBook create() {
        super.create();
        WebBook book = new WebBook(super.getId());
        book.setTitle(super.getTitle());
        book.setAuthor(super.getAuthor());
        book.setDateOfPublishing(super.getDateOfPublishing());
        book.setPrice(price);
        book.setSource(source);

        return book;
    }
}
