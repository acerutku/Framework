package src.test.java.tests.day22;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.io.IOException;

public class C01_TestNGReports extends TestBaseRapor {

    @Test
    public void windowHandlereusableTest() throws IOException {
        extentTest=extentReports.createTest("window handle","title ile 2. sayfaya gecildigi test edildi");
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        extentTest.info("herokuapp sayfasina gidildi");

        Driver.getDriver().findElement(By.linkText("Click Here")).click();
        extentTest.info("yeni window handle linkine tiklandi");

        ReusableMethods.switchToWindow("New Window");
        extentTest.info("Reusable Method ile ikinci sayfaya gidildi");

        //String expectedTitle="New Window"; pass rapor icin
        String expectedTitle="New Window1";  //fail rapor icin
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);  //extentTest de genelde assertion a pass yapilir, diger stepler e info yazilir
        extentTest.pass("title in beklenen deger ile ayni oldugu test edildi");
        Driver.closeDriver();

        //html uzantili oldugu icin, raporlari gormek icin raporlar gittigi yerden dosyayi Open in-> Browser -> Chrome sec
    }
}
