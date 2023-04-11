package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverBrowserStack {

    //private static AppiumDriver<MobileElement> appiumDriver;
    public static AppiumDriver browserStackAndroid() throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps = new DesiredCapabilities();

        // Set your access credentials
        caps.setCapability("browserstack.user", "hanifeh_QeW2r3");
        caps.setCapability("browserstack.key", "prqyhX2aysGrWgaVa5fh");

        // Set URL of the application under test
        caps.setCapability("app", "bs://fb7e2391a33cb1228c0110435081f9d9b7757283");

        // Specify device and os_version for testing
        caps.setCapability("device", "Samsung Galaxy A10");
        caps.setCapability("os_version", "9.0");

        // Set other BrowserStack capabilities
        caps.setCapability("project", "Appium Project");
        caps.setCapability("build", "browserstack-1");
        caps.setCapability("name", "sample_test");


        // Initialise the remote Webdriver using BrowserStack remote URL
        // and desired capabilities defined above
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
                new URL("http://hub.browserstack.com/wd/hub"), caps);
        return driver;
    }
}
