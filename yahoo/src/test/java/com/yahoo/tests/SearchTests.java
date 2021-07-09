package com.yahoo.tests;

import com.pnt.base.TestBase;
import com.pnt.base.report.ExtentTestManager;
import com.yahoo.data.YahooDataProviders;
import com.yahoo.pages.SignInPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchTests extends TestBase {
    private static Logger LOGGER = Logger.getLogger(SearchTests.class);

    private SignInPage homePage;

    @BeforeMethod
    public void setUpPOM() {
        homePage = PageFactory.initElements(driver, SignInPage.class);
    }

    // Data Provider
    @Test(enabled = true, dataProviderClass = YahooDataProviders.class, dataProvider = "getPasswordForLogin")
    public void loginTest(String password) {

        homePage.setSignInButton();

        homePage.sendUserID("mi_sangram@yahoo.com");
        ExtentTestManager.log("Enter User ID " + password, LOGGER);

        homePage.setClickNext();

        homePage.sendPassword(password);
        ExtentTestManager.log("Enter Login Password " + password, LOGGER);

        homePage.setClickButton();
        ExtentTestManager.log("Click on the Login button", LOGGER);

        homePage.validateLogin();
        ExtentTestManager.log("Login Successful", LOGGER);

        homePage.setLogOut();
        homePage.setLogoutButton();
        ExtentTestManager.log("LogOut Successful", LOGGER);
    }

}
