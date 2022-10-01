package src.test.java.tests.day22;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FaceBookPage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class C02_FacebookTesti extends TestBaseRapor {


    @Test
    public void test01() throws InterruptedException {
        extentTest=extentReports.createTest("facebook","facebook isimle girilemedigi test edildi");
        Driver.getDriver().get("https://www.facebook.com/");
        extentTest.info("facebook sayfasina gidildi");
        FaceBookPage faceBookPage=new FaceBookPage();
        Faker faker=new Faker();
        faceBookPage.emailKutusu.sendKeys(faker.internet().emailAddress());
        extentTest.info("email bilgisi girildi");
        faceBookPage.passKutusu.sendKeys(faker.internet().password());
        extentTest.info("password bilgisi girildi");
        faceBookPage.loginButonu.click();
        extentTest.info("login butonu tiklandi");

        Assert.assertTrue(faceBookPage.girilemediYazisiElementi.isDisplayed());
        extentTest.pass("girilemedigi test edildi");

        ReusableMethods.waitFor(3);
    }
}
