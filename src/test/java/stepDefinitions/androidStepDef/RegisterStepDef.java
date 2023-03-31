package stepDefinitions.androidStepDef;

import io.cucumber.java.en.And;
import org.junit.Assert;
import screens.Screens;
import utils.ConfigReader;

public class RegisterStepDef extends Screens {
    @And("Android click to Free Register Button")
    public void androidClickToFreeRegisterButton() {
        tapOnElementWithText("Ücretsiz Üye Ol");
    }
    String fakeFirstname,fakeLastname,fakeEmail,fakePassword;
    @And("Android types {string} to name box")
    public void androidTypesToNameBox(String firstName) {
        if (firstName.equals("firstname")) {
            fakeFirstname = getFaker().name().firstName();
            enterKeys(registerScreen().nameBox, "TEST"+fakeFirstname);
        } else enterKeys(registerScreen().nameBox, firstName);

    }

    @And("Android types {string} to last name box")
    public void androidTypesToLastNameBox(String lastName) {
        if (lastName.equals("lastname")) {
            fakeLastname = getFaker().name().lastName();
            enterKeys(registerScreen().lastNameBox, "TEST"+fakeLastname);
        } else enterKeys(registerScreen().lastNameBox, lastName);
    }

    @And("Android types {string} to email box")
    public void androidTypesToEmailBox(String eMail) {
        if (eMail.equals("email")) {
            fakeEmail = getFaker().internet().emailAddress();
            enterKeys(registerScreen().emailBox, "TEST"+fakeEmail);
        } else enterKeys(registerScreen().emailBox, eMail);
    }

    @And("Android types {string} to password box")
    public void androidTypesToPasswordBox(String passWord) {

        if (passWord.equals("password")) {
            fakePassword = getFaker().internet().password();
            enterKeys(registerScreen().passwordBox, "TEST"+fakePassword);
        } else enterKeys(registerScreen().passwordBox, passWord);
    }

    @And("Android types {string} to confirmation password box")
    public void androidTypesToConfirmationPasswordBox(String confirmPassword) {
        if (confirmPassword.equals("comfirmpassword")) {
            enterKeys(registerScreen().confirmPasswordBox, "TEST"+fakePassword);
        } else enterKeys(registerScreen().confirmPasswordBox, confirmPassword);
    }

    @And("Android click personal data privacy check box")
    public void androidClickPersonalDataPrivacyCheckBox() {
        tapOn(registerScreen().aggreementCheckBox);
    }

    @And("Android click Register Button on register page")
    public void androidClickRegisterButtonOnRegisterPage() {
        tapOn(registerScreen().registerButton);
    }

    @And("Android verifies Account Created message is visible")
    public void androidVerifiesAccountCreatedMessageIsVisible() {
        Assert.assertTrue(registerScreen().verifiesAccount.getText().contains(fakeEmail));

    }
}
