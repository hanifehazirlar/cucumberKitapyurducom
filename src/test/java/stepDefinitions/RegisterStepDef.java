package stepDefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import pages.Pages;
import utils.ConfigReader;
import utils.ReusableMethods;

public class RegisterStepDef extends ReusableMethods {
    Pages pages = new Pages();
    @And("User click to Register Button")
    public void userClickToRegisterButton() {
        ReusableMethods.clickElement(pages.registerPage().registerButton);
    }

    @And("User types {string} to name box")
    public void userTypesToNameBox(String firstName) {
        ReusableMethods.enterKeys(pages.registerPage().firstNameBox, firstName);
    }

    @And("User types {string} to last name box")
    public void userTypesToLastNameBox(String lastName) {
        enterKeys(pages.registerPage().lastNameBox, lastName);

    }

    @And("User types {string} to email box")
    public void userTypesToEmailBox(String email) {
        enterKeys(pages.registerPage().emailBox, email);
    }

    @And("User types {string} to password box")
    public void userTypesToPasswordBox(String password) {
        enterKeys(pages.registerPage().passwordBox, password);
    }

    @And("User types {string} to confirmation password box")
    public void userTypesToConfirmationPasswordBox(String confirmPassword) {
        enterKeys(pages.registerPage().confirmPasswordBox, confirmPassword);
    }
    @And("User click personal data privacy check box")
    public void userClickPersonalDataPrivacyCheckBox() {
        clickElement(pages.registerPage().admitText);
        clickElement(pages.registerPage().privacyCheckBox);

    }

    @And("User click Register Button")
    public void userClickRegisterButton() {
     clickElement(pages.registerPage().register);
    }

    @And("User verifies Account Created message is visible")
    public void userVerifiesAccountCreatedMessageIsVisible() {

        Assert.assertEquals(pages.registerPage().accountText,"Hesabınız Oluşturuldu!");
    }
}
