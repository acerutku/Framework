package src.test.java.tests.practice;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ReactShoppingPage;

import utilities.ConfigReader;
import utilities.Driver;

public class P0_ReactShoppingTest {

    @Test
    public void reactShopping() throws InterruptedException {
        ReactShoppingPage reShoppingPage=new ReactShoppingPage();
        //// 1."https://react-shopping-cart-67954.firebaseapp.com/" adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("reactShoppingUrl"));
        //// 2.Web sitesindeki tüm öğeleri listeleyin ve yazdirin    (sitede 16 urun var, 1.urun : 2.urun :.....seklinde yazdirin )
        reShoppingPage.urunlerinIsimleriniYazdir();
        //// 3.Stringlerden olusan bir ArrayList oluşturun ve Ürün Adlarını ArrayList'e yerleştirin
        System.out.println("");
        reShoppingPage.stringArrayListYazdir();
        //// 4.Siteden Rastgele 5 öğe seçin, sepete ekleyin ve sectiginiz öğelerin adlarını yazdırın (Her ürün 1 defadan fazla eklenemez!)
        reShoppingPage.rastgeleUrunSec(5);
        //// 5.Her bir öğenin fiyatını toplayın ve sonucunuzu web sitesiyle karşılaştırın
        //reShoppingCardPage.secilenUrunFiyatTopla();
        Assert.assertEquals(reShoppingPage.sepettekiUrunlerinToplami.getText(),reShoppingPage.secilenUrunFiyatTopla());
        //// 6.Sonuçlar eşleşiyorsa  konsola test pass yazirin
        System.out.println("Fiyat Toplamı Testi: Pass");
        //// 7.Checkout'a tıklayın
        reShoppingPage.checkOutButonElementi.click();
        Thread.sleep(3000);
        Driver.closeDriver();
    }
}
