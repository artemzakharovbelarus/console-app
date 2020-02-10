package by.javatr.library.util.builder.book;

import by.javatr.library.bean.user.User;
import by.javatr.library.bean.userstatus.UserStatus;
import by.javatr.library.util.builder.user.UserBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestUserBuilder {
    private final static int ID = 2;
    private UserBuilder userBuilder = new UserBuilder();
    private UserBuilder readyBuilder = new UserBuilder(ID);

    @BeforeClass
    public void init(){
        readyBuilder.setName("name")
                .setEmail("email")
                .setStatus(UserStatus.READER);
    }

    @Test
    public void setName_correctBuilder(){
        String expectedName = "Name";
        //given
        userBuilder.setName("Name");
        //then
        assertEquals(userBuilder.getName(), expectedName);
    }

    @Test
    public void setEmail_correctBuilder(){
        String expectedEmail = "Email";
        //given
        userBuilder.setEmail("Email");
        //then
        assertEquals(userBuilder.getEmail(), expectedEmail);
    }

    @Test
    public void build_readyBuilder(){
        //given
        User expectedUser = new User(ID);
        expectedUser.setName("Name");
        expectedUser.setEmail("Email");
        expectedUser.setStatus(UserStatus.READER);

        User resultUser = readyBuilder.create();
        //then
        assertEquals(resultUser, expectedUser);
    }
}