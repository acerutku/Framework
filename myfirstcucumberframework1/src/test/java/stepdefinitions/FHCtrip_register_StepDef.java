package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.support.ui.Select;
import pages.FHCtripLoginPage;
import pages.FhcRegisterPage;
import utilities.Driver;

public class FHCtrip_register_StepDef {

    FHCtripLoginPage fhCtripLoginPage = new FHCtripLoginPage();
    FhcRegisterPage fhcRegisterPage = new FhcRegisterPage();
    @Given("kullanici fhctrip sayfasindadir")
    public void kullanici_fhctrip_sayfasindadir() {
        Driver.getDriver().get("http://www.fhctrip.com/Account/Logon");
    }
    @Given("kullanici {string} butonuna tiklar")
    public void kullanici_butonuna_tiklar(String string) {
        fhCtripLoginPage.createButton.click();
    }
    @Given("kullanici username girer")
    public void kullanici_username_girer() {
        fhcRegisterPage.username.sendKeys("Muzaffer");
    }
    @Given("kullanici password girer")
    public void kullanici_password_girer() {
        fhcRegisterPage.password.sendKeys("ASDass../';123123123");
    }
    @Given("kullanici email girer")
    public void kullanici_email_girer() {
        fhcRegisterPage.mail.sendKeys("acccv@gmail.com");
    }
    @Given("kullanici fullname girer")
    public void kullanici_fullname_girer() {
        fhcRegisterPage.fullname.sendKeys("Muzaffer Ala");
    }
    @Given("kullanici phone girer")
    public void kullanici_phone_girer() {
        fhcRegisterPage.phone.sendKeys("548754875485");
    }
    @Given("kullanici SSN girer")
    public void kullanici_ssn_girer() {
        fhcRegisterPage.ssnumber.sendKeys("654654564654");
    }
    @Given("kullanici Driver lisans girer")
    public void kullanici_driver_lisans_girer() {
        fhcRegisterPage.driverlicence.sendKeys("123123123123");
    }
    @Given("kullanici country dropdown secer")
    public void kullanici_country_dropdown_secer() {
        Select country = new Select(fhcRegisterPage.country);
        country.selectByVisibleText("Turkey");
    }
    @Given("kullanici state dropdown secer")
    public void kullanici_state_dropdown_secer() {
        Select state = new Select(fhcRegisterPage.state);
        state.selectByIndex(0);
    }
    @Given("kullanici address girer")
    public void kullanici_address_girer() {
        fhcRegisterPage.address.sendKeys("Istanbul");
    }
    @Given("kullanici working sector girer")
    public void kullanici_working_sector_girer() {
        fhcRegisterPage.sector.sendKeys("IT");
    }
    @Given("kullanici bithday girer")
    public void kullanici_bithday_girer() {
        fhcRegisterPage.birthdate.sendKeys("01/01/1990");
    }
    @Given("kullanici save butonuna tiklar")
    public void kullanici_save_butonuna_tiklar() {
        fhcRegisterPage.saveButton.click();
    }
    @Then("kullanci success mesajini gorur")
    public void kullanci_success_mesajini_gorur() {
        fhcRegisterPage.successmessage.isDisplayed();
    }









}
