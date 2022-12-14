package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FHCtripLoginPage {
    public FHCtripLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "UserName")
    public WebElement username;

    @FindBy(id = "Password")
    public WebElement password;

    @FindBy(id = "btnSubmit")
    public WebElement loginbutton;
    @FindBy(xpath = "//*[.='Create a new account']")
    public WebElement createButton;


}
