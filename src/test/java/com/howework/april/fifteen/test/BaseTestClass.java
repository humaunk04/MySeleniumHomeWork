package com.howework.april.fifteen.test;

import com.homework.april.fifteen.HomePage;
import com.homework.april.fifteen.LoginPage;
import com.homework.april.fifteen.ShippingPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BaseTestClass {

    public LoginPage loginPage;
    public HomePage homePage;
    public ShippingPage shippingPage;
    public WebDriver driver;

    public BaseTestClass(){

    }
    @BeforeClass
    public void setUpMethod(){
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        shippingPage = new ShippingPage(driver);


    }
    @AfterClass
    public void tearDownMethod(){
        if(driver != null){
            driver.quit();
        }

    }

    public void initilization(){
        WebDriverManager.chromedriver().setup();
        //WebDriverManager.firefoxdriver().setup();
        //driver = new FirefoxDriver();
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://demo.broadleafcommerce.org/");

    }









}
