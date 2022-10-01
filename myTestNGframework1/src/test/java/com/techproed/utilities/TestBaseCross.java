package com.techproed.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.time.Duration;
//@Optional : Eger browser diye herhangi bir parametre gelmezse bile burasi calissin diyoruz
//Bize parametre olarak browser gelecek(gelirse) biz de o parametreyi kullanacagiz
//Bu  parametre, xml dosyasindan gelecek
public abstract class TestBaseCross {
    public WebDriver driver;

    @Parameters ("browser")
    @BeforeMethod
    public void setUp(@Optional String browser) {
        driver = CrossDriver.getDriverCross(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @AfterMethod
    public void teardown() {
        CrossDriver.closeDriver();
    }

}