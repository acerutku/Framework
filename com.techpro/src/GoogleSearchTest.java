import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {


    public static void main(String[] args) {

         System.setProperty("webdriver.chrome.driver","C:/Users/Utku/Documents/Yeni klasör/driver/chromedriver.exe/");


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        WebElement googleSearchBox = driver.findElement(By.name("q"));
        googleSearchBox.sendKeys( "city bike" );
        googleSearchBox.submit();
        WebElement allResults = driver.findElement(By.id("result-stats"));
        System.out.println(allResults.getText());














    }





}
