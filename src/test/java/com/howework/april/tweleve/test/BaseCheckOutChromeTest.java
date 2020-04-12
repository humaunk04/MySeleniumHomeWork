package com.howework.april.tweleve.test;

import com.homework.april.twelve.BaseCheckOutChrome;
import com.homework.april.twelve.CheckOutChrome;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BaseCheckOutChromeTest {
    public CheckOutChrome checkOutChrome;
    public WebDriver driver;

    public BaseCheckOutChromeTest(){

    }



    @BeforeClass
    public void setUpMethod(){
        initilization();
        checkOutChrome = new CheckOutChrome(driver);

    }

    @AfterClass
    public void tearDownMethod(){
        if(driver != null){
            driver.quit();
        }

    }


    public void initilization(){
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://demo.broadleafcommerce.org/");

    }
}
