package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HotelRoomCreation extends TestBase {
    @Test
    public void RoomCreateTest() throws InterruptedException {
        driver.get("http://www.fhctrip.com/admin/HotelRoomAdmin");
        WebElement usernameBox = driver.findElement(By.id("UserName"));
        WebElement passwordBox = driver.findElement(By.id("Password"));
        Thread.sleep(5000);
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        usernameBox.sendKeys("manager2");
        passwordBox.sendKeys("Manager2!");
        loginButton.click();
        //Add hotell room butonuna tikla
        WebElement hotelRoomButton = driver.findElement(By.xpath("//span[@class='hidden-480']"));
        hotelRoomButton.click();
        WebElement IDHotel = driver.findElement(By.id("IDHotel"));
        Select select = new Select(IDHotel);
        select.selectByIndex(7);
        WebElement codeBox = driver.findElement(By.id("Code"));
        codeBox.sendKeys("1234");
        WebElement nameBox = driver.findElement(By.id("Name"));
        nameBox.sendKeys("Ali");
        WebElement locationBox = driver.findElement(By.id("Location"));
        locationBox.sendKeys("Istanbul");
        WebElement descriptionBox = driver.findElement(By.xpath("//textarea[@dir='ltr']"));
        descriptionBox.sendKeys("Cift odasi");
        //price kismi

        WebElement kaynak = driver.findElement(By.xpath("//li[@data-id='500']"));
        WebElement hedef = driver.findElement(By.id("Price"));
        actions.dragAndDrop(kaynak,hedef).perform();

        WebElement roomType = driver.findElement(By.id("IDGroupRoomType"));
        Select select1 = new Select(roomType);
        select1.selectByVisibleText("King");

        WebElement adultCount = driver.findElement(By.id("MaxAdultCount"));
        adultCount.sendKeys("2");

        WebElement childrenCount = driver.findElement(By.id("MaxChildCount"));
        childrenCount.sendKeys("1");

        WebElement saveButton = driver.findElement(By.id("btnSubmit"));
        saveButton.click();

        //explicit wait



        WebElement listofHotel = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[3]/div/div/div[1]/div[1]"));
        Assert.assertTrue(listofHotel.isDisplayed());

    }
}
