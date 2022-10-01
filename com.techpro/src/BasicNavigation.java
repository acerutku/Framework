import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) throws InterruptedException {

         System.setProperty("webdriver.chrome.driver","C:/Users/Utku/Documents/Yeni klasör/driver/chromedriver.exe/");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
       //driver.get("http://www.amazon.com");
        //aynı class ta navigate to amazon page https://www.amazon.com/

        driver.navigate().to("http://www.amazon.com");
        // navigate back to google
        driver.navigate().back();
        // navigate forward to amazon
        driver.navigate().forward();
        //refresh the page
        driver.navigate().refresh();
        //maximize the window
        driver.manage().window().maximize();
        Thread.sleep(4000);
        //close the page
        driver.close();




    }


}
