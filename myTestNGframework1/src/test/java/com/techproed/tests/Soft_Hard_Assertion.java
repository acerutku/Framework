package com.techproed.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Hard_Assertion {
    //http://a.testaddressbook.com/sign_in adresine gidin
    //email textbox password,textbox ve signin butonuna tıklayın
    //username: testtechproed@gmail.com
    //password:Test1234!
    //daha sonra farklı aassertions kullanarak sayfaya dogru giriş yaptıgını dogrula


    WebDriver driver;
   @BeforeClass
    public void setUp(){
       WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
       driver.get("http://a.testaddressbook.com/sign_in");

   }
    @Test(priority = 1)
    public void login(){
        WebElement emailBox = driver.findElement(By.id("session_email"));
        emailBox.sendKeys("testtechproed@gmail.com");
        WebElement passwordBox = driver.findElement(By.id("session_password"));
        passwordBox.sendKeys("Test1234!");
        WebElement signinbutton = driver.findElement(By.name("commit"));
        signinbutton.click();
        driver.manage().window().maximize();

    }
    @Test(dependsOnMethods ="login")
    public void homePage(){
       WebElement welcomeMessage = driver.findElement(By.xpath("//h1[.='Welcome to Address Book']"));
        System.out.println(welcomeMessage.getText());
        Assert.assertTrue(welcomeMessage.isDisplayed());//HARD ASSERT
        System.out.println("Hard Assert fail olursa bu satir calismayacak.");
        //Soft ASSERT
        //1.Adim create object
        SoftAssert softAssert = new SoftAssert();
        //2.Adim assertion icin olusturdugumuz objecti kullan
        softAssert.assertTrue(welcomeMessage.isDisplayed());//fail
        softAssert.assertTrue(welcomeMessage.isDisplayed());//pass
        softAssert.assertEquals(5,5);
        //3.adim assertAll();
        softAssert.assertAll(); //bu satir coooookkkkkk onemli assertAll(),gercek asertioni yapar
        //bu satir yazilmaz ise test ffail olmasi gerekstiginde pass olur THATS WHY IMPORTANT !!

        //daha sonra farklı assertions kullanarak testteshproed@gmail.com beklenen kullanıcı kimligini dogrulayın
        WebElement userID = driver.findElement(By.className("navbar-text"));
        String actualID = userID.getText();
        String expectedID ="testtechproed@gmail.com";
        Assert.assertEquals(actualID,expectedID);//HARD ASSERT

        //SOFT ASSERT
        //ikinci adim
        softAssert.assertEquals(actualID,expectedID);
        //3. adim
        softAssert.assertAll();



    }
    @AfterClass
    public void close(){
       driver.close();
    }
}
