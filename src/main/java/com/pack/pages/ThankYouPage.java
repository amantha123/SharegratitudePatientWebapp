package com.pack.pages;

import com.pack.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThankYouPage extends TestBase {

    @FindBy(xpath = "//img[@src='https://human-backend-data.s3.eu-west-2.amazonaws.com/6322eced057b8bea7c748e6f/organization/1665732870421.jpg']")
    WebElement Logo;

    @FindBy(xpath = "//h2[contains(.,'THANK YOU')]")
    WebElement ThankYouLabel;

    @FindBy(xpath = "//div[@class='cons'][contains(.,'Please enter your email or mobile number to receive a reply from Kavinthan')]")
    WebElement Text;

    @FindBy(xpath = "//input[contains(@class,'form-control ')]")
    WebElement MobileNumber;

    @FindBy(xpath = "//input[contains(@class,'input')]")
    WebElement Email;

    @FindBy(xpath = "//button[@class='btn primary'][contains(.,'SUBMIT')]")
    WebElement SubmitBtn;

    @FindBy(xpath = "//span[@class='shareme'][contains(.,'Share with Family & Friends')]")
    WebElement SharewithFamilyFriends;

    @FindBy(xpath = "//button[@class='btn secbtn'][contains(.,'Copy THANK YOU Link')]")
    WebElement CopyThankYouLink;

    @FindBy(xpath = "//button[@class='btn btn-default'][contains(.,'NO')]")
    WebElement No;

    @FindBy(xpath = "//button[@class='btn primary'][contains(.,'YES')]")
    WebElement Yes;

    public ThankYouPage(){
        PageFactory.initElements(driver, this);
    }

    public String validateThankYouPageTitle(){
        return driver.getTitle();
    }

    public boolean verifyLogo(){
        return Logo.isDisplayed();
    }

    public boolean verifyThankYouLabel(){
        return ThankYouLabel.isDisplayed();
    }

    public boolean verifyText(){
        return Text.isDisplayed();
    }

    public boolean verifyMobileNumber(){
        return MobileNumber.isDisplayed();
    }

    public boolean verifyEmail(){
        return Email.isDisplayed();
    }

    public boolean verifySubmitBtn(){
        return SubmitBtn.isDisplayed();
    }

    public boolean verifySharewithFamilyFriendsLabel(){
        return SharewithFamilyFriends.isDisplayed();
    }

    public boolean verifyCopyThankYouLink(){
        return CopyThankYouLink.isDisplayed();
    }

    public void verifyClickingCopyThankYouLink(){
        CopyThankYouLink.click();
    }

    public void verifySubmittingContactDetails(){
        MobileNumber.click();
        MobileNumber.sendKeys("774848813");
        Email.click();
        Email.sendKeys("amantha@sharegratitude.com");
        SubmitBtn.click();
        No.click();
    }

    public void verifyNavigatingDepartmentPage(){
        MobileNumber.click();
        MobileNumber.sendKeys("774848813");
        Email.click();
        Email.sendKeys("amantha@sharegratitude.com");
        SubmitBtn.click();
        Yes.click();
    }
}
