package com.techproed.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class IframeTest {
    //https://the-internet.herokuapp.com/iframe
    //b'r method olustur iframetest
    //An Iframe containing testini konsolda yazin
    //textbox in altinda bulunan elemental selenium linkini textini konsolda yazdir

   @Test
   public void iframeTest(){
       WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();
       driver.get("https://the-internet.herokuapp.com/iframe");
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

 System.out.println(driver.findElement(By.xpath("//h3")).getText());
driver.switchTo().frame(0);

        WebElement textBox = driver.findElement(By.xpath("//p"));
        textBox.clear();
        textBox.sendKeys("Hello World");

       // driver.switchTo().parentFrame();  //  1 yol
       driver.switchTo().defaultContent();  // default page e gider.
        WebElement seleniumText = driver.findElement(By.linkText("Elemental Selenium"));
       System.out.println(seleniumText.getText());
       //iframe ===========> buraya gelmek icin, defaultContent();
       //     iframe ======> buraya gelmek icin, parentFrame();
       //       iframe    => buradayim
       //         iframe



   }

}
