package src.test.java.tests.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Set;

public class P4_WindowHanleReusableMethods {
    // https://the-internet.herokuapp.com/iframe adresine gidin.
    // ReusableMethods da switchToWindow methodunu kullanarak Elemental Selenium yazisina tiklayalim
    // acilan windows'da Sponsored by Sauce Labs yazisi locate edip yazdirin

    @Test
    public void test01() {
        Driver.getDriver().get("https://the-internet.herokuapp.com/iframe");
        // ben click yapmadan var olan window'un handle'ni alsam
        String ilkSayfaHandleDegeri = Driver.getDriver().getWindowHandle();
        Driver.getDriver().findElement(By.linkText("Elemental Selenium")).click();

        ReusableMethods.waitFor(10); //  Thread.sleep(); yerine ReusableMethods dan cagirdik method da try-catch var
        // throw a gerek kalmadan sadece saniyeyi integer girdik :10sn

        ReusableMethods.switchToWindow("Elemental Selenium: Receive a Free, Weekly Tip on Using Selenium like a Pro");

        WebElement souceLabYazisiElementi = Driver.getDriver().findElement(By.xpath("//a[text()='Sauce Labs']"));
        System.out.println(souceLabYazisiElementi.getText());

    }
   //eskiden kullandigimiz method

    @Test
    public void test02() {
            // click yaptiktan sonra tum handle degerlerini alsam
            Driver.getDriver().get("https://the-internet.herokuapp.com/iframe");
            String ilkSayfaHandleDegeri=Driver.getDriver().getWindowHandle();
            Driver.getDriver().findElement(By.linkText("Elemental Selenium")).click();

            Set<String> handleListesi = Driver.getDriver().getWindowHandles();

            // elimizde icinde 2 handle degeri bulunan bir set var
            // Bunlardan biri ilk sayfanin handle degeri
            // ikinci sayfanin handle degerini nasil bulabilirim
            String ikinciSayfaHandleDegeri = "";
            for (String each : handleListesi
            ) {
                if (!each.equals(ilkSayfaHandleDegeri)) {
                    ikinciSayfaHandleDegeri = each;
                }
            }
            Driver.getDriver().switchTo().window(ikinciSayfaHandleDegeri);
            System.out.println("ikinci sayfanin title degeri :" + Driver.getDriver().getTitle());

        }


}
