package com.homework.april.twelve;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseCheckOutChrome {

    public WebDriver driver;
    public WebDriverWait wait;

    public BaseCheckOutChrome(WebDriver driver){this.driver=driver;}
    public WebDriver getDriver() {return this.driver;}

    //This method clicks on elements
    public void clickTheElement(WebElement element) throws InterruptedException {
        Thread.sleep(5000);
        element.click();
    }

    //This method types a String a textBox
    public void typeBox(WebElement element, String textToBeEntered) throws InterruptedException {
        Thread.sleep(5000);
        element.clear();
        element.sendKeys(textToBeEntered);
    }









}
