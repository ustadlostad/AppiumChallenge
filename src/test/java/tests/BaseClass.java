package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.AppiumFluentWait;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseClass {

    public AppiumDriver driver;
    public Wait wait;


    @BeforeClass
    public void setup() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"HUAWEI Mate 20 lite");
        capabilities.setCapability(MobileCapabilityType.UDID,"HVY0218826000272");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10");
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,60);
        capabilities.setCapability("appPackage","grit.storytel.app");
        capabilities.setCapability("appActivity","grit.storytel.app.MainActivity");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver(url,capabilities);
        wait = new WebDriverWait(driver,20);

    }

    @AfterClass
    public void tearDown() throws InterruptedException {

        Thread.sleep(5000);
        driver.closeApp();

    }
}
