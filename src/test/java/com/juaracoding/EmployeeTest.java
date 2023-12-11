package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EmployeeTest {

    Employeee employeee;

    @BeforeMethod
    public void setUp(){
        employeee = new Employeee();

    }

    @Test(priority = 1)
    public void testName(){
        Employeee employeee = new Employeee();
        employeee.setName("Siliwangi");
        Assert.assertEquals(employeee.getName(), "Siliwangi");

    }

    @Test(priority = 2)
    public void testAddress(){
        Employeee employeee = new Employeee();
        employeee.setAddress("Jakarta");
        Assert.assertEquals(employeee.getAddress(), "Jakarta");

    }

}
