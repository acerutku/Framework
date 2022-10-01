package src.test.java.tests.practice;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P1_DemoGuruPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class P1_DemoGuruTest extends TestBaseRapor {
    /*
    http://demo.guru99.com/test/drag_drop.html url e git
    DEBIT SIDE da Account bolumune BANK butonunu surukle ve birak
    CREDIT SIDE da Account bolumune SALES butonunu surukle ve birak
    DEBIT SIDE da Amount bolumune 5000 butonunu surukle ve birak
    CREDIT SIDE da Amount bolumune ise ikinci 5000  butonunu surukle ve birak
    Perfect butonun goruntulendigini dogrulayin
     */
    @Test
    public void test(){
        extentTest = extentReports.createTest("demoGuru Test", "drag-drop Test");
        Driver.getDriver().get(ConfigReader.getProperty("demoGuruUrl"));
        extentTest.info("istenilen url e gidildi");

        Actions actions = new Actions(Driver.getDriver());

        P1_DemoGuruPage p1_demoGuruPage = new P1_DemoGuruPage();

        actions.dragAndDrop(p1_demoGuruPage.bankButonu, p1_demoGuruPage.debitsideAccount).
                dragAndDrop(p1_demoGuruPage.salesButonu,p1_demoGuruPage.creditSideAccount).
                dragAndDrop(p1_demoGuruPage.firstnum5000Butonu,p1_demoGuruPage.debitsideAmount).
                dragAndDrop(p1_demoGuruPage.secondnum5000Butonu,p1_demoGuruPage.creditSideAmount).
                sendKeys(Keys.PAGE_DOWN).perform();
        extentTest.info("webElementler istenilen yere gonderildi");
        Assert.assertTrue(p1_demoGuruPage.perfectYazisi.isDisplayed());
        extentTest.pass("Perfect yazisi goruldu...");

        ReusableMethods.waitFor(4);
    }


}
