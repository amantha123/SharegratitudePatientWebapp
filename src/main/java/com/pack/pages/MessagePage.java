package com.pack.pages;

import com.pack.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessagePage extends TestBase {

    @FindBy(xpath = "//img[@src='https://human-backend-data.s3.eu-west-2.amazonaws.com/6322eced057b8bea7c748e6f/organization/1665732870421.jpg']")
    WebElement Logo;

    @FindBy(xpath = "//span[contains(.,'Your THANK YOU message')]")
    WebElement YourThankYouMessageLabel;

    @FindBy(xpath = "//textarea[contains(@placeholder,'Type your message of thanks...')]")
    WebElement MessageBox;

    @FindBy(xpath = "//input[contains(@placeholder,'Your First Name')]")
    WebElement FirstName;

    @FindBy(xpath = "//input[contains(@class,'btn active')]")
    WebElement NextBtn;

    @FindBy(xpath = "//span[@class='alert-font'][contains(.,'Please write a thank you message')]")
    WebElement Validation;

    @FindBy(xpath = "//span[@class='alert-font'][contains(.,'First Name is required.')]")
    WebElement Validation1;

    @FindBy(xpath = "//button[@class='btn btn-default'][contains(.,'NO')]")
    WebElement No;

    @FindBy(xpath = "//button[@class='btn primary'][contains(.,'ABSOLUTELY')]")
    WebElement Absolutely;

    public MessagePage(){
        PageFactory.initElements(driver, this);
    }

    public String validateMessagePageTitle(){
        return driver.getTitle();
    }

    public boolean verifyLogo(){
        return Logo.isDisplayed();
    }

    public boolean verifyYourThankYouMessageLabel(){
        return YourThankYouMessageLabel.isDisplayed();
    }

    public boolean verifyMessageBox(){
        return MessageBox.isDisplayed();
    }

    public boolean verifyFirstName(){
        return FirstName.isDisplayed();
    }

    public boolean verifyNextBtn(){
        return NextBtn.isDisplayed();
    }

    public void verifyMandatoryFields(){
        NextBtn.click();
        Validation.isDisplayed();
        Validation1.isDisplayed();
    }

    public void verifyNavigatingThankYouPage(){
        MessageBox.click();
        MessageBox.sendKeys("THANK YOU");
        FirstName.click();
        FirstName.sendKeys("Amantha");
        NextBtn.click();
        No.click();
    }

    public void verifyNavigatingGiftPage(){
        MessageBox.click();
        MessageBox.sendKeys("THANK YOU");
        FirstName.click();
        FirstName.sendKeys("Amantha");
        NextBtn.click();
        Absolutely.click();
    }
}
