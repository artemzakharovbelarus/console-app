package by.javatr.library.util.validator;

/**
 *Class of user's information validation with properties:
 *<b>TITLE_REGEX</b>
 *<b>AUTHOR_REGEX</b>
 *<b>PASSWORD_REGEX</b>
 *@author Zakharov Artem
 *@version 1.0
 */
public abstract class BookValuesValidator {

    /**@value field TITLE_REGEX*/
    private static final String TITLE_REGEX = ".{2,70}";

    /**@value field TITLE_REGEX*/
    private static final String AUTHOR_REGEX = ".{2,28}";

    private static final String SOURCE_REGEX = ".[-a-zA-Z0-9@:%_\\+.~#?&//=]{2,256}\\.[a-z]{2,4}\\b(\\/[-a-zA-Z0-9@:%" +
            "_\\+.~#?&//=]*)?/gi";

    public static boolean validate(String title, String author, int publishingDate, int bookAmount){
        return title.matches(TITLE_REGEX) && author.matches(AUTHOR_REGEX)
                && (publishingDate > 1517) && (bookAmount > 0);
    }

    public static boolean validate(String title, String author, int publishingDate, int price, String source){
        return title.matches(TITLE_REGEX) && author.matches(AUTHOR_REGEX)
                && (publishingDate > 1517) && (price > 0) && source.matches(SOURCE_REGEX);
    }
}
