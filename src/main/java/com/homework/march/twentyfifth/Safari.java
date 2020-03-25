package com.homework.march.twentyfifth;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Safari {

    public static void main(String [] args ){
        safari();


    }
    public static void safari(){

        WebDriver humaun = new SafariDriver();
        humaun.navigate().to("https://www.marketwatch.com");
        String pagetitle = humaun.getTitle();
        System.out.println(pagetitle);
        humaun.quit();

    }

}
