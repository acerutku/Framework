package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.FHCtripLoginPage;
import utilities.Driver;

public class FHCtrip_Login_StepDefinitions {
    FHCtripLoginPage fhCtripLoginPage = new FHCtripLoginPage();



    @Given("user is on the fhctriplogin page")
    public void user_is_on_the_fhctriplogin_page() {
        Driver.getDriver().get("http://www.fhctrip.com/Account/Logon");
    }
    @Given("user enters valid username")
    public void user_enters_valid_username() {
        fhCtripLoginPage.username.sendKeys("manager2");
    }
    @Given("user enters valid password")
    public void user_enters_valid_password() {
        fhCtripLoginPage.password.sendKeys("Manager2!");
    }
    @Given("user clicks login button")
    public void user_clicks_login_button() {
        fhCtripLoginPage.loginbutton.click();
    }


    @Then("verify login is successfull")
    public void verify_login_is_successfull() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("ListOfUsers"));
    }
    @Given("user enters valid username {string}")
    public void user_enters_valid_username(String string) {
        fhCtripLoginPage.username.sendKeys(string);
    }
    @Given("user enters valid password {string}")
    public void user_enters_valid_password(String string) {
        fhCtripLoginPage.password.sendKeys(string);
    }


}
