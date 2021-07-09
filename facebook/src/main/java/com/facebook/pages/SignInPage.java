package com.facebook.pages;

import com.pnt.base.report.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

public class SignInPage {

    private static Logger LOGGER = Logger.getLogger(SignInPage.class);

    @FindBy(xpath = "//input[@id='email']")
    private WebElement enterUserID;

    @FindBy(xpath = "//input[@id='pass']")
    private WebElement enterPassword;

    @FindBy(xpath = "//button[normalize-space()='Log In']")
    private WebElement clickButton;

    @FindBy(xpath = "(//span[@class='a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7 ltmttdrg g0qnabr5'])[1]")
    private WebElement displayName;

    public void sendUserID(String userID) {
        enterUserID.sendKeys(userID);
    }
    public void sendPassword(String userPassword) {
        enterPassword.sendKeys(userPassword);
    }
    public void setClickButton() {
        clickButton.click();
    }
    public void setDisplayName() {
        displayName.getText();
    }

    public void validateLogin() {
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(displayName.getText().contains("Mominul"),"Login Name not Display");
        ExtentTestManager.log("Login Name is displayed", LOGGER);

//        softAssert.assertEquals(passwordLabel.getText(), "Password");
//        ExtentTestManager.log("password label is displayed", LOGGER);

        softAssert.assertAll();
    }

}
