package com.pack.pages;

import com.pack.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftDetailPage extends TestBase {

    @FindBy(xpath = "//h3[contains(.,'A Pick-me-up GIFT')]")
    WebElement Label;

    @FindBy(xpath = "//div[@class='sub-title'][contains(.,'A beautiful, impactful gesture')]")
    WebElement Text;

    @FindBy(xpath = "//div[@class='gift-price'][contains(.,'5.5 USD')]")
    WebElement Amount;

    @FindBy(xpath = "//button[@class='btn primary'][contains(.,'CONTINUE')]")
    WebElement ContinueBtn;

    public GiftDetailPage(){
        PageFactory.initElements(driver, this);
    }

    public String validateGiftDetailPageTitle(){
        return driver.getTitle();
    }

    public boolean verifyLabel(){
        return Label.isDisplayed();
    }

    public boolean verifyText(){
        return Text.isDisplayed();
    }

    public boolean verifyAmount(){
        return Amount.isDisplayed();
    }

    public boolean verifyContinueBtn(){
        return ContinueBtn.isDisplayed();
    }

    public void verifyNavigatingPaymentPage(){
        ContinueBtn.click();
    }

}
