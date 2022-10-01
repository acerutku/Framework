package com.techproed.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceLoginPage {

    //COOOOOOOKKKKKKKKKKKK ONEMLIIIIIIIIIIIIII////

    //create driver
    WebDriver driver;
    // constructor kullanarak driver i baslatalim
    public FaceLoginPage(WebDriver driver){
        this.driver=driver;
        //page objelerini baslatmak icin PageFactory.initElements() kullaniyoruz
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "pass")
    public WebElement pass;

    @FindBy(name = "login")
    public WebElement login;

    @FindBy(className = "_9ay7")
    public WebElement error_mesaj;




















}
