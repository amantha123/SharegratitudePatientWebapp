package com.pack.pages;

import com.pack.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage extends TestBase {

    @FindBy(xpath = "//img[@src='https://human-backend-data.s3.eu-west-2.amazonaws.com/6322eced057b8bea7c748e6f/organization/1665732870421.jpg']")
    WebElement Logo;

    @FindBy(xpath = "//span[contains(.,'Pay with Card')]")
    WebElement PaywithCardLabel;

    @FindBy(xpath = "//input[@class='input']")
    WebElement Email;

    @FindBy(xpath = "//input[contains(@type,'text')]")
    WebElement Name;

    @FindBy(xpath = "//input[contains(@autocomplete,'cc-number')]")
    WebElement CardNo;

    @FindBy(xpath = "//button[@class='btn primary'][contains(.,'Pay')]")
    WebElement PayBtn;

    public PaymentPage(){
        PageFactory.initElements(driver, this);
    }

    public String validatePaymentPageTitle(){
        return driver.getTitle();
    }

    public boolean verifyLogo(){
        return Logo.isDisplayed();
    }

    public boolean verifyPaywithCardLabel(){
        return PaywithCardLabel.isDisplayed();
    }

    public boolean verifyEmail(){
        return Email.isDisplayed();
    }

    public boolean verifyName(){
        return Name.isDisplayed();
    }
    public boolean verifyCardNo(){
        return CardNo.isDisplayed();
    }

    public boolean verifyPayBtn(){
        return PayBtn.isDisplayed();
    }
}
