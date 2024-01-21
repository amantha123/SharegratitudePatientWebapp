package com.pack.pages;

import com.pack.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftPage extends TestBase {

    @FindBy(xpath = "//span[contains(.,'Select Gift')]")
    WebElement SelectGift;

    @FindBy(xpath = "//span[contains(.,'Coffee Drink')]")
    WebElement GiftOptions;

    public GiftPage(){
        PageFactory.initElements(driver, this);
    }

    public String validateGiftPageTitle(){
        return driver.getTitle();
    }

    public boolean verifySelectGiftLabel(){
        return SelectGift.isDisplayed();
    }

    public boolean verifyGiftOptions(){
        return GiftOptions.isDisplayed();
    }

    public void verifyNavigatingGiftDetailPage(){
        GiftOptions.click();
    }
}
