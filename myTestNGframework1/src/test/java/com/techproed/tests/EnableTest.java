package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EnableTest extends TestBase {
    @Test
    public void enableTest(){
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
      WebElement enableButton = driver.findElement(By.xpath("//button[@onclick='swapInput()']"));
        enableButton.click();
        //explicitWait gerekli cunku yukleme icin vakit gerekli



        //textbox in etkin olup olmadigini dogrula
        WebElement textBox = driver.findElement(By.xpath("//input[@type='text']"));
        boolean isEnable = textBox.isDisplayed();
        Assert.assertTrue(isEnable);

        //isEnabled();  => bir elementin etkin olup olmadigini kontrol eder
        //isDisplayed() => bir elementin gorunup gorunmedini kontrol eder
        //isSelected()  => radio button ve checkbox

    }
}
