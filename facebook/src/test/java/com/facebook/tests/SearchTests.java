package com.facebook.tests;

import com.facebook.data.FaceBookDataProviders;
import com.facebook.pages.SignInPage;
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

    private SignInPage homePage;

    @BeforeMethod
    public void setUpPOM() {
        homePage = PageFactory.initElements(driver, SignInPage.class);
    }

    // Data Provider
    @Test(enabled = true, dataProviderClass = FaceBookDataProviders.class, dataProvider = "getPasswordForLogin")
    public void loginTest(String password) {

        homePage.sendUserID("mi_sangram@yahoo.com");
        homePage.sendPassword(password);
        ExtentTestManager.log("Login Password : " + password, LOGGER);

        homePage.setClickButton();
        ExtentTestManager.log("Click on the Login button", LOGGER);

        homePage.validateLogin();
        ExtentTestManager.log("Login Successful", LOGGER);

    }

}
