package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.Pages;
import utils.ConfigReader;
import utils.Driver;
import utils.ReusableMethods;

public class LoginStepDef extends ReusableMethods {
    Pages pages = new Pages();
    @Given("User goes to url")
    public void userGoesToUrl() {
        Driver.getAppiumDriver().get("https://www.kitapyurdu.com/");
       }
    @When("User click to MyAccount Icon")
    public void userClickToMyAccountIcon() {
         ReusableMethods.tapOn(pages.homePage().myAccountIconWE);

    }

    @And("User send {string} to email box")
    public void userSendToEmailBox(String validEmail) {
        ReusableMethods.enterKeys(pages.loginPage().emailBox, ConfigReader.getProperty(validEmail));

    }

    @And("User send {string} to password box")
    public void userSendToPasswordBox(String validPassword) {
        pages.loginPage().passwordBox.sendKeys(ConfigReader.getProperty(validPassword),Keys.ENTER);



    }

    @And("User click loginButton on login page")
    public void userClickLoginButtonOnLoginPage() {

       // ReusableMethods.clickElement(pages.loginPage().loginButton); yukarida enter kullandigimiz icin buraya gerek kalmadi
    }

    @When("User clear the cookies")
    public void userClearTheCookies() {
        Driver.getAppiumDriver().manage().deleteAllCookies();
    }

    @Then("User see {string} text")
    public void userSeeText(String validEmail) {
        Assert.assertTrue(pages.loginPage().userEmailHeader.getText().contains(ConfigReader.getProperty(validEmail)));
    }
}
