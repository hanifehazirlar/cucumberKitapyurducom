package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.Pages;
import utils.ReusableMethods;

public class OrderStepDef extends Pages {

    @When("User ckicks accept button on popup")
    public void userCkicksAcceptButtonOnPopup() {
        if (homePage().acceptCookiePopUp.size()!=0) {
           jsclick(homePage().acceptCookiePopUp.get(0));
        }
    }

    @When("User adds a  physical product to basket")
    public void userAddsAPhysicalProductToBasket() {
        clickElement(orderPage().physicalProduct);
    }

    @And("User clicks add to basket button")
    public void userClicksAddToBasketButton() {
        clickElement(orderPage().addBasket);
    }

    @And("User clicks my basket icon")
    public void userClicksMyBasketIcon() {
        clickElement(orderPage().basketIcon);

    }

    @And("User clicks buy icon")
    public void userClicksBuyIcon() {
    }

    @And("User clicks Now Register Button")
    public void userClicksNowRegisterButton() {
    }

    @And("The user fills in the information in the form with valid values")
    public void theUserFillsInTheInformationInTheFormWithValidValues() {
    }
}
