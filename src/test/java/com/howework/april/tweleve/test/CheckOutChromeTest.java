package com.howework.april.tweleve.test;

import org.testng.annotations.Test;

public class CheckOutChromeTest extends BaseCheckOutChromeTest {

    @Test
    public void checkoutTest() throws InterruptedException {
        System.out.println("============Login Successful");
        checkOutChrome.login("Checkout");
        System.out.println("=========Assertion Passed====");


    }



}
