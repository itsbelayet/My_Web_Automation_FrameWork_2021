package com.google.pages;

import com.pnt.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.Set;

public class LandingPage {

    @FindBy(linkText = "Create an account")
    private WebElement createAccount;

    public void clickOnCreateAccount(){
        createAccount.click();
    }

    public void switchToRequiredTab(){
        Set<String> afterOpenNewWindow = TestBase.driver.getWindowHandles();
        String currentWindow = TestBase.driver.getWindowHandle();

        for (String win : afterOpenNewWindow) {
            if (!win.equalsIgnoreCase(currentWindow)) {
                TestBase.driver.switchTo().window(win);
            }
        }
    }
    @FindBy(xpath = "//*[@id='firstName']")
    private WebElement typefname;
    @FindBy(xpath = "//*[@id='lastName']")
    private WebElement typelname;
    @FindBy(xpath = "//*[@id='username']")
    private WebElement typeemail;
    @FindBy(xpath = "//*[@id='passwd']/div[1]/div/div[1]/input")
    private WebElement typepassword;
    @FindBy(xpath = "//input[@type='checkbox']")
    private WebElement chkbox;
    @FindBy(xpath = "//*[@name='ConfirmPasswd']")
    private WebElement typereenterpassword;
    @FindBy(xpath = "//*[@id='accountDetailsNext']")
    private WebElement clickbutton;
    @FindBy(xpath = "//*[@id='view_container']/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[3]/div[2]/div[2]/span")
    private WebElement showText;

    public void enterfname(){
        typefname.sendKeys("Mamunur");
    }
    public void enterlname(){
        typelname.sendKeys("Rashid");
    }
    public void enteremail(){
        typeemail.sendKeys("mamun.Vhai1960");
    }
    public void enterpassword(){
        typepassword.sendKeys("12345678");
    }
    public void reenterpassword(){
        typereenterpassword.sendKeys("87654321");
    }
    public void clickCheckBox(){
        chkbox.click();
    }
    public void enterbutton(){
        clickbutton.click();
    }
    public void displayText(){
        Assert.assertEquals(showText.getText(),"Those passwords didn’t match. Try again.", "Hi, Test fail");
    }
//        Assert.assertEquals(actualText, );
        //logger.info("Hi, Successfully Handel Multiple Window");
}
