package com.homework.april.fifteen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import sun.jvm.hotspot.ui.HistoryComboBox;

public class ShippingPage extends BasePage {

    WebDriver driver;

    public ShippingPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "(//*[@id= 'fullName'])")
    WebElement fullName;
    @FindBy(xpath = "(//*[@id= 'addressLine1'])")
    WebElement enterAddress;
    @FindBy(xpath = "(//*[@id= 'city')]")
    WebElement enterCity;
    @FindBy(xpath = "(//*[@id= 'stateProvinceRegion'])")
    Select selectState;
    @FindBy(xpath = "(//*[@id= 'postalCode'][1]) ")
    WebElement postalCode;
    @FindBy(xpath = "(//*[@id= 'phonePrimary'][1] " )
    WebElement phonePrimary;
    @FindBy(xpath = "(//*[@id=\"shippingInfo\"]/div/div[2]/div[2]/label)")
    WebElement selectShipping;
    @FindBy(xpath = "(//*[@id=\"checkout\"]/div[2]/div/div[1]/div[2]/div[2]/a/span)")
    WebElement continueButton;
    @FindBy(xpath = "(//*[@href = '#CreditCard'])")
    WebElement clickCreditCard;
    @FindBy(xpath = "(//*[@class= 'card-content'][1])")
    WebElement selectCard;
    @FindBy(xpath = "(//*[@class= 'btn btn-primary pull-right js-submitPaymentCheckoutStage'])")
    WebElement clickContinue;
    @FindBy(xpath = "(//*[@class= 'btn btn-primary pull-right js-performCheckout'])")
    WebElement clickCheckout;

    public void checkoutpage(String expectedString) throws InterruptedException {
        typeBox(fullName, "Donald Trump");
        typeBox(enterAddress, "2134 Bangladesh Ave");
        typeBox(enterCity, "Detroit");
        selectState(selectState);
        typeBox(postalCode,"48212");
        typeBox(phonePrimary,"313-674-8903");
        clickTheElement(selectShipping);
        clickTheElement(continueButton);
        clickTheElement(clickCreditCard);
        clickTheElement(selectCard);
        clickTheElement(clickContinue);
        clickTheElement(clickCheckout);
        System.out.println("Checkout Successful");


    }


}
