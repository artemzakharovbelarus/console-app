package by.javatr.library.util.builder.library;

import by.javatr.library.bean.library.BaseLibrary;

/**
 *Abstract Class builder that will not create objects of {@link BaseLibrary} with properties:
 *<b>id</b>
 *@author Zakharov Artem
 *@version 1.0
 */
public abstract class BaseLibraryBuilder {

    /** field id */
    private int id;

    /**
     * Default constructor - creating new object
     * @see BaseLibraryBuilder#BaseLibraryBuilder()
     */
    public BaseLibraryBuilder(){}

    /**
     * Constructor - creating new object
     * @param idFromDeveloper - id
     * @see BaseLibraryBuilder#BaseLibraryBuilder(int)
     */
    public BaseLibraryBuilder(int idFromDeveloper) {
        setId(idFromDeveloper);
    }

    /**
     * Method of setting the value to the field {@link BaseLibraryBuilder#id}
     * @param idFromDeveloper - id
     * @return {@link BaseLibraryBuilder} object
     */
    public BaseLibraryBuilder setId(int idFromDeveloper) {
        id = idFromDeveloper;
        return this;
    }

    /**
     * Method of getting the value of the field {@link BaseLibraryBuilder@id}
     * @return simple "int' type
     */
    public int getId() {
        return id;
    }

    /**
     * We are building and returning an object of {@link BaseLibrary} with parameter:
     * (id)
     * @return {@link BaseLibrary} object with the information
     */
    public BaseLibrary create(){
        BaseLibrary library = null;
        library.setId(id);

        return library;
    }
}
