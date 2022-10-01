package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

public class UploadFile extends TestBase {
    @Test
    public void uploadFile(){
        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement chooseFileButton = driver.findElement(By.id("file-upload"));
        String filePath = "C:\\Users\\Utku\\Desktop\\galatasaray-logo-41685.html" ;
        chooseFileButton.sendKeys(filePath);
        //Yuklemek istedigin file i sec
        //upload butonuna bas
       WebElement uploadButton = driver.findElement(By.id("file-submit"));
        uploadButton.click();

        //file uploaded textinin goruntulendigini dogrula
        Assert.assertEquals(driver.findElement(By.xpath("//h3")).getText(),"File Uploaded!");
    }

}
