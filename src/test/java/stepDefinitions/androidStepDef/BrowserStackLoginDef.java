package stepDefinitions.androidStepDef;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import screens.BSLoginScreen;
import screens.Screens;
import utils.ConfigReader;
import utils.DriverBrowserStack;

import java.net.MalformedURLException;

public class BrowserStackLoginDef  {
    BSLoginScreen bsLoginScreen = new BSLoginScreen();

    public BrowserStackLoginDef() throws MalformedURLException, InterruptedException {
    }

    @And("Android Browser clicks to my account icon")
    public void androidBrowserClicksToMyAccountIcon() throws MalformedURLException, InterruptedException {

        //bsLoginScreen.myAccount.click();
        AndroidElement myAccount = (AndroidElement) new WebDriverWait(DriverBrowserStack.browserStackAndroid(), 30).until(
                ExpectedConditions.elementToBeClickable(
                        MobileBy.id("com.mobisoft.kitapyurdu:id/btn_ic_header_account")));
        myAccount.click();

    }

    @And("Android Browser enters {string} to email checkbox")
    public void androidBrowserEntersToEmailCheckbox(String validEmail) throws MalformedURLException, InterruptedException {

       // bsLoginScreen.emailBox.sendKeys(ConfigReader.getProperty(validEmail));
        AndroidElement email = (AndroidElement) new WebDriverWait(DriverBrowserStack.browserStackAndroid(), 30).
                until(
                ExpectedConditions.elementToBeClickable(
                        MobileBy.id("com.mobisoft.kitapyurdu:id/editTextMail")));
        email.sendKeys(validEmail);
    }

    @And("Android Browser enters {string} to password checkbox")
    public void androidBrowserEntersToPasswordCheckbox(String validPassword) throws MalformedURLException, InterruptedException {

       // bsLoginScreen.passwordBox.sendKeys(ConfigReader.getProperty(validPassword));
        AndroidElement password = (AndroidElement) new WebDriverWait(DriverBrowserStack.browserStackAndroid(), 30).until(
                ExpectedConditions.elementToBeClickable(
                        MobileBy.id("com.mobisoft.kitapyurdu:id/editTextPassword")));
        password.sendKeys(validPassword);
    }

    @And("Android Browser clicks login button")
    public void androidBrowserClicksLoginButton() throws MalformedURLException, InterruptedException {

        //bsLoginScreen.loginButton.click();

        AndroidElement loginButton = (AndroidElement) new WebDriverWait(DriverBrowserStack.browserStackAndroid(), 30).until(
                ExpectedConditions.elementToBeClickable(
                        MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[3]/android.widget.TextView")));
       loginButton.click();

    }

    @And("Android Browser verifies logged in")
    public void androidBrowserVerifiesLoggedIn()  {

       // Assert.assertEquals(registerScreen().verifiesAccount.getText(),ConfigReader.getProperty("validEmail"));
    }
}
