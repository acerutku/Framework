package com.techproed.utilities;

import com.techproed.utilities.ConfigReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Driver {
    private Driver() {
        // Eger default cons'i yazar ve access modifier'ini private yaparsak,
        // Class disindan bu cons'a ulasilamaz ve dolayisiyla bu class'dan
        // obje uretilemez. Buna "SINGLETON CLASS" denir.

    }

    private static WebDriver  driver;
    public static WebDriver getDriver(){

        if(driver==null){   // bu if sayesinde kod calisirken bir kere new keyword ile driver olusturulunca
            // diger kullanimlarda new devreye girmeyecek
            switch (ConfigReader.getProperty("browser")){
                case "chrome" :
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver= new FirefoxDriver();
                    break;
                case "opera":
                    WebDriverManager.operadriver().setup();
                    driver= new OperaDriver();
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver= new EdgeDriver();
                    break;
                case "safari":
                    WebDriverManager.getInstance(SafariDriver.class);
                    driver=new SafariDriver();
                    break;
            }
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        return driver;
    }
    public static void closeDriver(){
        //en son yeniden null a atiyoruz ki sonra yeni test icin null oldugunu gorsun calissin
        if (driver!=null){
            driver.quit();
            driver=null;
        }
    }

    public static void webelementinSsAl(WebElement girilemediYazisi, String a) throws IOException {
        File webelementresim=new File("target/screenShot/"+a+".jpg");
        File geciciResim=girilemediYazisi.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(geciciResim,webelementresim);
    }
    public static void tumSayfaSs(String tumsayfaSsIsmi) throws IOException {
        TakesScreenshot tSs = (TakesScreenshot) Driver.getDriver();
        File tumsayfaSS = new File("target/screenShot/"+tumsayfaSsIsmi+".jpg");
        File geciciResim = tSs.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(geciciResim, tumsayfaSS);
    }
}