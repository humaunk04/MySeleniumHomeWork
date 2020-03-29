package com.homework.march.twentyninth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.Random;

public class RegisterSafari {
    public static void main ( String [] args) throws InterruptedException {
        safari();



    }

    public static void safari() throws InterruptedException {

        WebDriver humaun = new SafariDriver();
        humaun.navigate().to("https://demo.broadleafcommerce.org/login");
        String homepage = humaun.getTitle();
        System.out.println(homepage);


        humaun.findElement(By.xpath("//*[@id=\"customer.emailAddress\"]")).sendKeys("humaunk04@hotmail.com");
        Thread.sleep(500);

        humaun.findElement(By.xpath("//*[@id=\"customer.firstName\"]")).sendKeys("Irhaa");
        Thread.sleep(500);

        humaun.findElement(By.xpath("//*[@id=\"customer.lastName\"]")).sendKeys("Juneds");
        Thread.sleep(500);

        humaun.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[3]/form/div[4]/div[2]/input")).sendKeys("Bangladesh004");
        Thread.sleep(500);

        humaun.findElement(By.xpath("//*[@id=\"passwordConfirm\"]")).sendKeys("Bangladesh004");
        Thread.sleep(500);

        humaun.findElement(By.xpath("//*[@id=\"registrationForm\"]/button")).click();

        System.out.println(humaun.getTitle());
        humaun.quit();

    }
}
