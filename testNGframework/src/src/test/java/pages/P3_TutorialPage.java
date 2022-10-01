package src.test.java.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class P3_TutorialPage {

    public P3_TutorialPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText="Phones & PDAs")
    public WebElement phonesPDAs;

    @FindBy(xpath = "//div[@class='caption']/h4")  //3 telefon ismmi de h4 tagname de, bulamazsa uste cikarak buluruz
    public List<WebElement> products;

    @FindBy(xpath = "//*[text()='Add to Cart']")
    public List<WebElement> addAllCart;

    @FindBy(xpath = "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
    public WebElement clickBlackButton;

    @FindBy(xpath = "//td[@class='text-left']")  //en solda urunlerin kendisi tr/td/td
    public List<WebElement> sepettekiUrunler;

    @FindBy(xpath = "//td[.='$583.19']")
    public WebElement totalPrice;

}
