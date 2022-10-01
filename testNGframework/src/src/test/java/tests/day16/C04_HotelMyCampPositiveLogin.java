package src.test.java.tests.day16;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.Driver;

public class C04_HotelMyCampPositiveLogin {
    //1 ) Bir Class olustur : NegativeTest
    //2) Bir test method olustur NegativeLoginTest()
    //		 https://www. hotelmycamp.com/ adresine git
    //		login butonuna bas
    //	test data username: manager1 ,
    //	test data password : manager1!
    //	Degerleri girildiginde sayfaya girilemedigini test et

    @Test (groups = {"miniRegression","smoke"})
    public void pozitifLoginTesti(){
        // 1 ) Bir Class olustur : PositiveTest
        //2) Bir test method olustur positiveLoginTest()
        //		https://www. hotelmycamp.com/ adresine git
        Driver.getDriver().get("https://www.hotelmycamp.com/");
        //		login butonuna bas

        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.ilkLoginLinki.click();
        //	test data username: manager ,
        hotelMyCampPage.usernameBox.sendKeys("manager");

        //	test data password : Manager1!
        hotelMyCampPage.passwordBox.sendKeys("Manager1!");
        hotelMyCampPage.loginButonu.click();

        //	Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
    }

}
