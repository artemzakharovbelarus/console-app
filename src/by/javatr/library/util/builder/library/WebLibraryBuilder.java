package by.javatr.library.util.builder.library;

import by.javatr.library.bean.book.WebBook;
import by.javatr.library.bean.library.BaseLibrary;
import by.javatr.library.bean.library.WebLibrary;

/**
 *Class builder that will create objects of {@link WebBook}, extends {@link BaseLibraryBuilder} with properties:
 *<b>id</b>
 *<b>webAddress</b>
 *@author Zakharov Artem
 *@version 1.0
 */
public class WebLibraryBuilder extends BaseLibraryBuilder{

    /** field webAddress */
    private String webAddress;

    /**
     * Default constructor - creating new object
     * @see WebLibraryBuilder#WebLibraryBuilder()
     */
    public WebLibraryBuilder() {
        super();
    }

    /**
     * Constructor - creating new object
     * @param idFromDeveloper - id
     * @see WebLibraryBuilder#WebLibraryBuilder(int)
     */
    public WebLibraryBuilder(int idFromDeveloper) {
        super(idFromDeveloper);
    }

    /**
     * Method of setting the value to the field {@link WebLibraryBuilder#webAddress}
     * @param webAddressFromDeveloper - webAddress
     * @return {@link WebLibraryBuilder} object
     */
    public WebLibraryBuilder setWebAddress(String webAddressFromDeveloper){
        webAddress = webAddressFromDeveloper;
        return this;
    }

    /**
     * Method of getting the value of the field {@link WebLibraryBuilder#webAddress}
     * @return - {@link String} object
     */
    public String getWebAddress() {
        return webAddress;
    }

    /**
     * We are building and returning an object of {@link WebLibrary} with parameter:
     * (id, webAddress)
     * @return {@link WebLibrary} object with the information
     */
    @Override
    public BaseLibrary create() {
        super.create();
        WebLibrary library = new WebLibrary(super.getId());
        library.setWebAddress(webAddress);

        return library;
    }
}
