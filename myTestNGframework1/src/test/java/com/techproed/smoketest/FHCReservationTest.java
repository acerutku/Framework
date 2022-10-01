package com.techproed.smoketest;

import com.techproed.pages.FHCLoginPage;
import com.techproed.pages.FHCReservationPage;
import com.techproed.utilities.TestBaseFinal;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FHCReservationTest extends TestBaseFinal {

    @Test
    public void fhcreservationTest() throws InterruptedException {
        //loginpage den giris yapildi
        driver.get("http://www.fhctrip.com/admin/RoomReservationAdmin/Create");
        FHCLoginPage fhcLoginPage = new FHCLoginPage(driver);
        fhcLoginPage.login2();
        //reservation page den veri cekiliyor
        FHCReservationPage fhcReservationPage = new FHCReservationPage(driver);



        Select idUserSelect = new Select(fhcReservationPage.idUser);
        idUserSelect.selectByIndex(1);

        Select idHotelRoomSelect = new Select(fhcReservationPage.idHotelRoom);
        idHotelRoomSelect.selectByIndex(3);

        fhcReservationPage.price.sendKeys("500");
        fhcReservationPage.dateStart.sendKeys("08/18/2022");
        fhcReservationPage.dateEnd.sendKeys("09/22/2022");
        fhcReservationPage.adultAmount.sendKeys("2");
        fhcReservationPage.childrenAmount.sendKeys("0");
        fhcReservationPage.contactInfo.sendKeys("ali");
        fhcReservationPage.contactPhone.sendKeys("12345678951");
        fhcReservationPage.contactMail.sendKeys("ali@asd.com");
        fhcReservationPage.notes.sendKeys("yok");
        fhcReservationPage.approved.click();
        fhcReservationPage.isPaid.click();
        fhcReservationPage.saveButton.click();

            Thread.sleep(5000);
       Assert.assertTrue(fhcReservationPage.reservationText.isDisplayed());//1. ihtimal
       String mesaj = fhcReservationPage.reservationText.getText();
          fhcReservationPage.okButton.click();
  //  Assert.assertTrue(mesaj.equals("RoomReservation was inserted successfully"));








    }



}
