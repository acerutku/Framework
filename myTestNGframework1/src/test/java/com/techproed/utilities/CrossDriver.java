package com.techproed.utilities;

import com.techproed.utilities.ConfigReader;
import com.techproed.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

//Crossbrowser testi icin yeni bir driver class’i olusturacagiz
//Bu class’in gorevi xml dosyasindan parameter olarak gonderilen browser’i driver olarak
//tanimlamaktir. Xml dosyasindan parametre gelmezse o zaman .properties dosyasinda
//tanimli browser’i kullanir

public class CrossDriver {
    private CrossDriver() {

    }
    public static WebDriver driver;
    public static WebDriver getDriverCross(String browser){  //getDriver methoduna parameter ekleyecegiz
        // buraya parametre olarak yazdigimiz browser sayesinde
        // coklu testler ,calistirilirken arada CrossDriver'a yeni
        // browser atamasi yapabilmemize imkan tanimasi icindir

        browser = browser == null ? ConfigReader.getProperty("browser") : browser;

        if(driver==null){

            switch (browser){  //switch case’deki degeri degistirelim
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
