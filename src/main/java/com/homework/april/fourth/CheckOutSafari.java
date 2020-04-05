package com.homework.april.fourth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckOutSafari {
    public static void main(String[] args) throws InterruptedException {

        safari();

    }

    public static void safari() throws InterruptedException {

        WebDriver driver = new SafariDriver();
        driver.navigate().to("https://demo.broadleafcommerce.org/login");
        driver.manage().window().fullscreen();
        String homePage = driver.getTitle();
        System.out.println(homePage);


        WebElement emailBox = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        emailBox.clear();
        System.out.println("Email box is clear");
        emailBox.sendKeys("humaunk04@hotmail.com");
        System.out.println("Email is entered ");
        Thread.sleep(500);

        WebElement passwordBox = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        passwordBox.clear();
        System.out.println("Password box is clear");
        passwordBox.sendKeys("Bangladesh004");
        System.out.println("Password box is entered");
        Thread.sleep(500);

        WebElement clickLogin = driver.findElement(By.xpath("//*[@id=\"login\"]/form/button"));
        clickLogin.click();
        System.out.println("Click login button");
        Thread.sleep(500);

        WebElement clickPepperSauce = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[4]/div/a/div"));
        clickPepperSauce.click();
        System.out.println("Click Pepper Sauce");
        Thread.sleep(500);

        WebElement clickAdd = driver.findElement(By.xpath("//*[@id=\"product-main-button-panel\"]/div[1]/button"));
        clickAdd.click();
        System.out.println("Click add to cart");
        Thread.sleep(500);

        WebElement clickView = driver.findElement(By.xpath("//*[@id=\"sectionsNav\"]/div/div[1]/ul[2]/li[4]/ul/li[3]/a"));
        clickView.click();
        System.out.println("Click view your cart");
        Thread.sleep(500);

        Select selectQty = new Select(driver.findElement(By.name("quantity")));
        selectQty.selectByVisibleText("99");
        System.out.println("Select quantity 99");
        Thread.sleep(500);

        WebElement clickCheckout = driver.findElement(By.xpath("//*[@id=\"cart\"]/div[3]/div[1]/div[2]/div[6]/div[1]/a"));
        clickCheckout.click();
        System.out.println("Click checkout button");
        Thread.sleep(500);

        WebElement fullName = driver.findElement(By.xpath("//*[@id=\"fullName\"]"));
        fullName.clear();
        System.out.println("Full name is clear");
        fullName.sendKeys("Donald Trump");
        System.out.println("Full name is enter");
        Thread.sleep(500);

        WebElement address = driver.findElement(By.xpath("//*[@id=\"addressLine1\"]"));
        address.clear();
        System.out.println("Address is clear");
        address.sendKeys("2134 Bangladesh Ave");
        System.out.println("Address is entered");
        Thread.sleep(500);

        WebElement city = driver.findElement(By.xpath("//*[@id=\"city\"]"));
        city.clear();
        System.out.println("City is clear");
        city.sendKeys("Detroit");
        System.out.println("City is Entered");
        Thread.sleep(500);

        Select selectState = new Select(driver.findElement(By.xpath("//*[@id=\"stateProvinceRegion\"]")));
        selectState.selectByVisibleText("MI");
        System.out.println("Select state Michigan");
        Thread.sleep(500);

        WebElement postalCode = driver.findElement(By.xpath("//*[@id=\"postalCode\"]"));
        postalCode.clear();
        System.out.println("Postal code is clear");
        postalCode.sendKeys("48212");
        System.out.println("Postal code is entered");
        Thread.sleep(500);

        WebElement phoneNumber = driver.findElement(By.xpath("//*[@id=\"phonePrimary\"]"));
        phoneNumber.clear();
        System.out.println("Phone number is clear");
        phoneNumber.sendKeys("313-674-8903");
        System.out.println("Phone number is entered ");
        Thread.sleep(500);

        WebElement shipping = driver.findElement(By.xpath("//*[@id=\"shippingInfo\"]/div/div[2]/div[3]/label"));
        shipping.click();
        System.out.println("Select shipping");
        Thread.sleep(500);

        WebElement clickContinue = driver.findElement(By.xpath("//*[@id=\"checkout\"]/div[2]/div/div[1]/div[2]/div[2]/a"));
        clickContinue.click();
        System.out.println("Click continue button");
        Thread.sleep(500);

        // driver.findElement(By.xpath("//*[@id=\"credit_card_payment_method\"]/div/div/div[1]/div/div[2]/div/div")).click();

        //driver.findElement(By.xpath("//*[@id=\"credit_card_payment_method\"]/div/div/div[1]/div/div[1]/div/div/div")).click();
        //driver.findElement(By.xpath("//*[@id=\"checkout\"]/div[2]/div/div[2]/div[2]/div[3]/div[2]/a")).click();
        //driver.findElement(By.xpath("//a[@ class ='btn btn-primary pull-right js-performcheckout']" )).click();

        //driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/div[1]/div[2]/div[6]/a")).click();

        WebElement clickCreditCard = driver.findElement(By.xpath("//*[@id=\"payment_methods\"]/div[1]/div/ul/li[1]/a"));
        clickCreditCard.click();
        System.out.println("Click credit card");
        Thread.sleep(500);

        WebElement shippingFullName = driver.findElement(By.xpath("//*[@id=\"fullName\"]"));
        shippingFullName.clear();
        System.out.println("Full name is clear");
        shippingFullName.sendKeys("Donald Trump");
        System.out.println("Full name is enter");
        Thread.sleep(500);

        WebElement shippingAddress = driver.findElement(By.xpath("//*[@id=\"addressLine1\"]"));
        shippingAddress.clear();
        System.out.println("Address is clear");
        shippingAddress.sendKeys("2134 Bangladesh Ave");
        System.out.println("Address is entered");
        Thread.sleep(500);

        WebElement shippingCity = driver.findElement(By.xpath("//*[@id=\"city\"]"));
        shippingCity.clear();
        System.out.println("City is clear");
        shippingCity.sendKeys("Detroit");
        System.out.println("City is Entered");
        Thread.sleep(500);

        Select shippingState = new Select(driver.findElement(By.xpath("//*[@id=\"stateProvinceRegion\"]")));
        shippingState.selectByVisibleText("MI");
        System.out.println("Select state Michigan");
        Thread.sleep(500);

        WebElement shippingPostalCode = driver.findElement(By.xpath("//*[@id=\"postalCode\"]"));
        shippingPostalCode.clear();
        System.out.println("Postal code is clear");
        shippingPostalCode.sendKeys("48212");
        System.out.println("Postal code is entered");
        Thread.sleep(5000);

        WebElement shippingPhone = driver.findElement(By.xpath("//*[@id=\"phonePrimary\"]"));
        shippingPhone.clear();
        System.out.println("Phone number is clear");
        shippingPhone.sendKeys("313-674-8903");
        System.out.println("Phone number is entered ");
        Thread.sleep(500);

        WebElement cardNumber = driver.findElement(By.xpath("//*[@id=\"cardNumber\"]"));
        cardNumber.clear();
        System.out.println("Card number is clear");
        cardNumber.sendKeys("4222222222222222");
        System.out.println("Card number is entered");
        Thread.sleep(500);

        WebElement cvv = driver.findElement(By.xpath("//*[@id=\"securityCode\"]"));
        cvv.clear();
        System.out.println("CVV is clear");
        cvv.sendKeys("123");
        System.out.println("CVV is entered");
        Thread.sleep(500);

        WebElement expDate = driver.findElement(By.xpath("//*[@id=\"cardExpDate\"]"));
        expDate.clear();
        System.out.println("Expire date is clear ");
        expDate.sendKeys("02/2022");
        System.out.println("Expir date is entered");
        Thread.sleep(500);

        WebElement continueButton = driver.findElement(By.xpath("//*[@id=\"checkout\"]/div[2]/div/div[2]/div[2]/div[3]/div[2]/a"));
        continueButton.click();
        System.out.println("Click continue");
        Thread.sleep(500);

        driver.findElement(By.xpath("////*[@id=\"checkout\"]/div[3]/div[1]/div[2]/div[6]/a")).click();

        WebElement placeOrder = driver.findElement(By.xpath("//*[@id=\"checkout\"]/div[2]/div/div[3]/div[2]/div[2]/a"));
        placeOrder.click();
        System.out.println("Click place your order");


        driver.findElement(By.xpath("//*[@id=\"order_confirmation\"]/div[1]/div/h2/span"));
        System.out.println("Thank You");

        driver.findElement(By.xpath("//*[@id=\"order_confirmation\"]/div[1]/div/h3"));
        System.out.println("Order confirmation 202004042348528629");

        driver.findElement(By.xpath("//*[@id=\"order_confirmation\"]/div[1]/div/p/span"));
        System.out.println("Email confirmation humaunk04@hotmail.com");

        driver.quit();

    }
}

