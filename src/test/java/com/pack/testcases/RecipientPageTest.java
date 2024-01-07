package com.pack.testcases;

import com.pack.base.TestBase;
import com.pack.pages.DepartmentPage;
import com.pack.pages.LandingPage;
import com.pack.pages.RecipientPage;
import com.pack.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RecipientPageTest extends TestBase {

    LandingPage landingPage;
    DepartmentPage departmentPage;
    RecipientPage recipientPage;
    TestUtil testUtil;

    public RecipientPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        testUtil = new TestUtil();
        landingPage = new LandingPage();
        departmentPage = new DepartmentPage();
        recipientPage = new RecipientPage();
    }

    @Test(priority=1)
    public void verifyRecipientPageTitleTest(){
        String recipientPageTitle = recipientPage.validateRecepientPageTitle();
        Assert.assertEquals(recipientPageTitle, "ShareGratitude");
    }

    @Test(priority=2)
    public void verifyNavigatingRecipientPageTest(){
        landingPage.verifyNavigatingDepartmentPage();
        departmentPage.verifyNavigatingRecepientPage();
    }

    @Test(priority=3)
    public void verifyRecipientPageTest(){
        landingPage.verifyNavigatingDepartmentPage();
        departmentPage.verifyNavigatingRecepientPage();
        recipientPage.verifyLogo();
        recipientPage.verifySelectRecipientLabel();
        recipientPage.verifySoftwareDevelopmentText();
        recipientPage.verifySearchBox();
        recipientPage.verifyRecipients();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
