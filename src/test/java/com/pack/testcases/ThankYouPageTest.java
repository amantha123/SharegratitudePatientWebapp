package com.pack.testcases;

import com.pack.base.TestBase;
import com.pack.pages.*;
import com.pack.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ThankYouPageTest extends TestBase {

    LandingPage landingPage;
    DepartmentPage departmentPage;
    RecipientPage recipientPage;
    MessagePage messagePage;
    ThankYouPage thankYouPage;
    TestUtil testUtil;

    public ThankYouPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        testUtil = new TestUtil();
        landingPage = new LandingPage();
        departmentPage = new DepartmentPage();
        recipientPage = new RecipientPage();
        messagePage = new MessagePage();
        thankYouPage =  new ThankYouPage();
    }

    @Test(priority=1)
    public void verifyThankYouPageTitleTest(){
        String thankYouPageTitle = thankYouPage.validateThankYouPageTitle();
        Assert.assertEquals(thankYouPageTitle, "ShareGratitude");
    }

    @Test(priority=2)
    public void verifyNavigatingThankYouPageTest(){
        landingPage.verifyNavigatingDepartmentPage();
        departmentPage.verifyNavigatingRecepientPage();
        recipientPage.verifyNavigatingMessagePage();
        messagePage.verifyNavigatingThankYouPage();
    }

    @Test(priority=3)
    public void verifyThankYouPageTest(){
        landingPage.verifyNavigatingDepartmentPage();
        departmentPage.verifyNavigatingRecepientPage();
        recipientPage.verifyNavigatingMessagePage();
        messagePage.verifyNavigatingThankYouPage();
        thankYouPage.verifyLogo();
        thankYouPage.verifyThankYouLabel();
        thankYouPage.verifyText();
        thankYouPage.verifyMobileNumber();
        thankYouPage.verifyEmail();
        thankYouPage.verifySubmitBtn();
        thankYouPage.verifySharewithFamilyFriendsLabel();
        thankYouPage.verifyCopyThankYouLink();
    }

    @Test(priority = 4)
    public void verifyClickingCopyThankYouLinkTest(){
        landingPage.verifyNavigatingDepartmentPage();
        departmentPage.verifyNavigatingRecepientPage();
        recipientPage.verifyNavigatingMessagePage();
        messagePage.verifyNavigatingThankYouPage();
        thankYouPage.verifyClickingCopyThankYouLink();
    }

    @Test(priority = 5)
    public void verifySubmittingContactDetails(){
        landingPage.verifyNavigatingDepartmentPage();
        departmentPage.verifyNavigatingRecepientPage();
        recipientPage.verifyNavigatingMessagePage();
        messagePage.verifyNavigatingThankYouPage();
        thankYouPage.verifySubmittingContactDetails();
    }

    @Test(priority = 6)
    public void verifyNavigatingDepartmentPageTest(){
        landingPage.verifyNavigatingDepartmentPage();
        departmentPage.verifyNavigatingRecepientPage();
        recipientPage.verifyNavigatingMessagePage();
        messagePage.verifyNavigatingThankYouPage();
        thankYouPage.verifyNavigatingDepartmentPage();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
