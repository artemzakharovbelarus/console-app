package by.javatr.library.util.builder.library;

import by.javatr.library.bean.library.BaseLibrary;
import by.javatr.library.bean.library.RealLibrary;

/**
 *Class builder will create objects of {@link RealLibrary}, extends {@link BaseLibraryBuilder} with properties:
 *<b>id</b>
 *<b>address</b>
 *@author Zakharov Artem
 *@version 1.0
 */
public class RealLibraryBuilder extends BaseLibraryBuilder{

    /** field address */
    private String address;

    /**
     * Default constructor - creating new object
     * @see RealLibraryBuilder#RealLibraryBuilder()
     */
    public RealLibraryBuilder() {
        super();
    }

    /**
     * Constructor - creating new object
     * @param idFromDeveloper - id
     * @see RealLibraryBuilder#RealLibraryBuilder(int)
     */
    public RealLibraryBuilder(int idFromDeveloper) {
        super(idFromDeveloper);
    }

    /**
     * Method of setting the value to the field {@link RealLibraryBuilder#address}
     * @param addressFromDeveloper - address
     * @return {@link RealLibrary} object
     */
    public RealLibraryBuilder setAddress(String addressFromDeveloper){
        address = addressFromDeveloper;
        return this;
    }

    /**
     * Method of getting the value of the field {@link RealLibraryBuilder#address}
     * @return {@link String} object
     */
    public String getAddress() {
        return address;
    }

    /**
     * We are building and returning an object of {@link RealLibrary} with parameter:
     * (id, address)
     * @return {@link RealLibrary} object with the information
     */
    @Override
    public BaseLibrary create() {
        super.create();
        RealLibrary realLibrary = new RealLibrary(super.getId());
        realLibrary.setAddress(address);

        return realLibrary;
    }
}
