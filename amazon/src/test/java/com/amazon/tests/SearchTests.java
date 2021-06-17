package com.amazon.tests;

import com.amazon.pages.HomePage;
import com.amazon.data.DataProvidersForTest;
import com.pnt.base.ConnectDB;
import com.pnt.base.TestBase;
import com.pnt.base.report.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.SQLException;
import java.util.ArrayList;

public class SearchTests extends TestBase {
    private static Logger LOGGER = Logger.getLogger(SearchTests.class);

    private HomePage homePage;

    @BeforeMethod
    public void setUpPOM() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test(enabled = false)
    public void validateItem() {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Java Books");
        ExtentTestManager.log("Java Books type in the search bar", LOGGER);
        driver.findElement((By.id("nav-search-submit-button"))).click();
        ExtentTestManager.log("Click on the search button", LOGGER);
    }

    @Test(enabled = false)
    public void validateUrl() {
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.amazon.com/";
        Assert.assertEquals(actualUrl, expectedUrl, "Url Not Match");
        LOGGER.info(expectedUrl + " : url has been validated");
    }

    @Test(enabled = false)
    public void validateUrlusingMethod() {
        validateUrlWithExpected("https://www.amazon.com/");
    }

    // Data Provider
    @Test(enabled = true, dataProviderClass = DataProvidersForTest.class, dataProvider = "getDataForSearchTest",
            groups = "regression")
    public void validateBooks(String bookName) {
        homePage.typeOnSearchBar(bookName);
        ExtentTestManager.log("Looking for : " + bookName, LOGGER);
        homePage.clickOnSearchButton();
        ExtentTestManager.log("Click on the search button", LOGGER);
    }

    // Using PageFactory
    @Test(enabled = true, groups = "")
    public void searchForBooks() {
        homePage.typeOnSearchBar("dslr camera");
        ExtentTestManager.log("Searching dslr camera", LOGGER);
        homePage.clickOnSearchButton();
        ExtentTestManager.log("Click on the search button", LOGGER);
    }

    @Test(enabled = false)
    public void searchBox() {
        homePage.typeOnSearchBar("Mobile");
        ExtentTestManager.log("Searching Mobile", LOGGER);
        homePage.clickOnSearchButton1();
        ExtentTestManager.log("Click on the search button", LOGGER);
    }

    // Using Database
    @Test(enabled = true)
    public void validateUserBeingAbleToSearchForAnItemFromDatabase() throws SQLException {
        String query = "select * from testdata;";
        ArrayList<String> datas = ConnectDB.connectToDbAndGetData(query, "bookName");

        homePage.typeOnSearchBar(datas.get(0));
        ExtentTestManager.log("SQL Books typed in the search bar", LOGGER);

        homePage.clickOnSearchButton();
        ExtentTestManager.log("Clicked on the search button", LOGGER);

    }
}
