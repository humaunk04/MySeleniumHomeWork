package com.homework.march.twentyninth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RegisterFirefox {
    public static void main (String [] args){
        firefox();

    }
    public static void firefox (){

        System.setProperty("webdriver.gecko.driver","/Users/humaunkhalique/Projects/drivers/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://demo.broadleafcommerce.org/login");
        String homepage = driver.getTitle();
        System.out.println(homepage);


        WebElement emailBox = driver.findElement(By.id("customer.emailAddress"));
        emailBox.clear();
        System.out.println("Email box is cleared");
        emailBox.sendKeys("humaunk04@hotmail.com");
        System.out.println("Email is entered");

        WebElement firstName = driver.findElement(By.id("customer.firstName"));
        firstName.clear();
        System.out.println("First Name box is clear");
        firstName.sendKeys("Irhaa");
        System.out.println("Frist Name entered");

        WebElement lastName = driver.findElement(By.xpath("//*[@id=\"customer.lastName\"]"));
        lastName.clear();
        System.out.println("Last Name box is clear");
        lastName.sendKeys("Juneds");
        System.out.println("Last Name Entered");

        WebElement passwordBox = driver.findElement(By.cssSelector("div.input-group:nth-child(5) > div:nth-child(2) > input:nth-child(2)"));
        passwordBox.clear();
        System.out.println("Password box is clear");
        passwordBox.sendKeys("Bangladesh004");
        System.out.println("Password is entered");

        WebElement passwordConfirmBox = driver.findElement(By.cssSelector("#passwordConfirm"));
        passwordConfirmBox.clear();
        System.out.println("Password confirm box is clear");
        passwordBox.sendKeys("Bangladesh004");
        System.out.println("Password confirm is entered");

        WebElement registerClickBox = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[3]/form/button"));
        registerClickBox.click();
        System.out.println("Click on register");

        driver.quit();







    }
}
