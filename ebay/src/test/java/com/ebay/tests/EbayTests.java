package com.ebay.tests;

import com.ebay.pages.EbayHomePage;
import com.ebay.data.DataProviders;
import com.pnt.base.TestBase;
import com.pnt.base.report.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EbayTests extends TestBase {

    private static Logger LOGGER = Logger.getLogger(EbayTests.class);

    private EbayHomePage homePage;

    @BeforeMethod
    public void setUpPOM() {
        homePage = PageFactory.initElements(driver, EbayHomePage.class);
    }

    // ************************* Test Cases ***************************
    // Data Provider
    @Test(dataProviderClass = DataProviders.class, dataProvider = "getDataForSearch")
    public void validateSearchItem(String item) {
        homePage.typeOnSearchBar(item);
        ExtentTestManager.log("Looking for : " + item, LOGGER);
        homePage.clickOnSearchButton();
        ExtentTestManager.log("Click on the search button", LOGGER);
    }


    @Test(enabled = true)
    public void validateUrlusingMethod() {
        validateUrlWithExpected("https://www.ebay.com/");
    }

    @Test(enabled = true)
    public void searchBox() {
        homePage.typeOnBox();
        ExtentTestManager.log("Searching Mobile", LOGGER);
        homePage.clickOnButton();
        ExtentTestManager.log("Click on the search button", LOGGER);
        homePage.findOutText();
    }

    @Test(enabled = true)
    public void extractFromDropDown() {
        homePage.selectFromDropdown();
        ExtentTestManager.log("Selected from Dropdown Menu", LOGGER);
    }

    @Test(enabled = true)
    public void checkLogo() {
        homePage.logoDisplay();
        ExtentTestManager.log("Logo perfectly Displayed", LOGGER);
    }

    @Test(enabled = true)
    public void dropDown() {          // Scroll Down & Click
        homePage.clickFromDropdown();
        ExtentTestManager.log("Hi, Successfully Click", LOGGER);
    }

    @Test(enabled = true)
    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500)");
        sleepFor(2);
        ExtentTestManager.log("Hi, Successfully Scroll Down", LOGGER);
    }

/*
Convert it later:

//    @Test(enabled = true)
//    public static void selectByMouseHover() {       // Mouse Hover
          setupBrowser("chrome", "https://www.ebay.com/");
//        WebElement item = driver.findElement(By.linkText("Motors")); // item=selectFromLinkText()
//        Actions actions = new Actions(driver);
//        actions.moveToElement(item).build().perform();
//        driver.findElement(By.linkText("Motorcycles")).click();   // clickFromLinkText()
//        logger.info("Hi, Successfully Click Link Text");
//        closeBrowser();
//    }

    @Test(enabled = true)
    public static void scrollDownToElement() {
        setupBrowser("chrome", "https://www.ebay.com/");
        WebElement element = driver.findElement(By.linkText("Security center"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        logger.info("Hi, Successfully Scroll down to Element");
        closeBrowser();
    }
*/
}
