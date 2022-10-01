package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateHotel extends TestBase {
    @Test
    public void createHotel() throws InterruptedException {
        driver.get("http://www.fhctrip.com/admin/HotelAdmin/Create");
        WebElement usernameBox = driver.findElement(By.id("UserName"));
        WebElement passwordBox = driver.findElement(By.id("Password"));
        Thread.sleep(6000);
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        usernameBox.sendKeys("manager2");
        passwordBox.sendKeys("Manager2!");
        loginButton.click();

        driver.findElement(By.id("Code")).sendKeys("Butik");
        driver.findElement(By.id("Name")).sendKeys("Ali");
        driver.findElement(By.id("Address")).sendKeys("ISTANBUL");
        driver.findElement(By.id("Phone")).sendKeys("55558858656");
        driver.findElement(By.id("Email")).sendKeys("sunset@gmail.com");
        WebElement IDGroup = driver.findElement(By.id("IDGroup"));
        Select select = new Select(IDGroup);
        select.selectByIndex(2);
        WebElement saveButton = driver.findElement(By.id("btnSubmit"));
        saveButton.click();



    }
}
