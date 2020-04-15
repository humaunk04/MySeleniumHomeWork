package com.howework.april.fifteen.test;

import org.testng.annotations.Test;

public class CheckOutTestClass extends BaseTestClass {

    @Test(priority = 0)
    public void loginTest() throws InterruptedException {
        System.out.println("===========Login Page Verification items:    ==========");
        loginPage.login("My Profile");
        System.out.println("========= Assertion Passed ======");

    }
    @Test(priority = 1)
    public void homePageTest() throws InterruptedException {
        System.out.println(" =========Verification items:    ==========");
        homePage.homepage("View Cart");
        System.out.println("========= Assertion Passed ======");

    }
    @Test(priority = 2)
    public void checkOutTest() throws InterruptedException {
        System.out.println(" ===========Verification items:    ==========");
        shippingPage.checkoutpage("Checkout Successful");
        System.out.println("========= Assertion Passed ======");
    }





}
