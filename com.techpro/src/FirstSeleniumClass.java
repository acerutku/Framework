import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumClass {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("web-driver.chrome.driver","C:/Users/Utku/Documents/Yeni klasör/driver/chromedriver.exe/");

        WebDriver driver = new ChromeDriver();
        WebDriver driver1 = new FirefoxDriver();
        driver1.get("http://www.amazon.com");
        driver.manage().window().maximize();

        driver.get("http://www.amazon.com");
        Thread.sleep(3000);
        driver.close();
        //close açtıgın sayfayı kapatır quit açtıgın bütün sayfaları



    }
}
