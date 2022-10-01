package src.test.java.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {
    // bir page sayfasi olusturuldugunda mutlaka yapmamiz gereken sey
    // bir //parametresiz constructor olusturup driver'a ilk degeri atamaktir (instantiate)
    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
    @FindBy(id="twotabsearchtextbox")
    public WebElement amazonAramaKutusu;

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement sonucYazisiElementi;
}