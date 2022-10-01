package src.test.java.tests.day18;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.Driver;

public class C03_E2ETesting {

        //1. Tests packagenin altına class olusturun: D18_HotelRoomCreation
        //2. Bir metod olusturun: RoomCreateTest()
        //3.https://qa environment.concorthotel.com/ adresine gidin.
        //4. Username textbox ve password metin kutularını locate edin ve aşağıdaki verileri girin.
        //a. Username: manager
        // b. Password : Manager 1
        //5. Login butonuna tıklayın.
        //6. Hotel Management menusunden Add Hotelroom butonuna tıklayın.
        //7. Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
        //8. Save butonuna basin.
        //9. “HotelRoom was inserted successfully” textinin göründüğünü test edin.
        //10. OK butonuna tıklayın.
        //11. Hotel rooms linkine tıklayın.
        //12. "LIST OF HOTELROOMS" textinin göründüğünü doğrulayın.
        HotelMyCampPage hotelMyCampPage;
        @Test
        public void roomCreateTest(){
            hotelMyCampPage = new HotelMyCampPage();
            hotelMyCampPage.girisYap();
            //6. Hotel Management menusunden Add Hotelroom butonuna tıklayın.
            hotelMyCampPage.bekle(5);
            hotelMyCampPage.hotelManagementLinki.click();
            hotelMyCampPage.hotelListLinki.click();
            hotelMyCampPage.addHotelLinki.click();
            //7. Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
            Faker faker = new Faker();
            Actions actions = new Actions(Driver.getDriver());
            actions.
                    click(hotelMyCampPage.addHotelCodeKutusu).
                    sendKeys(faker.address().zipCode()).
                    sendKeys(Keys.TAB).
                    sendKeys(faker.name().fullName()).
                    sendKeys(Keys.TAB).
                    sendKeys(faker.address().fullAddress()).
                    sendKeys(Keys.TAB).
                    sendKeys(Keys.PAGE_DOWN).
                    sendKeys(Keys.PAGE_DOWN).
                    sendKeys(faker.phoneNumber().cellPhone()).
                    sendKeys(Keys.TAB).
                    sendKeys(faker.internet().emailAddress()).
                    perform();
            hotelMyCampPage.bekle(3);
            Select select = new Select(hotelMyCampPage.addHotelDropdown);
            select.selectByIndex(2);
            //8. Save butonuna basin.
            hotelMyCampPage.addHotelSaveButonu.click();
            hotelMyCampPage.bekle(3);
            //9. “HotelRoom was inserted successfully” textinin göründüğünü test edin.
            Assert.assertTrue(hotelMyCampPage.saveUyariBoxYazisi.isDisplayed());
            //10. OK butonuna tıklayın.
            hotelMyCampPage.saveUyariBoxOk.click();
            //11. Hotel rooms linkine tıklayın.
            hotelMyCampPage.hotelRoomsLink.click();
            //12. "LIST OF HOTELROOMS" textinin göründüğünü doğrulayın.
            Assert.assertTrue(hotelMyCampPage.listOfHotelRoomsText.isDisplayed());
            hotelMyCampPage.bekle(5);
            Driver.closeDriver();
        }
    }
