package src.test.java.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class P2_WebTablePage {

    public P2_WebTablePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id=\"mw-content-text\"]/div[1]/table[4]/caption")
    public WebElement nameOfList;

    @FindBy(xpath = "//*[@id=\"mw-content-text\"]/div[1]/table[4]/tbody/tr[4]")
    public WebElement fourthRow; //  (//tr)[22]

    @FindBy(xpath = "//*[@id=\"mw-content-text\"]/div[1]/table[4]/tbody/tr[5]/td[1]/span")
    public WebElement secondElement;  //   (//tr)[23]//td[1]

    @FindBy(xpath = "//*[@id=\"mw-content-text\"]/div[1]/table[4]/tbody/tr[5]/td[2]")
    public WebElement thirdElement;   //    (//tr)[23]//td[1]


}
