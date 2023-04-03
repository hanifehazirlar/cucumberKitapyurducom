package stepDefinitions.androidStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import screens.RegisterScreen;
import screens.Screens;
import utils.ConfigReader;
import utils.ReusableMethods;

public class OrdeStepDef extends Screens {
   RegisterStepDef registerStepDef = new RegisterStepDef();
    @When("Android clicks a physical product")
    public void androidClicksAPhysicalProduct() {

        tapOn(orderScreen().firstProduct);
    }

    @And("Android clicks {string} with textview")
    public void androidClicksWithTextview(String text) {
        wait(6);
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
        //tapOnButtonWithText(text);
        tapOn(orderScreen().loginRegisterButton);
    }

    @And("Android clicks Sepetim button")
    public void androidClicksSepetimButton() {
        wait(5);
        tapOn(orderScreen().myBasket);

    }

    @And("Android clicks Üye Ol button")
    public void androidClicksÜyeOlButton() {

        tapOn(orderScreen().registerButton);
    }

    @And("The Android fills in the information on the address page")
    public void theAndroidFillsInTheInformationOnTheAddressPage() {
        wait(5);
        enterKeys(adressScreen().nameBox, registerStepDef.fakeFirstname);
        enterKeys(adressScreen().lastNameBox,registerStepDef.fakeLastname);
        tapOnButtonWithText("Türkiye");
        wait(3);
        tapOnButtonWithText("Türkiye");
        wait(3);
        tapOn(adressScreen().cityBox);
        wait(3);
        enterKeys(adressScreen().searchBox, ConfigReader.getProperty("Ilseciniz"));
        tapOnElementWithText(ConfigReader.getProperty("Ilseciniz"));
        tapOn(adressScreen().cauntyBox);
        enterKeys(adressScreen().searchBox, ConfigReader.getProperty("Ilceseciniz"));
        tapOnElementWithText(ConfigReader.getProperty("Ilceseciniz"));
        tapOn(adressScreen().districtBox);
        enterKeys(adressScreen().searchBox, ConfigReader.getProperty("Mahalleseciniz"));
        tapOnElementWithText(ConfigReader.getProperty("Mahalleseciniz"));
        enterKeys(adressScreen().addressText, ConfigReader.getProperty("Adres"));
        enterKeys(adressScreen().telephoneBox, ConfigReader.getProperty("SabitTelefon"));
        enterKeys(adressScreen().mobilTelephoneBox,ConfigReader.getProperty("CepTelefon") );
        tapOn(adressScreen().submitButton);


    }

    @And("Android clicks pttKargo radio button")
    public void androidClicksPttKargoRadioButton() {
    }

    @And("Android clicks Continue Button")
    public void androidClicksContinueButton() {
        tapOnElementWithText("Devam Et");
    }

    @And("Android clicks BankTransfer Radio Button")
    public void androidClicksBankTransferRadioButton() {
        tapOn(adressScreen().bankTransferRadioButton);

    }

    @And("Android verifies total price")
    public void androidVerifiesTotalPrice() {
    }

    @And("Android clicks preInformation checkBox")
    public void androidClicksPreInformationCheckBox() {
    }
}
