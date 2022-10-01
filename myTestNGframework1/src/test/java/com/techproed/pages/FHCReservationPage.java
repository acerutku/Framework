package com.techproed.pages;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FHCReservationPage extends TestBase {

   WebDriver driver;

    public FHCReservationPage(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(name = "IDUser")
    public WebElement idUser;
    @FindBy(name = "IDHotelRoom")
    public WebElement idHotelRoom;
    @FindBy(id = "Price")
    public WebElement price;
    @FindBy(id = "DateStart")
    public WebElement dateStart;
    @FindBy(id = "DateEnd")
    public WebElement dateEnd;
    @FindBy(id = "AdultAmount")
    public WebElement adultAmount;
    @FindBy(id = "ChildrenAmount")
    public WebElement childrenAmount;
    @FindBy(id = "ContactNameSurname")
    public WebElement contactInfo;
    @FindBy(id = "ContactPhone")
    public WebElement contactPhone;
    @FindBy(id = "ContactEmail")
    public WebElement contactMail;
    @FindBy(id = "Notes")
    public WebElement notes;
    @FindBy(id = "Approved")
    public WebElement approved;
    @FindBy(id = "IsPaid")
    public WebElement isPaid;
    @FindBy(id = "btnSubmit")
    public WebElement saveButton;
    @FindBy(className = "bootbox-body")
    public  WebElement reservationText;
    @FindBy(xpath = "//button[@data-bb-handler='ok']")
    public  WebElement okButton;



}
