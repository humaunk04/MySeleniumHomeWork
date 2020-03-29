package com.homework.march.twentyninth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterChrome {
    public static void main (String [] args) throws Exception {
        chrome();

    }
    public static void chrome() throws Exception {

        System.setProperty("webdriver.chrome.driver","/Users/humaunkhalique/Projects/drivers/chromedriver");

        WebDriver irhaa = new ChromeDriver();
        irhaa.navigate().to("https://demo.broadleafcommerce.org/login");
        System.out.println(irhaa.getTitle());

        irhaa.findElement(By.xpath("//*[@id=\"customer.emailAddress\"]")).sendKeys("humaunk04@hotmail.com");
        System.out.println("Email box is clear");
        System.out.println("Email is entered");
        Thread.sleep(500);


        irhaa.findElement(By.xpath("//*[@id=\"customer.firstName\"]")).sendKeys("Irhaa");
        System.out.println("First Name box is clear");
        System.out.println("Frist Name entered");
        Thread.sleep(500);

        irhaa.findElement(By.xpath("//*[@id=\"customer.lastName\"]")).sendKeys("Juned");
        System.out.println("Last Name box is clear");
        System.out.println("Last Name is entered");
        Thread.sleep(500);

        // question on line 32 when i  use xpath it didnt work but when i got full xpath it work????
        irhaa.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[3]/form/div[4]/div[2]/input")).sendKeys("Bangladesh004");
        System.out.println("Password box is clear");
        System.out.println("Password is entered");
        Thread.sleep(500);

        irhaa.findElement(By.xpath("//*[@id=\"passwordConfirm\"]")).sendKeys("Bangladesh004");
        System.out.println("Password Confirm box is clear");
        System.out.println("Password is entered");
        Thread.sleep(500);

        irhaa.findElement(By.xpath("//*[@id=\"registrationForm\"]/button")).click();
        System.out.println("Click on Register");
        Thread.sleep(500);
        System.out.println(irhaa.getTitle());
        irhaa.quit();



    }

}
