package by.javatr.library.bean.book;

/**
 *Class of web-books that extends {@link BaseBook} with properties:
 *<b>id</b>
 *<b>title</b>
 *<b>author</b>
 *<b>dateOfPublishing</b>
 *<b>price</b>
 *<b>source</b>
 *@author Zakharov Artem
 *@version 2.0
 */
public class WebBook extends BaseBook{

    /** field price*/
    private int price;

    /** field source*/
    private String source;

    /**
     * Constructor - creating new Object
     * @see WebBook#WebBook()
     */
    public WebBook() {
        super();
    }

    /**
     * Method of getting the value of the field {@link WebBook#price}
     * @return simple "int" type
     */
    public int getPrice() {
        return price;
    }

    /**
     * Method of setting the value to the field {@link WebBook#price}
     * @param priceFromDeveloper - price
     */
    public void setPrice(int priceFromDeveloper) {
        price = priceFromDeveloper;
    }

    /**
     * Method of getting the value to the field {@link WebBook#source}
     * @return {@link String} object
     */
    public String getSource() {
        return source;
    }

    /**
     * Method of setting the value to the field {@link WebBook#source}
     * @param sourceFromDeveloper - source
     */
    public void setSource(String sourceFromDeveloper) {
        source = sourceFromDeveloper;
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
        WebBook webBook = (WebBook) o;
        if (price != webBook.price){
            return false;
        }
        if (null == source){
            return (source == webBook.source);
        } else {
            if (!source.equals(webBook.source)){
                return false;
            }
        }
        return true;
    }

    /**
     * Method that count's hashcode of the object of {@link WebBook}
     * @return simple "int" type
     */
    @Override
    public int hashCode() {
        return (int)(31 * price * super.hashCode() + (source == null ? 0 : source.hashCode()));
    }

    /**
     * Method that convert all fields to {@link String} type
     * @return {@link String} object
     */
    @Override
    public String toString() {
        return getClass().getName() + "@" + super.toString() + ", Book type: web" +
                ", Price: " + price + ", Source: " + source;
    }
}

