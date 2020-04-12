package com.homework.april.twelve;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CheckOutChrome extends BaseCheckOutChrome {
    WebDriver driver;


    public CheckOutChrome(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    WebElement emailBox = driver.findElement(By.xpath("//*[@id=\"username\"]"));
    WebElement passwordBox = driver.findElement(By.xpath("//*[@id=\"password\"]"));
    WebElement clickLogin = driver.findElement(By.xpath("//*[@id=\"login\"]/form/button"));
    WebElement clickPepperSauce = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[4]/div/a/div"));
    WebElement clickAdd = driver.findElement(By.xpath("//*[@id=\"product-main-button-panel\"]/div[1]/button"));
    WebElement clickView = driver.findElement(By.xpath("//*[@id=\"sectionsNav\"]/div/div[1]/ul[2]/li[4]/ul/li[3]/a"));
    WebElement clickCheckout = driver.findElement(By.xpath("//*[@id=\"cart\"]/div[3]/div[1]/div[2]/div[6]/div[1]/a"));
    WebElement dropDown = driver.findElement(By.xpath("//*[@id=\"sectionsNav\"]/div/div[1]/ul[2]/li[1]/a"));
    WebElement logOut = driver.findElement(By.xpath("//*[@id=\"sectionsNav\"]/div/div[1]/ul[2]/li[1]/ul/li[2]/a"));






    public void login( String expectedString) throws InterruptedException {



        typeBox(emailBox,"humaunk04@hotmail.com");
        typeBox(passwordBox,"Bangladesh004");
        System.out.println("Email and Password is enter");
        clickTheElement(clickLogin);
        System.out.println("Click login button");
        clickTheElement(clickPepperSauce);
        System.out.println("Click pepper sauce");
        clickTheElement(clickAdd);
        System.out.println("Add to cart");
        clickTheElement(clickView);
        System.out.println("Click view to cart");
        clickTheElement(clickCheckout);
        System.out.println("Click view to cart");
        clickTheElement(dropDown);
        clickTheElement(logOut);
        System.out.println("Logout");



    }













}
