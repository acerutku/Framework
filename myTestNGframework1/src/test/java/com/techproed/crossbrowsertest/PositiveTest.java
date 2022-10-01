package com.techproed.crossbrowsertest;

import com.techproed.utilities.TestBaseCross;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PositiveTest extends TestBaseCross {
    @Test
    public void positiveLoginTest() throws InterruptedException {
        driver.get("http://www.fhctrip.com/Account/Logon");
        WebElement userNameBox = driver.findElement(By.id("UserName"));
        WebElement passwordBox = driver.findElement(By.id("Password"));
        WebElement loginButton = driver.findElement(By.id("btnSubmit"));
        userNameBox.sendKeys("manager2");
        passwordBox.sendKeys("Manager2!");
        loginButton.click();

    }
}
