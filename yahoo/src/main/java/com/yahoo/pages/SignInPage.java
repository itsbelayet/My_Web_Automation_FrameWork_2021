package com.yahoo.pages;

import com.pnt.base.report.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

public class SignInPage {

    private static Logger LOGGER = Logger.getLogger(SignInPage.class);

    @FindBy(xpath = "//a[@class='_yb_10url']")
    private WebElement signInButton;

    @FindBy(xpath = "//input[@id='login-username']")
    private WebElement enterUserID;

    @FindBy(xpath = "//input[@id='login-signin']")
    private WebElement clickNext;

    @FindBy(xpath = "//input[@id='login-passwd']")
    private WebElement enterPassword;

    @FindBy(xpath = "//button[normalize-space()='Next']")
    private WebElement clickButton;

    @FindBy(xpath = "//span[@role='presentation']")
    private WebElement displayName;

    @FindBy(xpath = "//span[@class='_yb_1vvcr _yb_12n11 _yb_4yrd4']")
    private WebElement logoutButton;

    public void setSignInButton() {
        signInButton.click();
    }

    public void sendUserID(String userID) {
        enterUserID.sendKeys(userID);
    }

    public void setClickNext() {
        clickNext.click();
    }

    public void sendPassword(String userPassword) {
        enterPassword.sendKeys(userPassword);
    }

    public void setClickButton() {
        clickButton.click();
    }

    public void setLogOut() {
        displayName.click();
    }

    public void setLogoutButton() {
        logoutButton.click();
    }

    public void validateLogin() {
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(displayName.getText().contains("Mominul"), "Login Name not Display");
        ExtentTestManager.log("Login Name is displayed", LOGGER);

//        softAssert.assertEquals(passwordLabel.getText(), "Password");
//        ExtentTestManager.log("password label is displayed", LOGGER);

        softAssert.assertAll();
    }

}
