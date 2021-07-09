package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePage {
    //**** For Sign IN
    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchTextBox;

    @FindBy(id = "nav-search-submit-button")
    private WebElement searchButton;

    @FindBy(xpath = "(//span[@class='nav-action-inner'])[2]")
    private WebElement signInButton;

    public void typeOnSearchBar(String text) {
        searchTextBox.sendKeys(text);
    }

    public void clickOnSearchButton() {
        searchButton.click();
    }

    public void clickOnSignInButton() {
        signInButton.click();
    }

    //**** End Sign In

    @FindBy(css ="#nav-search-submit-text > input" )
    private WebElement searchButton1;
    public void clickOnSearchButton1(){
        searchButton1.click();
    }

    // EbayTests
    @FindBy(id="gh-cat")
    private WebElement selectDropdown;

    public void selectFromDropdown(){
        WebElement dropdownMenu=selectDropdown;
        Select select=new Select(dropdownMenu);
        select.selectByVisibleText("Music");
    }
    /*
            WebElement dropdownMenu = driver.findElement(By.id("gh-cat"));
        Select select = new Select(dropdownMenu);
        select.selectByVisibleText("Music");
     */

    @FindBy(id="gh-la")
    private WebElement logo;
    public void logoDisplay(){
        boolean actualDisplay=logo.isDisplayed();
        Assert.assertTrue(actualDisplay,"Hi, Logo Not Display");
    }


    @FindBy(xpath ="//*[@id='gh-ac']" )
    private WebElement chkBox;
    @FindBy(xpath = "//*[@id='gh-btn']")
    private WebElement clickButton;
    @FindBy(xpath ="//h1[@class='srp-controls__count-heading']" )
    private WebElement actuText;

    public void typeOnBox(){
        chkBox.sendKeys("dslr camera");
    }
    public void clickOnBox(){
        clickButton.click();
    }
    public void findText(){
        Assert.assertTrue(actuText.getText().contains("dslr camera"), "Hi, Tex Not Match");
    }

}
