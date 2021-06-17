package com.ebay.tests;

import com.amazon.data.DataProvidersForTest;
import com.amazon.pages.CreateAccountPage;
import com.amazon.pages.HomePage;
import com.amazon.pages.SignInPage;
import com.ebay.data.DataProviders;
import com.ebay.pages.EbayAccountPage;
import com.ebay.pages.EbayHomePage;
import com.ebay.pages.EbaySignInPage;
import com.ebay.pages.EbayAccountPage;
import com.pnt.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EbayLoginTests extends TestBase {

    private EbaySignInPage homePage;
    private EbayAccountPage createAccountPage;

    @BeforeMethod
    public void setPOM() {
        homePage = PageFactory.initElements(driver, EbaySignInPage.class);
        createAccountPage = PageFactory.initElements(driver, EbayAccountPage.class);
    }

    @Test(dataProviderClass = DataProviders.class, dataProvider = "getUserForCreateAccountTest")
    public void validateUserCanCreateAccount(String userFname, String userLname, String email, String password) {

        homePage.clickLnkText();
        createAccountPage.typeInFnameField(userFname);
        createAccountPage.typeInLnameField(userLname);
        createAccountPage.typeInEmailField(email);
        createAccountPage.typeInPasswordField(password);
    }
}
