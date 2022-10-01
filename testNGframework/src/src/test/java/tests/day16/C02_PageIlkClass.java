package src.test.java.tests.day16;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C02_PageIlkClass {

    // amazon sayfasina gidip
    // nutella icin arama yapin
    // sonuc sayisini yazdirin ve sonuc yazisinin nutella icerdigini test edin

    @Test
    public void test01(){
        Driver.getDriver().get("https://www.amazon.com");
        AmazonPage amazonPage =new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("nutella"+ Keys.ENTER);
        System.out.println(amazonPage.sonucYazisiElementi.getText());
        Assert.assertTrue(amazonPage.sonucYazisiElementi.getText().contains("nutella"));
        Driver.closeDriver();
    }

    // amazon sayfasina gidip
    // java icin arama yapin
    // sonuc sayisini yazdirin ve sonuc yazisinin java icerdigini test edin

    @Test (groups = {"miniRegression","smoke"})
    public void test02(){
        Driver.getDriver().get("https://www.amazon.com");
        AmazonPage amazonPage =new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("java"+ Keys.ENTER);
        System.out.println(amazonPage.sonucYazisiElementi.getText());
        Assert.assertTrue(amazonPage.sonucYazisiElementi.getText().contains("java"));
        Driver.closeDriver();
    }
}
