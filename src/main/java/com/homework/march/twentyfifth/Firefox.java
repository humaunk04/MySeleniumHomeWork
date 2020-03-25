package com.homework.march.twentyfifth;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

    public static void main (String [] args ){
        firefox();


    }

    public static void firefox(){
        System.setProperty("webdriver.gecko.driver","/Users/humaunkhalique/Projects/drivers/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://www.cnn.com/");
        String pagetitle = driver.getTitle();
        System.out.println(pagetitle);
        // if use driver.quit mean when web page open it close automatic after open.
        driver.quit();


    }
}
