package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.Pages;
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

}
