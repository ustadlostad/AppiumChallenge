package tests;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BookTipsPage;
import pages.CountrySelectionPage;
import pages.LandingPage;
import pages.LanguageSelectionPage;

import java.util.List;

public class Tests extends BaseClass{

    public LandingPage landingPage;
    public CountrySelectionPage countrySelectionPage;
    public LanguageSelectionPage languageSelectionPage;
    public BookTipsPage bookTipsPage;


    @BeforeMethod
    public void initialize(){

        landingPage = new LandingPage(driver, (WebDriverWait) wait);
        countrySelectionPage = new CountrySelectionPage(driver, (WebDriverWait) wait);
        languageSelectionPage = new LanguageSelectionPage(driver, (WebDriverWait) wait);
        bookTipsPage = new BookTipsPage(driver, (WebDriverWait) wait);

    }

    @Test(priority = 0)
    public void tryIt(){
        landingPage.clickTryIt();
    }

    @Test(priority = 1)
    public void findAndClickIceland() throws InterruptedException {
            countrySelectionPage.findIceland();
            countrySelectionPage.clickIceland();
            countrySelectionPage.clickDone();

    }

    @Test(priority = 2)
    public void selectOnlyEnglish(){
        languageSelectionPage.deselectIcelandic();
        languageSelectionPage.clickDone();
    }

    @Test(priority = 3)
    public void selectBookFromFeelGoodSection() throws InterruptedException {

        bookTipsPage.findFeelGoodSection();
        bookTipsPage.selectSeventhBook();

    }



}
