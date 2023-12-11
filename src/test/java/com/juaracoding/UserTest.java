package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserTest {

    User user;

    public void setUp(){
        user = new User();
    }

    @Test
    public  void testCheckLogin(){
        User user = new User();
        user.setUsername("Admin");
        user.setPassword("admin123");
        Assert.assertTrue(user.checkLogin());
    }

    // contaoms pada assertTrue

    @Test
    public void testErrorMessage(){
        boolean result = user.getErrorMessage().contains("Invalid");
        Assert.assertTrue(result);
    }
}
