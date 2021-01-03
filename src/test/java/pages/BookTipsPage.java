package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BookTipsPage {

    public AppiumDriver driver;
    public WebDriverWait wait;


    String feelGoodXpath = "//android.view.ViewGroup[@content-desc=\"Feelgood\"]";

    public BookTipsPage(AppiumDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }



    public void findFeelGoodSection() throws InterruptedException {

        Thread.sleep(3000);
        TouchAction action = new TouchAction(driver);
        action.longPress(new PointOption().withCoordinates(536,2235)).moveTo(new PointOption().withCoordinates(500,310)).release().perform();
        Thread.sleep(3000);
        action.longPress(new PointOption().withCoordinates(536,2235)).moveTo(new PointOption().withCoordinates(500,310)).release().perform();
        Thread.sleep(3000);
        action.longPress(new PointOption().withCoordinates(536,2235)).moveTo(new PointOption().withCoordinates(500,310)).release().perform();
        Thread.sleep(3000);
        action.longPress(new PointOption().withCoordinates(536,2000)).moveTo(new PointOption().withCoordinates(500,310)).release().perform();

        boolean displayed = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(feelGoodXpath))).isDisplayed();

    }

    public void selectSeventhBook() throws InterruptedException {
        TouchAction action = new TouchAction(driver);
        int Xfirst = driver.findElement(By.xpath(feelGoodXpath)).getLocation().getX();
        int Xfirstr=Xfirst + Xfirst;
        int Yfirst= driver.findElement(By.xpath(feelGoodXpath)).getLocation().getY();
        //driver.swipe(Xfirst + 300,Yfirst, Xfirst,Yfirst,5000);
        action.longPress(new PointOption().withCoordinates(Xfirst + 300,Yfirst-200)).moveTo(new PointOption().withCoordinates( Xfirst, Yfirst-200)).release().perform();
        Thread.sleep(3000);
        action.longPress(new PointOption().withCoordinates(Xfirst + 300,Yfirst-200)).moveTo(new PointOption().withCoordinates( Xfirst, Yfirst-200)).release().perform();
        Thread.sleep(3000);
        action.longPress(new PointOption().withCoordinates(Xfirst + 300,Yfirst-200)).moveTo(new PointOption().withCoordinates( Xfirst, Yfirst-200)).release().perform();






    }




}
