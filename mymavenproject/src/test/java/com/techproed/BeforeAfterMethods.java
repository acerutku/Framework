package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BeforeAfterMethods {
    //3 test methodu olustur
    //titleTest sayfa baslıgının google oldugunu dogrulayın
    //imageTest google resminin görüntülendigini dogrula
    //gmailLinkTest gmail linkinin görüntlenmesini dogrula
    //her testten sonra tarayıcıyı kapat
    WebDriver driver;

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }
    @Test
    public void titleTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }
        driver.close();
    }
    @Test
    public void imageTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        //Google image locate
        WebElement googleIMage = driver.findElement(By.id("hplogo"));
        if (googleIMage.isDisplayed()) {
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }

        driver.close();
    }

    @Test
    public void gmaillinkTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        WebElement gmailLinkTest = driver.findElement(By.linkText("Gmail"));
        if (gmailLinkTest.isDisplayed()) {
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }
driver.close();
    }
    @After
    public void tearDown(){
        //@After annotation genellikle tarayıcıyı kapatmak icin kullanılır
        //bu method her @Test ten sonra calısır
   driver.close();

    }



}
