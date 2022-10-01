package src.test.java.tests.day18;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.Driver;

public class C01_E2ETesting {
    @Test (groups = "regression")
    public void createHotel(){
        HotelMyCampPage hotelMyCamp = new HotelMyCampPage();
        hotelMyCamp.girisYap();
        //6. Hotel Management/Hotel List menusunden ADD HOTEL butonuna tiklayin
        hotelMyCamp.bekle(3);
        hotelMyCamp.hotelManagementLinki.click();
        hotelMyCamp.hotelListLinki.click();
        hotelMyCamp.addHotelLinki.click();
        //7. Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
        Actions actions = new Actions(Driver.getDriver());
        Faker faker = new Faker();
        actions.click(hotelMyCamp.addHotelCodeKutusu).
                sendKeys(faker.address().zipCode()).
                sendKeys(Keys.TAB).
                sendKeys(faker.name().name()).
                sendKeys(Keys.TAB).
                sendKeys(faker.address().country()).
                sendKeys(Keys.TAB).
                sendKeys(faker.phoneNumber().phoneNumber()).
                sendKeys(Keys.TAB).
                sendKeys(Keys.PAGE_DOWN).
                sendKeys(faker.internet().emailAddress()).perform();
        hotelMyCamp.bekle(3);
        Select select = new Select(hotelMyCamp.addHotelDropdown);
        select.selectByIndex(1);
        //8. Save butonuna tıklayın.
        hotelMyCamp.addHotelSaveButonu.click();
        hotelMyCamp.bekle(2);
        //9. “HotelRoom was inserted successfully” textinin göründüğünü test edin.
        Assert.assertTrue(hotelMyCamp.saveUyariBoxYazisi.isDisplayed());
        //10. OK butonuna tıklayın.
        hotelMyCamp.saveUyariBoxOk.click();
        hotelMyCamp.bekle(3);
        Driver.closeDriver();
    }
}