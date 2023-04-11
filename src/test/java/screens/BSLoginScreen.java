package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
import utils.DriverBrowserStack;

import java.net.MalformedURLException;
import java.time.Duration;

public class BSLoginScreen {
    public BSLoginScreen() throws MalformedURLException, InterruptedException {
        PageFactory.initElements(new AppiumFieldDecorator(DriverBrowserStack.browserStackAndroid(), Duration.ofSeconds(30)), this);
    }
    @AndroidFindBy( id= "com.mobisoft.kitapyurdu:id/btn_ic_header_account")
    public MobileElement myAccount;

    @AndroidFindBy(id = "com.mobisoft.kitapyurdu:id/editTextMail")
    public MobileElement emailBox;

    @AndroidFindBy(id = "com.mobisoft.kitapyurdu:id/editTextPassword")
    public MobileElement passwordBox;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[3]/android.widget.TextView")
    public MobileElement loginButton;


    @AndroidFindBy(xpath = "//*[@id=\"firstname\"]")
    public MobileElement nameBox;
}
