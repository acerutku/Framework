package com.techproed.smoketest;

import com.techproed.pages.FHCLoginPage;
import com.techproed.utilities.ConfigReader;
import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeTest extends TestBase {

    @Test
    public void gecersizUserNameTest(){

        driver.get(ConfigReader.getProperty("fhc_login_url"));

        FHCLoginPage fhcLoginPage = new FHCLoginPage(driver);

        fhcLoginPage.username.sendKeys(ConfigReader.getProperty("gecersiz_username"));
        fhcLoginPage.password.sendKeys(ConfigReader.getProperty("gecerli_password"));
        fhcLoginPage.loginButton.click();
        //Waite ihtiyac oldugunda explicit wait kullanmaliyiz
    //    WebDriverWait wait = new WebDriverWait(driver,10);
    //    WebElement tryagain = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[.='Try again please']")));
     //   Assert.assertTrue(tryagain.isDisplayed());

        //  WebElement wrongText = driver.findElement(By.xpath("//span[.='Try again please']"));
        //  Assert.assertTrue(wrongText.isDisplayed());
          Assert.assertTrue(fhcLoginPage.error_message.getText().contains(ConfigReader.getProperty("login_error_mesaj")));
    }

    @Test
    public void gecersizpassword(){
        driver.get("http://www.fhctrip.com/Account/Logon");
        FHCLoginPage fhcLoginPage = new FHCLoginPage(driver);
        fhcLoginPage.username.sendKeys(ConfigReader.getProperty("gecerli_username"));
        fhcLoginPage.password.sendKeys(ConfigReader.getProperty("gecersiz_password"));
        fhcLoginPage.loginButton.click();










    }






}
