package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assretions {
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


    }
    @Test
    public void titleTest(){
    String actualTitle = driver.getTitle();
    String expectedTitle = "Google";
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @Test
    public void imageTest(){

        //Google image locate
        WebElement googleIMage = driver.findElement(By.className("lnXdpd"));
     Assert.assertTrue(googleIMage.isDisplayed());
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
