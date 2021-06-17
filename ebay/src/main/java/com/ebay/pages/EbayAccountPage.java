package com.ebay.pages;

import com.pnt.base.report.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

public class EbayAccountPage {

    private static Logger LOGGER = Logger.getLogger(EbayAccountPage.class);

    @FindBy(id = "firstname")
    private WebElement fnameField;

    @FindBy(id = "lastname")
    private WebElement lnameField;

    @FindBy(id = "Email")
    private WebElement emailField;

    @FindBy(id = "password")
    private WebElement passwordField;

//    @FindBy(xpath = "//label[@for='ap_customer_name']")
//    private WebElement nameLabel;
//
//    @FindBy(xpath = "//label[@for='ap_password']")
//    private WebElement passwordLabel;
//
//    @FindBy(xpath = "//label[@for='ap_email']")
//    private WebElement emailLabel;
//
//    @FindBy(xpath = "//label[@for='ap_password_check']")
//    private WebElement reenterPasswordLabel;

//    public void validateTheFieldLabelsAreDisplayed() {
//        SoftAssert softAssert = new SoftAssert();
//
//        softAssert.assertEquals(nameLabel.getText(), "Your name");
//        ExtentTestManager.log("name label is displayed", LOGGER);
//
//        softAssert.assertEquals(passwordLabel.getText(), "Password");
//        ExtentTestManager.log("password label is displayed", LOGGER);
//
//        softAssert.assertEquals(reenterPasswordLabel.getText(), "Re-enter password");
//        ExtentTestManager.log("reenter password label is displayed", LOGGER);
//
//        softAssert.assertEquals(emailLabel.getText(), "Mobile number or email");
//        ExtentTestManager.log("email label is displayed", LOGGER);
//
//        softAssert.assertAll();
//    }

    public void typeInFnameField(String data) {
        fnameField.sendKeys(data);
    }
    public void typeInLnameField(String data) {
        lnameField.sendKeys(data);
    }
    public void typeInEmailField(String data) {
        emailField.sendKeys(data);
    }
    public void typeInPasswordField(String data) {
        passwordField.sendKeys(data);
    }
}
