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

public class Tekrar_BeforeAfter_BestBuy {

    WebDriver driver;

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.bestbuy.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Test
    public void titleTest(){
        driver.get("https://www.bestbuy.com/");
        String actualTitle = driver.getTitle();
        String expectedTitle = "Best";
        if (actualTitle.contains(expectedTitle)) {
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

    }
    @Test
    public void logoTest(){
        WebElement bestBuyLogo = driver.findElement(By.className("logo"));
        if (bestBuyLogo.isDisplayed()) {
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }
    }
    @Test
    public void mexicoLinkTest(){
        WebElement mexicoLinkElement = driver.findElement(By.linkText("Mexico"));
        if (mexicoLinkElement.isDisplayed()) {
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
    }
    @After
    public void tearDowm(){
        driver.close();

    }

}
