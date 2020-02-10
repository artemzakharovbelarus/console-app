package by.javatr.library.ui.menu;

import by.javatr.library.bean.user.User;

public enum MenuPhrases {
    WRITE_SORT_PARAMETER("Write parameter of sorting and press <Enter>"),
    WRITE_SORT_TYPE("Write \"1\" if you want to sort list to the highest, \"2\" in other situation"),
    WRITE_USER_ID("Write your id and press <Enter>"),
    WRITE_OLD_PASSWORD("Write old password and press <Enter>"),
    WRITE_NEW_PASSWORD("Write new password and press <Enter>"),
    WRITE_CONFIRMED_PASSWORD("Confirm your password and press <Enter>"),
    CHANGE_PASSWORD("Write \"1\" and press <Enter> if you want change your password"),
    SEE_USERS("Write \"2\" and press <Enter> if you want to see the list of users"),
    SEE_USER_BY_ID("Write \"3\" and press <Enter> if you want to see user with given id"),
    SEE_USERS_SORTED("Write \"4\" and press <Enter> if you want to see sorted list of users"),
    WRITE_PARAMETER("Write book\'s parameter and press <Enter>"),
    WRITE_TITLE("Write book\'s title and press <Enter>"),
    WRITE_AUTHOR("Write book\'s author and press <Enter>"),
    WRITE_PUBLISHING("Write book\'s date of publishing and press <Enter>"),
    WRITE_PRICE("\"Write book\'s price and press <Enter>"),
    WRITE_RESOURCE("Write book\'s resource and press <Enter>"),
    WRITE_AMOUNT("Write book\'s amount and press <Enter>"),
    WRITE_ID("Write an id of book and press <Enter>"),
    WORK_WITH_BOOKS("Push \"1\" if you want to work with books"),
    WORK_WITH_USERS("Push \"2\" if you want to work with users"),
    OPTIONS("\nOptions - write \"1\" and press <Enter>,"),
    EXIT("\nExit - push \"2\" and press <Enter>"),
    SEE_BOOKS("\nPush \"1\" and press <Enter> if you want to see all books"),
    SEE_BOOK_BY_ID("\nPush \"2\" and press <Enter> if you want to see book with given id"),
    SEE_BOOKS_SORTED_BY("\nPush \"3\" and press <Enter> if you want to sort books by given criteria"),
    WELCOME("\nLibraries main page!"),
    LOGIN("\nWrite your login and press <Enter>"),
    WRITE_PASSWORD("\nWrite your password and press <Enter>"),
    VALID_SIGN_IN("\nYou are in system!"),
    INVALID_SIGN_IN("\nInvalid password or login!"),
    WEB_LIBRARY("Push \"1\" and press <Enter> if you want web library"),
    REAL_LIBRARY("Push \"2\" and press <Enter> if you want real library"),
    DELETE("Push \"1\" and press <Enter> if you want to delete book"),
    ADD("Push \"2\" and press <Enter> if you want to add book");

    private String text;

    MenuPhrases(String newText){
        text = newText;
    }

    public String getText() {
        return text;
    }


}
