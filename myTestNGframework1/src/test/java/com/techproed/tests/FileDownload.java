package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FileDownload extends TestBase {

    //iki method olustur
    @Test
    public void isExist(){

        String mevcutKlasor = System.getProperty("user.dir");
        System.out.println("MEVCUT KLASOR=>"+mevcutKlasor);

        String userKlasor = System.getProperty("user.home");
        System.out.println("USER KLASOR=>"+userKlasor);

        String filePath = userKlasor + "\\Desktop\\galatasaray-logo-41685.html\\";
        boolean isFileExist = Files.exists(Paths.get(filePath));
        Assert.assertTrue(isFileExist);//eger dosya varsa pass yoksa fail olur

    }
    @Test
    public void downloadTest() throws InterruptedException {
        //https://the-internet.herokuapp.com/download adresine gidin
        driver.get("https://the-internet.herokuapp.com/download");
        //image1.jpg dosyasini indir
        WebElement image1 = driver.findElement(By.linkText("galatasaray-logo-41685.html"));
        image1.click();
        Thread.sleep(5000);//dosyanin yuklenmesi icin zamana ihtiyac olabilir
        //dosyanin basariyla indirildigini dogrula
        String userKlasor = System.getProperty("user.home");

        String filePath = userKlasor + "/Downloads/galatasaray-logo-41685.html/";

        boolean isDownloaded = Files.exists(Paths.get(filePath));
        Assert.assertTrue(isDownloaded);

    }

}
