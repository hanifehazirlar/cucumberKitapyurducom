package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import screens.HomeScreen;
import utils.ConfigReader;
import utils.Driver;
import utils.ReusableMethods;

import java.util.Set;

public class LoginStepdefs {
    HomeScreen homeScreen = new HomeScreen();
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
        ReusableMethods.tapOn(homeScreen.myAccountIconWE);

    }

    @And("User send {string} to email box")
    public void userSendToEmailBox(String validEmail) {
        ReusableMethods.enterKeys(homeScreen.emailBoxWE, ConfigReader.getProperty("validEmail"));

    }

    @And("User send {string} to password box")
    public void userSendToPasswordBox(String validPassword) {
        ReusableMethods.enterKeys(homeScreen.passwordBoxWE,ConfigReader.getProperty("validPassword"));

    }

    @And("User click loginButton on login page")
    public void userClickLoginButtonOnLoginPage() {
        ReusableMethods.tapOn(homeScreen.loginButtonWE);
    }

    @Then("User see hesabim text")
    public void userSeeHesabimText() {
    }

    @When("User clear the cookies")
    public void userClearTheCookies() {
    }
}
