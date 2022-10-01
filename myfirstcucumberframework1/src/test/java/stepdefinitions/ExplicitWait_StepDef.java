package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver;


public class ExplicitWait_StepDef {



    @Given("user is on the demo page")
    public void user_is_on_the_demo_page() {
        Driver.getDriver().get("https://the-internet.herokuapp.com/dynamic_loading/1");
    }
    @Given("user clicks on start button")
    public void user_clicks_on_start_button() throws InterruptedException {
        WebElement startButton = Driver.getDriver().findElement(By.xpath("//button"));
        startButton.click();

}
    @Given("user wait until the page loads")
    public void user_wait_until_the_page_loads() throws InterruptedException {
        Thread.sleep(5000);

    }
    @Then("verify the Hello World! text is visible")
    public void verify_the_hello_world_text_is_visible() throws InterruptedException {

        WebElement helloWorldText = Driver.getDriver().findElement(By.xpath("//*[.='Hello World!']"));

        Assert.assertTrue(helloWorldText.isDisplayed());
    }

}
