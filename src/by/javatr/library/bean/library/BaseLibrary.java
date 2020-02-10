package by.javatr.library.bean.library;

import by.javatr.library.bean.Entity;
import by.javatr.library.util.generator.IdGenerator;

/**
 *Abstract class of library that implements {@link Entity} with properties:
 *<b>id</b>
 *@author Zakharov Artem
 *@version 2.0
 */
public abstract class BaseLibrary implements Entity {

    /** field id*/

    private int id;

    /**
     * Constructor - declaring new object
     * @see BaseLibrary#BaseLibrary()
     */
    public BaseLibrary() {
        id = IdGenerator.generate();
    }

    /**
     * Method of getting the value of the field {@link BaseLibrary#id}
     * @return simple "int" type
     */
    public final int getId() {
        return id;
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
        BaseLibrary library = (BaseLibrary) o;
        if (id != library.id){
            return false;
        }
        return true;
    }

    /**
     * Method that count's hashcode of the object of {@link BaseLibrary}
     * @return simple "int" type
     */
    @Override
    public int hashCode() {
        return (int)(31 * id);
    }

    /**
     * Method that convert all fields to {@link String} type
     * @return {@link String} object
     */
    @Override
    public String toString() {
        return getClass().getName() + "@" + "\nLibrary id: " + id;
    }
}

