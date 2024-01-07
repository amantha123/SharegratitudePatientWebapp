package com.pack.testcases;

import com.pack.base.TestBase;
import com.pack.pages.DepartmentPage;
import com.pack.pages.LandingPage;
import com.pack.pages.MessagePage;
import com.pack.pages.RecipientPage;
import com.pack.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MessagePageTest extends TestBase {

    LandingPage landingPage;
    DepartmentPage departmentPage;
    RecipientPage recipientPage;
    MessagePage messagePage;
    TestUtil testUtil;

    public MessagePageTest(){
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
    }

    @Test(priority=1)
    public void verifyMessagePageTitleTest(){
        String messagePageTitle = messagePage.validateMessagePageTitle();
        Assert.assertEquals(messagePageTitle, "ShareGratitude");
    }

    @Test(priority=2)
    public void verifyNavigatingMessagePageTest(){
        landingPage.verifyNavigatingDepartmentPage();
        departmentPage.verifyNavigatingRecepientPage();
        recipientPage.verifyNavigatingMessagePage();
    }

    @Test(priority=3)
    public void verifyMessagePageTest(){
        landingPage.verifyNavigatingDepartmentPage();
        departmentPage.verifyNavigatingRecepientPage();
        recipientPage.verifyNavigatingMessagePage();
        messagePage.verifyLogo();
        messagePage.verifyYourThankYouMessageLabel();
        messagePage.verifyMessageBox();
        messagePage.verifyFirstName();
        messagePage.verifyNextBtn();
    }

    @Test(priority = 4)
    public void verifyMandatoryFieldsTest(){
        landingPage.verifyNavigatingDepartmentPage();
        departmentPage.verifyNavigatingRecepientPage();
        recipientPage.verifyNavigatingMessagePage();
        messagePage.verifyMandatoryFields();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
