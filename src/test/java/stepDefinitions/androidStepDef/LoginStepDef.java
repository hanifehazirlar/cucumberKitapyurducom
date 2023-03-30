package stepDefinitions.androidStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import screens.Screens;
import utils.ConfigReader;
import utils.Driver;

public class LoginStepDef extends Screens {
    @Given("Anroid  on the main screen")
    public void anroidOnTheMainScreen() {
        Driver.getAppiumDriver();
    }

    @And("Android clicks to my account icon")
    public void androidClicksToMyAccountIcon() {
        tapOn(homeScreen().myAccount);

    }

    @And("Android enters {string} to email checkbox")
    public void androidEntersToEmailCheckbox(String email) {
        enterKeys(loginScreen().emailBox, ConfigReader.getProperty(email));


    }

    @And("Android enters {string} to password checkbox")
    public void androidEntersToPasswordCheckbox(String password) {
        enterKeys(loginScreen().passwordBox, ConfigReader.getProperty(password));
    }

    @And("Android clicks login button")
    public void androidClicksLoginButton() {
        //tapOn(loginScreen().loginButton);
        tapOnElementWithText("Giriş Yap");
    }



}