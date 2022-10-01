package com.techproed.smoketest;

import com.techproed.pages.FHCLoginPage;
import com.techproed.utilities.ConfigReader;
import com.techproed.utilities.TestBase;
import org.testng.annotations.Test;

public class FHCNegativeTest extends TestBase {
    @Test
    public void fhcNegativeTest(){

        driver.get("http://www.fhctrip.com/Account/Logon");

        FHCLoginPage fhcLoginPage = new FHCLoginPage(driver);

        fhcLoginPage.username.sendKeys("fakeuser");
        fhcLoginPage.password.sendKeys("fakepassword");
        fhcLoginPage.loginButton.click();
        //Waite ihtiyac oldugunda explicit wait kullanmaliyiz


      //  WebElement wrongText = driver.findElement(By.xpath("//span[.='Try again please']"));
      //  Assert.assertTrue(wrongText.isDisplayed());
     //   Assert.assertTrue(fhcLoginPage.error_message.getText().contains("Try again please"));
    }

    @Test
    public void gecersizpassword(){

        driver.get(ConfigReader.getProperty("fhc_login_url"));
        FHCLoginPage fhcLoginPage = new FHCLoginPage(driver);
        fhcLoginPage.username.sendKeys(ConfigReader.getProperty("gecerli_username"));
        fhcLoginPage.password.sendKeys(ConfigReader.getProperty("gecersiz_password"));
        fhcLoginPage.loginButton.click();













    }






}
