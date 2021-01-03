package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CountrySelectionPage {

    public AppiumDriver driver;
    public WebDriverWait wait;

    String iceland = "Iceland";
    String icelandXpath = "//*[@text='" + iceland + "']";
    String icelandClassName = "android.widget.RadioButton";
    String doneButtonId = "grit.storytel.app:id/buttonDone";

    public CountrySelectionPage(AppiumDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }

    public void findIceland() throws InterruptedException {
        Thread.sleep(3000);
        TouchAction action = new TouchAction(driver);
        action.longPress(new PointOption().withCoordinates(536,1817)).moveTo(new PointOption().withCoordinates(500,700)).release().perform();
    }

    public void clickIceland(){
        /*
        List<MobileElement> elementList = driver.findElements(By.className(icelandClassName));
        elementList.get(7).click();
        */
         driver.findElement(By.xpath(icelandXpath)).click();
    }

    public void clickDone(){
        driver.findElement(By.id(doneButtonId)).click();
    }
}
