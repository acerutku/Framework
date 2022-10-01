package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandlingAlerts extends TestBase {


      @Test
    public void acceptAlert(){
          driver.get("https://the-internet.herokuapp.com/javascript_alerts");
    //1.butona tiklayin uyaridaki(alert)ok butonuna tiklayin ve result mesajinin goruntulendigini dogrulayin
       WebElement button1 = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
       button1.click();
    //ALERT UZAERINDEKI MESAJI KONSOLA YAZDIRIR
          System.out.println("Alert Mesaji:" +driver.switchTo().alert().getText());

          driver.switchTo().alert().accept();  //accept()=> click ok demektir
        //result mesajinin goruntulendigini dogrulayin =>isDisplayed()
          //locate result message
          WebElement resultMesaj = driver.findElement(By.xpath("//p[@id='result']"));
          Assert.assertTrue(resultMesaj.isDisplayed());


      }
      @Test
    public void dismissAlert(){
          driver.get("https://the-internet.herokuapp.com/javascript_alerts");

         WebElement button2 = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
         button2.click();
         //cancel butonuna tiklayin
         driver.switchTo().alert().dismiss();
         //result mesajinin you clicked;cancel oldugunu dogrulayin
         WebElement resultMesaj = driver.findElement(By.xpath("//p[@id='result']"));
         String actualResult = resultMesaj.getText();
         String expectedResult = "You clicked: Cancel";
         Assert.assertEquals(actualResult,expectedResult);


      }
      @Test
    public void sendKeysAlert(){
          driver.get("https://the-internet.herokuapp.com/javascript_alerts");
         WebElement button3 = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
         button3.click();
         driver.switchTo().alert().sendKeys("Utku Utku Utku");
         //OK BUTONUNA TIKLA
         driver.switchTo().alert().accept();
         //RESULT MESAJININ GORUNTULENDIGINI DOGRULA
        WebElement resultMesaj = driver.findElement(By.xpath("//p[@id='result']"));
        Assert.assertTrue(resultMesaj.isDisplayed());

      }




}
