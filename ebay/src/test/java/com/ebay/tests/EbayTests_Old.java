package com.ebay.tests;


import com.pnt.base.TestBase;
import com.pnt.base.report.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class EbayTests_Old extends TestBase {

    /*private static Logger LOGGER = Logger.getLogger(EbayTests_Old.class);

    @Test(enabled = false)
    public void searchBox() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.typeOnSearchBar("Mobile");
        ExtentTestManager.log("Searching Mobile", LOGGER);
        homePage.clickOnSearchButton1();
        ExtentTestManager.log("Click on the search button", LOGGER);
    }

    @Test(enabled = true)
    public void extractFromDropDown(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        sleepFor(3);
        homePage.selectFromDropdown();
        sleepFor(4);
        ExtentTestManager.log("Selected from Dropdown Menu", LOGGER);
    }
    @Test(enabled = true)
    public void checkLogo(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        sleepFor(2);
        homePage.logoDisplay();
        sleepFor(3);
        ExtentTestManager.log("Logo perfectly Displayed", LOGGER);
    }
    @Test(enabled = true)
    public void checkText(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.typeOnBox();
        sleepFor(2);
        homePage.clickOnBox();
        sleepFor(2);
        homePage.findText();
        sleepFor(2);
        ExtentTestManager.log("Element properly Displayed", LOGGER);
    }*/

/*
Convert it later:

    @Test(enabled = true)
    public static void dropDown() {          // Scroll Down
        setupBrowser("chrome", "https://www.ebay.com/");
        WebElement dropDownElement = driver.findElement(By.id("gh-cat"));
        Select select = new Select(dropDownElement);
        select.selectByVisibleText("Travel");
        //select.selectByIndex(30);
        driver.findElement(By.id("gh-btn")).click();
        logger.info("Hi, Successfully Click");
        closeBrowser();
    }

    @Test(enabled = true)
    public static void selectByMouseHover() {       // Mouse Hover
        setupBrowser("chrome", "https://www.ebay.com/");
        WebElement item = driver.findElement(By.linkText("Motors"));
        Actions actions = new Actions(driver);
        actions.moveToElement(item).build().perform();
        driver.findElement(By.linkText("Motorcycles")).click();
        logger.info("Hi, Successfully Click Link Text");
        closeBrowser();
    }

    @Test(enabled = true)
    public static void scrollDown() {
        setupBrowser("chrome", "https://www.ebay.com/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500)");
        logger.info("Hi, Successfully Scroll Down");
        closeBrowser();
    }

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
