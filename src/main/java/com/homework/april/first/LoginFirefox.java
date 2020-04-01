package com.homework.april.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginFirefox {
    public static void main(String [] args) throws InterruptedException {
       firefox();

    }
    public static void firefox() throws InterruptedException {

        System.setProperty("webdriver.gecko.driver","/Users/humaunkhalique/Projects/drivers/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://demo.broadleafcommerce.org/login");
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);

        WebElement emailBox = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        emailBox.clear();
        System.out.println("Email box is clear");
        emailBox.sendKeys("humaunk04@hotmail.com");
        System.out.println("Email is entered");
        Thread.sleep(5000);

        WebElement passwordBox = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        passwordBox.clear();
        System.out.println("Password box is clear");
        passwordBox.sendKeys("Bangladesh004");
        System.out.println("Password is entered");
        Thread.sleep(5000);

        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login\"]/form/button"));
        loginButton.click();
        System.out.println("Click login button");
        Thread.sleep(5000);

        WebElement clickGreenGhost = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[3]/div/a/div"));
        clickGreenGhost.click();
        System.out.println("Click on green ghost");
        Thread.sleep(5000);

        WebElement clickAddToCart = driver.findElement(By.xpath("//*[@id=\"product-main-button-panel\"]/div[1]/button"));
        clickAddToCart.click();
        System.out.println("Click on add to cart");
        Thread.sleep(5000);

        WebElement clickViewYourCart = driver.findElement(By.xpath("//a[@class = 'btn btn-secondary']"));
        clickViewYourCart.click();
        System.out.println("Click to view your cart");
        Thread.sleep(5000);

        Select selectQuantity = new Select(driver.findElement(By.name("quantity")));
        selectQuantity.selectByIndex(49);
        System.out.println("Slect quantity 50");
        Thread.sleep(5000);

        WebElement clickCheckout = driver.findElement(By.xpath("//*[@id=\"cart\"]/div[3]/div[1]/div[2]/div[6]/div[1]/a"));
        clickCheckout.click();
        System.out.println("Click Checkout button");
        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"fullName\"]")).sendKeys("John khan");
        System.out.println("Full name clear");
        System.out.println("Full name entered");
        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"addressLine1\"]")).sendKeys(" 3013 belmont st");
        System.out.println("Address is blank");
        System.out.println("Address is entered");
        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Hamtramck");
        System.out.println("City is blank");
        System.out.println("City is entered");
        Thread.sleep(5000);

        Select selectState = new Select(driver.findElement(By.id("stateProvinceRegion")));
        selectState.selectByVisibleText("MI");
        System.out.println("Slect Michigan");
        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"postalCode\"]")).sendKeys("48214");
        System.out.println("Postal code is blank");
        System.out.println("Postal code is entered");
        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"phonePrimary\"]")).sendKeys("313-567-3456");
        System.out.println("Phone number is blank");
        System.out.println("Phone number is entered");
        Thread.sleep(5000);

        //driver.findElement(By.id("fulfillmentOptionId2")).click();



        driver.findElement(By.xpath("//*[@id=\"shippingInfo\"]/div/div[2]/div[2]/label")).click();
        System.out.println("Select Shipping");
        Thread.sleep(5000);



        // WebElement selectRadio = driver.findElement(By.xpath("//a[@id='fulfillmentOptionId2']"));
        //selectRadio.click();
        //System.out.println("Shipping is not select");
        //System.out.println("Shipping is select");
        //Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"checkout\"]/div[2]/div/div[1]/div[2]/div[2]/a")).click();
        System.out.println("Click continue");
        Thread.sleep(5000);

        WebElement checkSameAddress = driver.findElement(By.xpath("//a[@class = 'check']"));
        checkSameAddress.click();
        System.out.println("Check same address");
        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"cardNumber\"]")).sendKeys("1234563245632145");
        System.out.println("Card number is blank");
        System.out.println("Card number entered");
        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"securityCode\"]")).sendKeys("123");
        System.out.println("CVV is black");
        System.out.println("CVV is enter");
        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"cardExpDate\"]")).sendKeys("01/23");
        System.out.println(" Expire date blank");
        System.out.println(" Expire date entered");
        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"checkout\"]/div[2]/div/div[2]/div[2]/div[3]/div[2]/a")).click();
        System.out.println("Click continue");
        Thread.sleep(5000);

    }
}
