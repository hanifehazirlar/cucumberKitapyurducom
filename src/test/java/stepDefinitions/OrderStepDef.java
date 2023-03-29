package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.Pages;
import utils.ConfigReader;
import utils.Driver;
import utils.ReusableMethods;

public class OrderStepDef extends Pages {
     RegisterStepDef registerStepDef=new RegisterStepDef();
    @When("User ckicks accept button on popup")
    public void userCkicksAcceptButtonOnPopup() {
       // clickElement(homePage().admitText);
        if (homePage().acceptCookiePopUp.size()!=0) {
           jsclick(homePage().acceptCookiePopUp.get(0));
        }
    }

    @When("User adds a  physical product to basket")
    public void userAddsAPhysicalProductToBasket() {

     jsclick(orderPage().secondProduct);
    }

    @And("User clicks add to basket button")
    public void userClicksAddToBasketButton() {
         wait(3);
       jsclick(orderPage().addBasket);
    }

    @And("User clicks my basket icon")
    public void userClicksMyBasketIcon() {
        jsclick(orderPage().basketIcon);

    }

    @And("User clicks buy icon")
    public void userClicksBuyIcon() {
        jsclick(orderPage().buyButton);

    }

    @And("User clicks Now Register Button")
    public void userClicksNowRegisterButton() {
        clickElement(registerPage().registerButton);
    }

    @And("The user fills in the information in the form with valid values")
    public void theUserFillsInTheInformationInTheFormWithValidValues() {

        registerStepDef.userTypesToNameBox("firstname");
        registerStepDef.userTypesToLastNameBox("lastname");
        registerStepDef.userTypesToEmailBox("email");
        registerStepDef.userTypesToPasswordBox("password");
        registerStepDef.userTypesToConfirmationPasswordBox("comfirmpassword");
        registerStepDef.userClickPersonalDataPrivacyCheckBox();

    }

    @And("User clicks Add adress button")
    public void userClicksAddAdressButton() {
        jsclick(orderPage().addAddressButton);
    }

    @And("The user fills in the information on the address page")
    public void theUserFillsInTheInformationOnTheAddressPage() {
        enterKeys(adressPage().namebox, registerStepDef.fakeFirstname);
        enterKeys(adressPage().lastnamebox, registerStepDef.fakeLastname);
        jsclick(adressPage().countryBox);
        jsclick(adressPage().turkiye);
        wait(3);
        jsclick(Driver.getAppiumDriver().findElement(By.xpath("//*[@data-name='"+ ConfigReader.getProperty("Ilseciniz") +"']")));
        jsclick(adressPage().cityBox);
        jsclick(Driver.getAppiumDriver().findElement(By.xpath("//*[@data-name='"+ ConfigReader.getProperty("Ilceseciniz") +"']")));
        jsclick(adressPage().townBox);
        jsclick(Driver.getAppiumDriver().findElement(By.xpath("//*[@data-name='"+ ConfigReader.getProperty("Mahalleseciniz") +"']")));
        enterKeys(adressPage().adressBox,ConfigReader.getProperty("Adres"));
        enterKeys(adressPage().telephoneBox,ConfigReader.getProperty("SabitTelefon"));
        enterKeys(adressPage().mobile_telephoneBox,ConfigReader.getProperty("CepTelefon"));
        wait(3);
        jsclick(adressPage().summitButton);



    }

    @Then("User verifies that they have successfully added the address")
    public void userVerifiesThatTheyHaveSuccessfullyAddedTheAddress() {
        Assert.assertEquals(adressPage().verifyMessage.getText(),"Adresinizi başarılı bir şekilde eklediniz");
    }

    @And("User clicks OK button")
    public void userClicksOKButton() {
        jsclick(adressPage().OKButton);
    }

    @And("User clicks continue button")
    public void userClicksContinueButton() {
        jsclick(orderPage().continueButton);
    }

    @And("User clicks Bank transfer radio button")
    public void userClicksBankTransferRadioButton() {
        jsclick(orderPage().bankTransferRadioBox);
    }

    @And("User clicks preinformation check box")
    public void userClicksPreinformationCheckBox() {
        jsclick(orderPage().preinformationCheckBox);

    }

    @And("User confirm order button")
    public void userConfirmOrderButton() {
        jsclick(orderPage().continueButton);

    }

    @Then("User verifies order created message is visible")
    public void userVerifiesOrderCreatedMessageIsVisible() {
        Assert.assertTrue(orderPage().siparisinizOnayMessage.getText().contains("Siparişiniz oluşturuldu."));
    }
}
