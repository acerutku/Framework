package src.test.java.pages;

import utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class TrendyolPage {

  public   TrendyolPage(){
      PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//div[@class='modal-close']")
    public WebElement ilkPopupPencereKapat;

  @FindBy(xpath = "//input[@class='search-box']")
    public WebElement aramakutusu;

  @FindBy(xpath = "//div[@class='srch-rslt-title']")
  public  WebElement sonucYazisi;

  @FindBy(xpath = "(//p[@class='link-text'])[1]")
  public  WebElement siginYazisi;

  @FindBy(xpath = "//div[@class='login-button']")
  public WebElement girisYapButonu;

  @FindBy(id="login-email")
  public WebElement emailTextBox;

  @FindBy(xpath = "(//div[@class='image-overlay-body'])[100]")
  public WebElement Urun100;


  @FindBy(xpath = "(//p[@class='link-text'])[3]")
  public WebElement sepetimYazisi;

  @FindBy(xpath = "(//div[.='Sepete Ekle'])[3]")
  public WebElement urun3;

  @FindBy(xpath = "(//div[.='Sepete Ekle'])[5]")
  public WebElement urun5;

  @FindBy(xpath = "//div[@class='basket-preview-container']")
  public  WebElement sepetim;



  public static void mousuUzerineGotur(WebElement singInyazisi) {
    Actions actions=new Actions(Driver.getDriver());
    actions.moveToElement(singInyazisi).perform();

  }
  public static void loginol(WebElement emailTextBox) {
    Actions actions=new Actions(Driver.getDriver());
    Faker faker=new Faker();
    actions.click(emailTextBox).
            sendKeys(faker.internet().emailAddress()).
            sendKeys(Keys.TAB).
            sendKeys(faker.internet().password()).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
  }




}
