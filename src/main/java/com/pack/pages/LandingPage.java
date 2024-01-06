package com.pack.pages;

import com.pack.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends TestBase {

    @FindBy(xpath = "//img[@src='https://human-backend-data.s3.eu-west-2.amazonaws.com/6322eced057b8bea7c748e6f/organization/1665732870421.jpg']")
    WebElement Logo;

    @FindBy(xpath = "//h3[contains(.,'Thank Staff')]")
    WebElement ThankStaffLabel;

    @FindBy(xpath = "//p[contains(.,'Sending a message or gift to the staff you appreciate is just a few clicks away!')]")
    WebElement Text;

    @FindBy(xpath = "//button[@class='btn w-100 primary'][contains(.,'Continue')]")
    WebElement ContinueBtn;

    @FindBy(xpath = "//a[@href='https://humansofsharegratitude.com/terms-of-use/'][contains(.,'Terms of Service')]")
    WebElement TermsofService;

    @FindBy(xpath = "//a[@href='https://humansofsharegratitude.com/acceptable-use-policy/'][contains(.,'Acceptable Use Policy')]")
    WebElement AcceptableUsePolicy;

    @FindBy(xpath = "//a[@href='https://humansofsharegratitude.com/privacy-policy-2/'][contains(.,'Privacy Policy')]")
    WebElement PrivacyPolicy;


    public LandingPage(){
        PageFactory.initElements(driver, this);
    }

    public String validateLandingPageTitle(){
        return driver.getTitle();
    }

    public boolean verifyLogo(){
        return Logo.isDisplayed();
    }

    public boolean verifyThankStaffLabel(){
        return ThankStaffLabel.isDisplayed();
    }

    public boolean verifyText(){
        return Text.isDisplayed();
    }

    public boolean verifyContinueBtn(){
        return ContinueBtn.isDisplayed();
    }

    public boolean verifyTermsofService(){
        return TermsofService.isDisplayed();
    }

    public boolean verifyAcceptableUsePolicy(){
        return AcceptableUsePolicy.isDisplayed();
    }

    public boolean verifyPrivacyPolicy(){
        return PrivacyPolicy.isDisplayed();
    }

    public void verifyViewingTermsofService(){
        TermsofService.click();
        driver.navigate().back();
    }

    public void verifyViewingAcceptableUsePolicy(){
        AcceptableUsePolicy.click();
        driver.navigate().back();
    }

    public void verifyViewingPrivacyPolicy(){
        PrivacyPolicy.click();
        driver.navigate().back();
    }

    public void verifyNavigatingDepartmentPage(){
        ContinueBtn.click();
    }
}
