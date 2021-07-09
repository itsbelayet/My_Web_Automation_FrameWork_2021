package com.google.pages;

import com.pnt.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class GoogleTests extends TestBase {
    @Test
    public void handleMultipleWindow() {

        LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);

        landingPage.clickOnCreateAccount();
        landingPage.switchToRequiredTab();
        landingPage.enterfname();
        landingPage.enterlname();
        landingPage.enteremail();
        landingPage.enterpassword();
        landingPage.reenterpassword();
        landingPage.reenterpassword();
        landingPage.clickCheckBox();
        sleepFor(15);
        landingPage.enterbutton();
        landingPage.displayText();
        sleepFor(5);
        //logger.info("Hi, Successfully Handel Multiple Window");
        //closeBrowser();
        cleanUp();
    }
}
