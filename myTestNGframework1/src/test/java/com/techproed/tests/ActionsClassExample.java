package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;
import java.security.Key;

public class ActionsClassExample extends TestBase {
    @Test
    public void contetClickMethod(){
        driver.get("https://the-internet.herokuapp.com/context_menu");
        //dikdortgen kutu icinde sag tikla
        WebElement dikdortgen = driver.findElement(By.id("hot-spot"));
        //create action class
     //   Actions actions = new Actions(driver);  ====> TestBase e alalim
        actions.contextClick(dikdortgen).perform();
        //alert mesajini"You selected a context menu"oldugunu dogrula
        String actualText = driver.switchTo().alert().getText();
        String expectedText = "You selected a context menu";
        Assert.assertEquals(actualText,expectedText);
        //Alert te OK ye basin
        driver.switchTo().alert().accept();

    }
    @Test
    public void hoverOver(){
        driver.get("https://www.amazon.com/");
        //your account linkine tiklayin
        WebElement helloSignin = driver.findElement(By.xpath("//span[text()='Hello, Sign in']"));
        actions.moveToElement(helloSignin).perform();
        WebElement yourAccount = driver.findElement(By.linkText("Your Account"));
        yourAccount.click();

    }
    @Test
    public void keysUpDown(){
        driver.get("https://www.google.com/");
        WebElement searchBox = driver.findElement(By.name("q"));
        //input iphone output IPHONE
      //  searchBox.sendKeys("IPHONE");
        //1. yol
      //  searchBox.sendKeys(Keys.SHIFT+"iphone");
        //2.yol
       actions.
               moveToElement(searchBox).
               click().
               keyDown(Keys.SHIFT).
               sendKeys("iphone").
               perform();
       actions.doubleClick(searchBox).perform();
    }
    @Test
    public void scrollUpDown() throws InterruptedException {
        driver.get("https://www.amazon.com/");
        //Sayfayi asagi dogru kaydirma
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        //Bir sayfada birden fazla page_down ve page_up yapabilirsin
        Thread.sleep(5000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        //ARROW_DOwn da sayfayi asagi inmeyi saglar ama daha az miktarda
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        //ARROW_UP sayfayi yukari daha az miktarda kaydirir
        actions.sendKeys(Keys.ARROW_UP).perform();
    }

}
