package src.test.java.tests.day16;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
public class C01_DriverIlkTest {
    @Test
    public void test01(){
        // amazon'a gidelim
        Driver.getDriver().get("https://www.amazon.com");

        // amazona gittigimizi test edelim
        String actualTitle=Driver.getDriver().getTitle();
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualTitle.contains("Amazon"));

        // Driver.getDriver method'u her calistiginda
        // driver= new ChromeDriver(); komutundan oturu yeni bir driver olusturuyor
        // Biz Driver class'dan getDriver'i ilk calistirdigimizda new atamasi olsun
        // sonraki calistirmalarda atama olmasin istiyoruz
        // bunun icin driver= new ChromeDriver(); satiri bir if blogu icine alacagiz
        Driver.closeDriver();
    }
    @Test
    public void test02(){
        // bestbuy anasayfaya gidelim
        Driver.getDriver().get("https://www.bestbuy.com");

        // bestbuy'a gittigimizi test edelim
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains("bestbuy"));
        Driver.closeDriver();
    }
}