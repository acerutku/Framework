package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.netty.handler.codec.spdy.SpdyWindowUpdateFrame;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown {

    WebDriver driver;
    @Before
            public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");

    }
    @Test
    public void dropDownTest(){
//DROPDOWN ICIN SELECT CLASS I KULLANILIR
        // DROPDOWN I ID ILE LOCATE EDELIM
        WebElement selectElement = driver.findElement(By.id("dropdown"));
        Select options = new Select(selectElement);
        //ARTIK OLUSTURULUAN OBJECTI DROPDOWN A ULASMAK ICIN KULLANABILIRIZ
        //getFirstSelectedOption(); => dropdowndaki default value yu verir
        String firstoption = options.getFirstSelectedOption().getText();
        System.out.println("FIRST SELECTED OPTION: " +firstoption) ;
        //select by INDEX
        options.selectByIndex(1);

        //select by value
       options.selectByValue("2");
        //select by visible text
        options.selectByVisibleText("Option 1");

        List<WebElement> allOptions = options.getOptions();
        for (WebElement element : allOptions){
            System.out.println(element.getText());
        }
        int size = allOptions.size();
        if (size==4) {
            System.out.println("TRUE");
        }else{
            System.out.println("FALSE");
        }
        //VEYA
        //assetion kullanarak
        // Assert.assertTrue(size==4); //fail
        Assert.assertFalse(size==4);
        //VEYA
        System.out.println((allOptions.size()==4)  ? "True" :"False");



    }
    @After
    public void tearDown(){
        driver.close();
    }

}
