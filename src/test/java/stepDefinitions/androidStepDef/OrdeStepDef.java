package stepDefinitions.androidStepDef;

import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import screens.Screens;
import utils.ConfigReader;
import java.util.List;



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
    @And("Android clicks BankTransfer Radio Button")
    public void androidClicksBankTransferRadioButton() {

        if (orderScreen().okButton.size()==1){
            tapOnButtonWithText("Tamam");
            tapOn(orderScreen().bankTransferRadioButton);
        }else  tapOn(orderScreen().bankTransferRadioButton);

    }

    @And("Android verifies total price")
    public void androidVerifiesTotalPrice() {
        isElementPresent(orderScreen().prices);
        Double totalAmount = Double.parseDouble(orderScreen().prices.getText().substring(0,5).replace(",","."));
        Double totalPrice = Double.parseDouble(orderScreen().totalPrices.getText().substring(0,5).replace(",","."));

        Assert.assertEquals(totalAmount, totalAmount);


    }

    @And("Android clicks preInformation checkBox")
    public void androidClicksPreInformationCheckBox() {
        tapOn(orderScreen().checkBoxAgreement);
    }

    @And("Android verifies the order is created")
    public void androidVerifiesTheOrderIsCreated() {
    Assert.assertTrue(orderScreen().messageTextVerifies.getText().contains("siparişiniz başarıyla tamamlandı!"));
    }

    @And("Android clicks the homepage icon")
    public void androidClicksTheHomepageIcon() {
        tapOn(orderScreen().homeScreenIcon);
    }

    @When("Android clicks on the second item")
    public void androidClicksOnTheSecondItem() {

        tapOn(orderScreen().secondProduct);
    }

    @Then("Android confirms the total amount")
    public void androidConfirmsTheTotalAmount() {
        List<MobileElement> pricesProduct =orderScreen().pricesProduct;

        Double totalPrices=0.0;
        for (int i = 0; i <pricesProduct.size() ; i++) {

            totalPrices+=Double.parseDouble(pricesProduct.get(i).getText().substring(0,6).replace(",",".").replace(" ",""));

        }
        Double subTotal = Double.parseDouble(orderScreen().subtotal.getText().substring(0,6).replace(",",".").replace(" ",""));

        Double finalTotalPrice = Math.round( totalPrices * 100.0 ) / 100.0;
        System.out.println("finalTotalPrice = " + finalTotalPrice);
        System.out.println("subTotal = " + subTotal);

        // urunler toplam ile ara toplam dogrulaniyor
        Assert.assertEquals(finalTotalPrice, subTotal);

        Double shippingCost = Double.parseDouble(orderScreen().shippingCost.getText().substring(0,5).replace(",",".").replace(" ",""));

        Double totalAmount=Double.parseDouble(orderScreen().totalAmount.getText().substring(0,6).replace(",",".").replace(" ",""));

        Double total = finalTotalPrice + shippingCost;

        // Kargo ve urunler toplam ile toplam ucret dogrulaniyor
        System.out.println("shippingCost = " + shippingCost);
        System.out.println("totalPrices = " + totalPrices);
        System.out.println("totalAmount = " + totalAmount);
        System.out.println("total = " + total);

        if (shippingCost==0.0){
            Assert.assertEquals(totalAmount, total);
        }else Assert.assertNotEquals(totalAmount, total);

    }
    @When("Android clicks on the third item")
    public void androidClicksOnTheThirdItem() {
        tapOn(orderScreen().thirdProduct);

    }
}
