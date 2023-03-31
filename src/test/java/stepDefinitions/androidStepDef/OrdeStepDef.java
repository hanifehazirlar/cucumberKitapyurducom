package stepDefinitions.androidStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import screens.RegisterScreen;
import screens.Screens;
import utils.ReusableMethods;

public class OrdeStepDef extends Screens {
   RegisterStepDef registerStepDef = new RegisterStepDef();
    @When("Android clicks a physical product")
    public void androidClicksAPhysicalProduct() {
       tapOn(orderScreen().firstProduct);
    }

    @And("Android clicks {string} with textview")
    public void androidClicksWithTextview(String text) {
        wait(3);
        tapOnElementWithText(text);
    }

    @And("Android fills in the information in the form with valid values")
    public void androidFillsInTheInformationInTheFormWithValidValues() {
        registerStepDef.androidTypesToNameBox("firstname");
        registerStepDef.androidTypesToLastNameBox("lastname");
        registerStepDef.androidTypesToEmailBox("email");
        registerStepDef.androidTypesToPasswordBox("password");
        registerStepDef.androidTypesToConfirmationPasswordBox("comfirmpassword");
        registerStepDef.androidClickPersonalDataPrivacyCheckBox();
        registerStepDef.androidClickRegisterButtonOnRegisterPage();


    }



    @And("Android clicks {string} button")
    public void androidClicksButton(String text) {
        wait(6);
        tapOnButtonWithText(text);
    }

    @And("Android clicks Sepetim button")
    public void androidClicksSepetimButton() {
        tapOn(orderScreen().myBasket);

    }

    @And("Android clicks Üye Ol button")
    public void androidClicksÜyeOlButton() {
        wait(10);
        jsclick(orderScreen().registerButton);
    }
}
