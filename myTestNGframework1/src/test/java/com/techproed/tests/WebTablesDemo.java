package com.techproed.tests;

import com.techproed.utilities.TestBase;
import com.techproed.utilities.TestBaseFinal;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static com.techproed.utilities.CrossDriver.driver;

public class WebTablesDemo {

public static void main(String[]args) {


    WebDriverManager.chromedriver().setup();
    ChromeDriver driver = new ChromeDriver();

    driver.get("https://www2.asx.com.au/markets/trade-our-cash-market/equity-market-prices?utm_widget=topTwenty");
        driver.manage().window().maximize();
        WebElement table = driver.findElement(By.className("md-bootstrap-tooltip"));
    //   driver.findElement(By.className("symbolName")).click();
       // driver.switchTo().frame(table);
        List<WebElement> rowelements = driver.findElements(By.xpath("//*[@id=\"home_top_twenty\"]/div/div[1]/div/div[1]/table/tr/td"));
        System.out.println(rowelements.size());
        int rowsize = rowelements.size();
        List <WebElement> column = driver.findElements(By.xpath("//*[@id=\"home_top_twenty\"]/div/div[1]/div/div[1]/table/tr/td"));
        System.out.println(column.size());
        int colum = column.size();

        for (int i=1; i<=rowsize; i++){
            for (int j=1; j<colum; j++){
                System.out.println( driver.findElement(
                        By.xpath("//div/div[1]/div/div[1]/table/tr["+ i +"]/td["+ j +"]"))
                        .getText());

            }
        }
    }

}




