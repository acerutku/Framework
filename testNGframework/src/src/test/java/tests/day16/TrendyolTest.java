package src.test.java.tests.day16;


import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TrendyolPage;
import utilities.Driver;

import java.io.IOException;
import java.util.List;

public class TrendyolTest {


    @Test
    public void test01() throws IOException, InterruptedException {
        //trendyol gidelim
        Driver.getDriver().get("https://www.trendyol.com");

        //gittigimiz sayfanın trendyol oldugunu dogrulayalım

        boolean urlKontrol = Driver.getDriver().getCurrentUrl().contains("trendyol");
        Assert.assertTrue(urlKontrol);
        TrendyolPage tp = new TrendyolPage();
        tp.ilkPopupPencereKapat.click();
        Driver.getDriver().manage().deleteAllCookies();
        WebElement singInyazisi = Driver.getDriver().findElement(By.xpath("(//p[@class='link-text'])[1]"));
        TrendyolPage.mousuUzerineGotur(singInyazisi);
        tp.girisYapButonu.click();
        TrendyolPage.loginol(tp.emailTextBox);
        WebElement girilemediYazisi = Driver.getDriver().findElement(By.xpath("//div[@id='error-box-wrapper']"));

        Assert.assertTrue(girilemediYazisi.isDisplayed());
        String a = "girilemediYazisi";
        Driver.webelementinSsAl(girilemediYazisi, a);

        //arama kutusuna elma yazıp aratalım
        tp.aramakutusu.sendKeys("elma" + Keys.ENTER);

        //elma aramasının yapıldıgını dogrulayalım ve sonuc yazısını yazdıralım
        // boolean aramaDogrulama=tp.sonucYazisi.getText().contains("elma");
        String dogrulam = tp.sonucYazisi.getText();
        String istenen = "elma";
        Assert.assertTrue(dogrulam.contains(istenen));
        //  WebElement urun100=Driver.getDriver().findElement(By.xpath("(//div[@class='image-overlay-body'])[100]"));

         scrollKulan(Driver.getDriver());

        tp.urun3.click();
        Thread.sleep(2000);
        tp.urun5.click();
        Thread.sleep(2000);


        TrendyolPage.mousuUzerineGotur(tp.sepetimYazisi);
        tp.sepetimYazisi.click();
        String tumsayfaSsIsmi="1";
        Driver.tumSayfaSs(tumsayfaSsIsmi);
        List<WebElement> SepetUrunIsmi = Driver.getDriver().findElements(By.xpath("//p[@class='pb-item']"));
        List<WebElement> SepetUrunFiyat = Driver.getDriver().findElements(By.xpath("//div[@class='pb-basket-item-price']"));
        SepetUrunFiyat.stream().forEach(t -> System.out.println(t.getText() + " "));
        SepetUrunIsmi.stream().forEach(t -> System.out.println(t.getText() + " "));


        Driver.closeDriver();
    }



    public void scrollKulan(WebDriver driver) throws InterruptedException {
        TrendyolPage tp=new TrendyolPage();
        JavascriptExecutor jss=(JavascriptExecutor) driver;
        //jss.executeScript("arguments[0].scrollIntoView(true);",yuzuncuUrun);
        jss.executeScript("scroll(0,2500)");
        WebElement yuzuncuUrun = driver.findElement(By.xpath("(//div[@class='p-card-wrppr add-to-bs-card'])[100]"));
        Thread.sleep(2000);
        jss.executeScript("arguments[0].click()",yuzuncuUrun);
        Thread.sleep(3000);
    }


}
