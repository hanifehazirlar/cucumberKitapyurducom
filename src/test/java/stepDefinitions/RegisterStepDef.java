package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import org.junit.Assert;
import pages.Pages;
import utils.ReusableMethods;

public class RegisterStepDef extends Pages {

    @And("User click to Register Button")
    public void userClickToRegisterButton() {
        ReusableMethods.clickElement(registerPage().registerButton);
    }
    String fakeFirstname,fakeLastname,fakeEmail,fakePassword;
    @And("User types {string} to name box")
    public void userTypesToNameBox(String firstName) {

        if (firstName.equals("firstname")) {
            fakeFirstname = getFaker().name().firstName();
            enterKeys(registerPage().firstNameBox, "TEST"+fakeFirstname);
        } else enterKeys(registerPage().firstNameBox, firstName);
    }

    @And("User types {string} to last name box")
    public void userTypesToLastNameBox(String lastName) {

        if (lastName.equals("lastname")) {
            fakeLastname = getFaker().name().lastName();
            enterKeys(registerPage().lastNameBox, "TEST"+fakeLastname);
        } else enterKeys(registerPage().lastNameBox, lastName);

    }

    @And("User types {string} to email box")
    public void userTypesToEmailBox(String eMail) {

        if (eMail.equals("email")) {
            fakeEmail = getFaker().internet().emailAddress();
            enterKeys(registerPage().emailBox, "TEST"+fakeEmail);
        } else enterKeys(registerPage().emailBox, eMail);

    }

    @And("User types {string} to password box")
    public void userTypesToPasswordBox(String passWord) {

        if (passWord.equals("password")) {
            fakePassword = getFaker().internet().password();
            enterKeys(registerPage().passwordBox, "TEST"+fakePassword);
        } else enterKeys(registerPage().passwordBox, passWord);

    }
    @And("User types {string} to confirmation password box")
    public void userTypesToConfirmationPasswordBox(String confirmPassword) {

        if (confirmPassword.equals("comfirmpassword")) {
            enterKeys(registerPage().confirmPasswordBox, "TEST"+fakePassword);
        } else enterKeys(registerPage().confirmPasswordBox, confirmPassword);

    }
    @And("User click personal data privacy check box")
    public void userClickPersonalDataPrivacyCheckBox() {
        clickElement(registerPage().admitText);
        clickElement(registerPage().privacyCheckBox);

    }

    @And("User click Register Button")
    public void userClickRegisterButton() {
     clickElement(registerPage().register);
    }

    @And("User verifies Account Created message is visible")
    public void userVerifiesAccountCreatedMessageIsVisible() {

        Assert.assertEquals(registerPage().accountText.getText(),"Hesabınız Oluşturuldu!");
    }
}
