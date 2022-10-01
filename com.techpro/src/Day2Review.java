import jdk.swing.interop.SwingInterOpUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Review {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:/Users/Utku/Documents/Yeni klasör/driver/chromedriver.exe/");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.youtube.com/");

        String actualYoutubeTitle = driver.getTitle();
        String expectedYoutubeTitle = "youtube";

        if (actualYoutubeTitle.equals(expectedYoutubeTitle)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("ACTUAL YOUTUBE TITLE : " +actualYoutubeTitle);
            System.out.println("EXPECTED YOUTUBE TITLE :" +expectedYoutubeTitle);
        }

        String actualYoutubeURL = driver.getCurrentUrl();
        String expectedYoutubeURL = "youtube";

        if (actualYoutubeURL.contains(expectedYoutubeURL)) {
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("ACTUAL YOUTUBE URL :" +actualYoutubeURL);
        }
        driver.navigate().to("https://www.amazon.com");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.manage().window().maximize();

        String actualAmazonTitle =driver.getTitle();
        String expectedAmazonTitle = "Amazon";
        if (actualAmazonTitle.contains(expectedAmazonTitle)) {
            System.out.println("PASS");
            
        }else{
            System.out.println("FAIL");
            System.out.println("ACTUAL AMAZON TITLE:" +actualAmazonTitle);
        }
        String actualAmazonURL = driver.getCurrentUrl();
        String expectedAmazonURL = "https://www.amazon.com/";

        if (actualAmazonURL.equals(expectedAmazonURL)) {
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("ACTUAL AMAZON URL:" +actualAmazonURL );
        }
        driver.quit();

    }
    




}
