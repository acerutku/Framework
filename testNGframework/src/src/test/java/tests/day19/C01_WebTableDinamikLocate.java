package src.test.java.tests.day19;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HMCWebTablePage;
import pages.HotelMyCampPage;
import utilities.Driver;

public class C01_WebTableDinamikLocate {

    //3 test method'u olusturalim
    //1.method : satir numarasi verdiginde bana o satirdaki datalari yazdirsin
    //2.method : satir no ve data numarasi girdigimde verdigim datayi yazdirsin
    //3.method : sutun numarasi verdigimde bana tum sutunu yazdirsin

    HMCWebTablePage hmcWebTablePage;
    HotelMyCampPage hotelMyCampPage;
    @Test
    public void satirYazdirTesti(){
        hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.girisYap();
        // 1.method satir numarasi verdigimde bana o satirdaki datalari yazdirsin

        // 2.satiri yazdir  //tbody//tr[2]
        // 7.satiri yazdir //tbody//tr[7]

        hmcWebTablePage=new HMCWebTablePage();
        WebElement ucuncusatirElementi=hmcWebTablePage.satirGetir(4);

        System.out.println(ucuncusatirElementi.getText());

        Driver.closeDriver();
    }

    @Test
    public void hucreGetirTesti(){
        hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.girisYap();
        // 2. method satir no ve data numarasi girdigimde verdigim datayi yazdirsin
        hmcWebTablePage=new HMCWebTablePage();

        // 2.satirin 4.datasi   //tbody//tr[2]//td[4]
        // 4.satirin 5.datasi   //tbody//tr[4]//td[5]

        System.out.println("girdiginiz hucredki element : "+hmcWebTablePage.hucreWebelementGetir(5,3));
        Driver.closeDriver();
    }

    @Test
    public void sutunYazdirTesti(){
        hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.girisYap();
        // 3. sutun numarasi verdigimde bana tum sutunu yazdirsin
        hmcWebTablePage=new HMCWebTablePage();
        hmcWebTablePage.sutunYazdir(4);

        Driver.closeDriver();
    }
}
