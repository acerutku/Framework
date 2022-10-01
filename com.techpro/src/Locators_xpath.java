import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_xpath {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:/Users/Utku/Documents/Yeni klasör/driver/chromedriver.exe/");

        WebDriver driver = new ChromeDriver();
        driver.get("http://a.testaddressbook.com/sign_in");

        WebElement emailTextBox = driver.findElement(By.xpath("html/body/div/div/div/div/form/div[1]/input"));
        emailTextBox.sendKeys("testtechproed@gmail.com");
        WebElement passwordTextBox = driver.findElement(By.xpath("html/body/div/div/div/div/form/div[2]/input"));
        passwordTextBox.sendKeys("Test1234!");

        WebElement signinButton = driver.findElement(By.xpath("//input[@value='Sign in']"));
        signinButton.click();

    }
}