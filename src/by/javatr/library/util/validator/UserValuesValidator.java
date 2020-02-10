package by.javatr.library.util.validator;

import by.javatr.library.bean.user.User;
import by.javatr.library.bean.userstatus.UserStatus;

/**
 *Class of user's information validation with properties:
 *<b>NAME_REGEX</b>
 *<b>EMAIL_REGEX</b>
 *<b>PASSWORD_REgEX</b>
 *@author Zakharov Artem
 *@version 1.0
 */
public class UserValuesValidator {

    /** {@value} field NAME_REGEX */
    private static final String NAME_REGEX = ".{2,30}";
    /** {@value} field EMAIL_REGEX */
    private static final String EMAIL_REGEX = "[a-z][[a-z][0-9][-][_]]{3,15}[@][a-z]{2,10}[.][a-z]{2,4}";
    /** {@value} field PASSWORD_REGEX */
    private static final String PASSWORD_REGEX = "[A-Za-z0-9][A-Za-z0-9_-]{6,18}[A-Za-z0-9]";

    /**
     * Validates given parameters by required formats (check if name of user consists
     * of 4-32 symbols and password consists of 8-20 symbols
     * @param name name of {@link User} to validate
     * @param password password of {@link User} to validate
     * @return {@code true} if both given parameters are according to the given format
     * {@code false} in all other situations
     */
    public static boolean validate(String name, String password){
        return name.matches(NAME_REGEX) && password.matches(PASSWORD_REGEX);
    }

    /**
     * Validate given parameters by required formats and equivalence between password and confirmed password
     * @param name name to validate
     * @param email email to validate
     * @param status status for comparing by identifier
     * @param password password to validate
     * @param confirmedPassword confirmed password to validate
     * @return {@code true} of all given parameters are according to the given format
     * {@code false} in all other situations
     */
    public static boolean validate(String name, String email, UserStatus status, String password,
                            String confirmedPassword){
        return name.matches(NAME_REGEX) && email.matches(EMAIL_REGEX) && status.getStatusId() == 2
                && password.matches(PASSWORD_REGEX) && password.equals(confirmedPassword);
    }

    /**
     * Validate given parameters by required formats and equivalence between new password and confirmed password
     * @param oldPassword old password to validate
     * @param newPassword new password to validate
     * @param confirmedPassword confirmed password to validatte
     * @return
     */
    public static boolean validate (String oldPassword, String newPassword, String confirmedPassword){
        return oldPassword.matches(PASSWORD_REGEX) && newPassword.matches(PASSWORD_REGEX)
                && newPassword.equals(confirmedPassword);
    }
}
