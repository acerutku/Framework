import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitleTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/Utku/Documents/Yeni klasör/driver/chromedriver.exe/");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";

        if (actualTitle.equals(expectedTitle)){

            System.out.println("PASS");
        }else{
            System.out.println("FAIL");

        }




    }
}
