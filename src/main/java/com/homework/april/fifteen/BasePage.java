package com.homework.april.fifteen;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return this.driver;
    }
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
    public void select(Select value) throws InterruptedException {
        value.selectByIndex(100);
        Thread.sleep(5000);
    }

    public void selectState(Select value) throws InterruptedException {
        value.selectByVisibleText("MI");
        Thread.sleep(5000);

    }
    public void drawBorder(WebElement element){
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].style.border='3px solid red'", element);
    }

}













