package src.test.java.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FaceBookPage {

public FaceBookPage (){
    PageFactory.initElements(Driver.getDriver(),this);
}
    @FindBy(id="email")
    public WebElement emailKutusu;

    @FindBy(id="pass")
    public WebElement passKutusu;

    @FindBy(xpath="//button[@name='login']")
    public WebElement loginButonu;

    @FindBy(className="_9ay7")
    public WebElement girilemediYazisiElementi;

    public void wait(int second) {
        try {
            Thread.sleep(second * 1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
