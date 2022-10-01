package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DataTablePage;
import utilities.Driver;

public class ScenarioOutlineExampleSteps {
    DataTablePage dataTablePage = new DataTablePage();
    @Given("User is on the datatables homepage")
    public void user_is_on_the_datatables_homepage() {
        Driver.getDriver().get("https://editor.datatables.net/");
    }
    @When("User clicks on new button")
    public void user_clicks_on_new_button() {
        dataTablePage.newButton.click();
    }
    @When("User enters first name")
    public void user_enters_first_name() {
        dataTablePage.firstName.sendKeys("Veli");
    }
    @When("User enters last name")
    public void user_enters_last_name() {
        dataTablePage.lastName.sendKeys("Can");
    }
    @When("User enters position")
    public void user_enters_position() {
        dataTablePage.position.sendKeys("QA");
    }
    @When("User enters office")
    public void user_enters_office() {
        dataTablePage.office.sendKeys("Istanbul");
    }
    @When("User enters extension")
    public void user_enters_extension() {
        dataTablePage.extension.sendKeys("888");
    }
    @When("User enters start date")
    public void user_enters_start_date() {
        dataTablePage.startDate.sendKeys("2022-04-28");
    }
    @When("User enters salary")
    public void user_enters_salary() {
        dataTablePage.salary.sendKeys("80000");
    }
    @When("User clicks Create button")
    public void user_clicks_create_button() {
        dataTablePage.createButton.click();
    }
    @When("User enters firs name to the searchbox")
    public void user_enters_firs_name_to_the_searchbox() {
        dataTablePage.searchBox.sendKeys("Veli Can");
    }
    @Then("verify that user see the first name in the searchbox")
    public void verify_that_user_see_the_first_name_in_the_searchbox() {
       String name =  dataTablePage.nameField.getText();
        Assert.assertTrue(name.contains("Veli Can"));
    }
    @When("User enters first name {string}")
    public void user_enters_first_name(String string) {
        dataTablePage.firstName.sendKeys(string);
    }
    @When("User enters last name {string}")
    public void user_enters_last_name(String string) {
        dataTablePage.lastName.sendKeys(string);
    }
    @When("User enters position {string}")
    public void user_enters_position(String string) {
        dataTablePage.position.sendKeys(string);
    }
    @When("User enters office {string}")
    public void user_enters_office(String string) {
        dataTablePage.office.sendKeys(string);
    }
    @When("User enters extension {string}")
    public void user_enters_extension(String string) {
        dataTablePage.extension.sendKeys(string);
    }
    @When("User enters start date {string}")
    public void user_enters_start_date(String string) {
        dataTablePage.startDate.sendKeys(string);
    }
    @When("User enters salary {string}")
    public void user_enters_salary(String string) {
        dataTablePage.salary.sendKeys(string);
    }
    @When("User enters firs name {string} to the searchbox")
    public void user_enters_firs_name_to_the_searchbox(String string) {
        dataTablePage.searchBox.sendKeys(string);
    }
    @Then("verify that user see the first name {string} in the searchbox")
    public void verify_that_user_see_the_first_name_in_the_searchbox(String string) {
        String name =  dataTablePage.nameField.getText();
        Assert.assertTrue(name.contains(string));
    }



}
