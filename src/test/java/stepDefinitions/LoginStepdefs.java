package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import utils.ConfigReader;
import utils.Driver;
import utils.ReusableMethods;

import java.util.Set;

public class LoginStepdefs {
    HomePage homePage = new HomePage();
    @Given("User goes to url")
    public void userGoesToUrl() {
        Driver.getAppiumDriver().get("https://www.kitapyurdu.com/");
       }
    @When("User click to loginButton")
    public void userClickToLoginButton() {
        System.out.println(Driver.getAppiumDriver().getContext()+ "<====app acildigindaki tur ");
        Set<String> butunTurler = Driver.getAppiumDriver().getContextHandles();
        for (String tur : butunTurler) {
            System.out.println(tur);
            if (tur.contains("WEBVIEW_chrome")) {
                Driver.getAppiumDriver().context(tur);
            }
        }
        System.out.println(Driver.getAppiumDriver().getContext() + "<========degisimden sonraki tur");
        System.out.println("gettitle : "+Driver.getAppiumDriver().getTitle());
        ReusableMethods.tapOn(homePage.myAccountIconWE);

    }

    @And("User send {string} to email box")
    public void userSendToEmailBox(String validEmail) {
        ReusableMethods.enterKeys(homePage.emailBoxWE, ConfigReader.getProperty(validEmail));

    }

    @And("User send {string} to password box")
    public void userSendToPasswordBox(String validPassword) {
        homePage.passwordBoxWE.sendKeys(ConfigReader.getProperty(validPassword),Keys.ENTER);



    }

    @And("User click loginButton on login page")
    public void userClickLoginButtonOnLoginPage() {

        //ReusableMethods.clickElement(homeScreen.loginButtonWE);
    }

    @Then("User see hesabim text")
    public void userSeeHesabimText() {
     ReusableMethods.isElementPresent(homePage.userNameText);

    }

    @When("User clear the cookies")
    public void userClearTheCookies() {
        Driver.getAppiumDriver().manage().deleteAllCookies();
    }

    @Then("User see {string} text")
    public void userSeeText(String validEmail) {
        Assert.assertTrue(homePage.emailHeaderText.getText().contains(ConfigReader.getProperty(validEmail)));
    }
}
