package com.pack.pages;

import com.pack.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DepartmentPage extends TestBase {

    @FindBy(xpath = "//img[@src='https://human-backend-data.s3.eu-west-2.amazonaws.com/6322eced057b8bea7c748e6f/organization/1665732870421.jpg']")
    WebElement Logo;

    @FindBy(xpath = "//span[@class='org'][contains(.,'ShareGratitude')]")
    WebElement ShareGratitudeLabel;

    @FindBy(xpath = "//input[contains(@placeholder,'Search by department or ward')]")
    WebElement SearchBox;

    @FindBy(xpath = "//span[contains(.,'Software Development')]")
    WebElement DepartmentOptions;

    public DepartmentPage(){
        PageFactory.initElements(driver, this);
    }

    public String validateDepartmentPageTitle(){
        return driver.getTitle();
    }

    public boolean verifyLogo(){
        return Logo.isDisplayed();
    }

    public boolean verifyShareGratitudeLabel(){
        return ShareGratitudeLabel.isDisplayed();
    }

    public boolean verifySearchBox(){
        return SearchBox.isDisplayed();
    }

    public boolean verifyDepartmentOptions(){
        return DepartmentOptions.isDisplayed();
    }

    public void verifyNavigatingRecepientPage(){
        DepartmentOptions.click();
    }
}
