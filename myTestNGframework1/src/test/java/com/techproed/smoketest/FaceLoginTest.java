package com.techproed.smoketest;

import com.techproed.pages.FaceLoginPage;
import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FaceLoginTest extends TestBase {
    @Test
    public void faceLoginTest() throws InterruptedException {

        //facebook a git
        // email sifre login butonuna tikla
        //giris yaparsa facebook logosunun gorunup gorunmedigini dogrula
        //giris yapamazsa hata mesajini goster

        driver.get("https://www.facebook.com/login/");
        FaceLoginPage faceLoginPage = new FaceLoginPage(driver);

        faceLoginPage.email.sendKeys("fakeusername");
        faceLoginPage.pass.sendKeys("fakepassword");
        faceLoginPage.login.click();

        Thread.sleep(5000);
        Assert.assertTrue(faceLoginPage.error_mesaj.isDisplayed());
        



    }
}
