package com.homework.april.fifteen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{
    WebDriver driver;

    public LoginPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);

    }
    @FindBy(id = "username")
    WebElement enterEmail;
    @FindBy(xpath = "(//*[@id='password'])[1]")
    WebElement enterPassword;
    @FindBy(xpath = "//*[@id='login']/form/button")
    WebElement loginButton;

    public void login(String expectedString) throws InterruptedException {
        typeBox(enterEmail,"humaunk04@hotmail.com");
        typeBox(enterPassword,"Bangladesh004");
        System.out.println("Email and Password is enter");
        clickTheElement(loginButton);
        System.out.println("Click login button");







    }





















}
