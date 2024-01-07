package com.pack.pages;

import com.pack.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecipientPage extends TestBase {

    @FindBy(xpath = "//img[@src='https://human-backend-data.s3.eu-west-2.amazonaws.com/6322eced057b8bea7c748e6f/organization/1665732870421.jpg']")
    WebElement Logo;

    @FindBy(xpath = "//span[contains(.,'Select Recipient')]")
    WebElement SelectRecipientLabel;

    @FindBy(xpath = "(//div[contains(.,'Software Development')])[4]")
    WebElement SoftwareDevelopmentText;

    @FindBy(xpath = "//input[contains(@placeholder,'Search by Name')]")
    WebElement SearchBox;

    @FindBy(xpath = "//div[@class='card'][contains(.,'KavinthanAssociate Tech Lead...')]")
    WebElement Recipients;

    public RecipientPage(){
        PageFactory.initElements(driver, this);
    }

    public String validateRecepientPageTitle(){
        return driver.getTitle();
    }

    public boolean verifyLogo(){
        return Logo.isDisplayed();
    }

    public boolean verifySelectRecipientLabel(){
        return SelectRecipientLabel.isDisplayed();
    }

    public boolean verifySoftwareDevelopmentText(){
        return SoftwareDevelopmentText.isDisplayed();
    }

    public boolean verifySearchBox(){
        return SearchBox.isDisplayed();
    }

    public boolean verifyRecipients(){
        return Recipients.isDisplayed();
    }

    public void verifyNavigatingMessagePage(){
        Recipients.click();
    }
}
