package src.test.java.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class HotelMyCampPage {
    public HotelMyCampPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement ilkLoginLinki;

    @FindBy(xpath = "//input[@id='UserName']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@id='Password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@id='btnSubmit']")
    public WebElement loginButonu;

    @FindBy(xpath = "//div[@class='validation-summary-errors']")
    public WebElement girisYapilamadiYaziElementi;

    @FindBy(xpath="//span[text()='ListOfUsers']")
    public WebElement basariliGirisYaziElementi;

    @FindBy(xpath = "//span[text()='Hotel Management']")
    public WebElement hotelManagementLinki;

    @FindBy(xpath = "//a[@href='/admin/HotelAdmin']")
    public WebElement hotelListLinki;

    @FindBy(xpath = "//a[@class='btn btn-circle btn-default']")
    public WebElement addHotelLinki;

    @FindBy(xpath = "//input[@id='Code']")
    public WebElement addHotelCodeKutusu;

    @FindBy ( xpath="//select[@id='IDGroup']")
    public WebElement addHotelDropdown;

    @FindBy (xpath ="//button[@id='btnSubmit']")
    public WebElement addHotelSaveButonu;

    @FindBy (xpath = "//div[@class='bootbox-body']")
    public WebElement saveUyariBoxYazisi;

    @FindBy (xpath = "//button[@data-bb-handler='ok']")
    public WebElement saveUyariBoxOk;

    @FindBy (xpath = "//a[@href='/admin/HotelRoomAdmin']")
    public WebElement hotelRoomsLink;

    @FindBy (xpath = "//span[@class='caption-subject font-green-sharp bold uppercase']")
    public WebElement listOfHotelRoomsText;


    public void bekle(int second) {
        try {
            Thread.sleep(second * 1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }


    public void girisYap(){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        ilkLoginLinki.click();
        usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        loginButonu.click();
    }

}
