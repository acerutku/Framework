import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatiorsIntro {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:/Users/Utku/Documents/Yeni klasör/driver/chromedriver.exe/");

        WebDriver driver = new ChromeDriver();
        driver.get("http://a.testaddressbook.com/sign_in");


        WebElement emailTextBox = driver.findElement(By.id("session_email"));
        emailTextBox.sendKeys("testtechproed@gmail.com");

        WebElement passwordTextBox = driver.findElement(By.id("session_password"));
        passwordTextBox.sendKeys("Test1234!");

        WebElement signinButton = driver.findElement(By.name("commit"));
        signinButton.click();

    driver.manage().window().maximize();

    WebElement userID = driver.findElement(By.className("navbar-text"));

    String actualUserID = userID.getText();
    String expecteduserID = "testtechproed@gmail.com";

    if (actualUserID.equals(expecteduserID)){
        System.out.println("PASS");
    }else{
        System.out.println("FAIL");
        System.out.println("ACTUAL USER ID : "+actualUserID);
        System.out.println("EXPECTED USER ID : "+expecteduserID);
    }






    }
}
