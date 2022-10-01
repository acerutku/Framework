package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowHandleExample extends TestBase {
    //https://the-internet.herokuapp.com/windows adresine git

    @Test
    public void newWindowTest(){
        driver.get("https://the-internet.herokuapp.com/windows");
        String parentWindowHandle = driver.getWindowHandle();
        System.out.println("PARENT WINDOW HANDLE => "+parentWindowHandle);

    //sayfadaki textin "openin a new window "oldugunu dogrula
      String actualText = driver.findElement(By.xpath("//h3")).getText();
      String expectedText = "Opening a new window";
      Assert.assertEquals(actualText,expectedText);

    // sayfa basliginin "the internet " oldugunu dogrula
      String actualTitle = driver.getTitle();
      String expectedTitle = "The Internet";
      Assert.assertEquals(actualTitle,expectedTitle);

    //click here butonuna tikla
        driver.findElement(By.linkText("Click Here")).click();

    //acilan yeni pencere de basligin new window oldugunu dogrula
        Set<String> allWindowHandles = driver.getWindowHandles();
        for (String childWindowHandle : allWindowHandles) {
            if (!childWindowHandle.equals(parentWindowHandle)) {
                driver.switchTo().window(childWindowHandle);
                System.out.println("CHILD WINDOW HANDLE =>"+childWindowHandle);
            }
        }
        String newWindowTitle = driver.getTitle();
        Assert.assertEquals(newWindowTitle,"New Window");

        //sayfadaki txtin New Window oldugunu dogrulayin
        String newWindowText = driver.findElement(By.xpath("//h3")).getText();
        Assert.assertEquals(newWindowText,"New Window");

        //bir onceki pencereye geri dondukten sonra sayfa basliginin the internet oldugunu dogrula
        driver.switchTo().window(parentWindowHandle);
        Assert.assertEquals(driver.getTitle(),"The Internet");






    }


}
