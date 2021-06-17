package com.ebay.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbaySignInPage {
    @FindBy(linkText = "register")
    private WebElement lnkText;
    public void clickLnkText(){
        lnkText.click();
    }
}
