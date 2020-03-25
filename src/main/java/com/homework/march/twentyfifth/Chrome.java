package com.homework.march.twentyfifth;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
    public static void main(String [] args) {

        chrome();

    }

    public static void chrome(){
        System.setProperty("webdriver.chrome.driver","/Users/humaunkhalique/Projects/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.youtube.com");
        System.out.println(driver.getTitle());


    }
}
