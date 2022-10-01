package com.techproed.smoketest;

import com.techproed.pages.FHCLoginPage;
import com.techproed.utilities.ConfigReader;
import com.techproed.utilities.TestBase;
import org.openqa.selenium.devtools.v85.cachestorage.model.CacheId;
import org.testng.annotations.Test;

public class FHCPositiveTest extends TestBase {
    @Test
    public void positiveTest(){
        driver.get(ConfigReader.getProperty("fhc_login_url"));

        FHCLoginPage fhcLoginPage = new FHCLoginPage(driver);

        fhcLoginPage.username.sendKeys(ConfigReader.getProperty("gecerli_username"));
        fhcLoginPage.password.sendKeys(ConfigReader.getProperty("gecerli_password"));
        fhcLoginPage.loginButton.click();

    }
}
