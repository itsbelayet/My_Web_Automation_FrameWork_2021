package com.ebay.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class EbayHomePage {

    @FindBy(xpath = "//input[@class='gh-tb ui-autocomplete-input']")
    private WebElement inputBox;
    public void typeOnBox() {
        inputBox.sendKeys("iphone");
    }
    @FindBy(xpath = "//input[@class='btn btn-prim gh-spr']")
    private WebElement clickButton;
    public void clickOnButton() {
        clickButton.click();
    }

    public void typeOnSearchBar(String text){
        inputBox.sendKeys(text);
    }
    public void clickOnSearchButton(){
        clickButton.click();
    }

    @FindBy(xpath = "//*[@id='mainContent']/div[1]/div[2]/div[2]/div[1]/div[1]/h1/span[2]")
    private WebElement findText;

    public void findOutText() {
        Assert.assertTrue(findText.getText().contains("iphone"), "Hi, Tex Not Match");
    }

    @FindBy(id = "gh-cat")
    private WebElement selectDropdown;

    public void selectFromDropdown() {
        WebElement dropdownMenu = selectDropdown;
        Select select = new Select(dropdownMenu);
        select.selectByVisibleText("Music");
        WebDriver driver;
    }

    @FindBy(id = "gh-la")
    private WebElement logo;

    public void logoDisplay() {
        boolean actualDisplay = logo.isDisplayed();
        Assert.assertTrue(actualDisplay, "Hi, Logo Not Display");
    }

    @FindBy(id = "gh-btn")
    private WebElement dropDownElement;

    public void clickFromDropdown() {
        Select select = new Select(selectDropdown);
        select.selectByVisibleText("Travel");
        dropDownElement.click();
    }


    //  ***************** Un-Done  **********
    @FindBy(linkText = "Motors")
    private WebElement selectLink;
    @FindBy(linkText = "Motorcycles")
    private WebElement selectLinkText;

    public void selectLinkText() {
        WebElement item = selectLink;
    }

}
