package src.test.java.tests.day16;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FaceBookPage;
import utilities.Driver;

public class C03_FacebookTest {
    /*
    1- https://www.facebook.com/ adresine gidin
    2- POM’a uygun olarak email, sifre kutularini ve giris yap butonunu locate edin
    3- Faker class’ini kullanarak email ve sifre degerlerini yazdirip, giris butonuna basin
    4- Basarili giris yapilamadigini test edin
    //   //button[@title='Tüm Çerezlere İzin Ver']
     */
    @Test (groups = {"miniRegression","regression"})
    public void test01() throws InterruptedException {
        // amazon'a gidelim
        Driver.getDriver().get("https://www.facebook.com/");
        FaceBookPage faceBookPage=new FaceBookPage();
        Faker faker=new Faker();
        faceBookPage.emailKutusu.sendKeys(faker.internet().emailAddress());
        faceBookPage.passKutusu.sendKeys(faker.internet().password());
        faceBookPage.loginButonu.click();

        Assert.assertTrue(faceBookPage.girilemediYazisiElementi.isDisplayed());

        Thread.sleep(5000);
        Driver.closeDriver();

    }
}
