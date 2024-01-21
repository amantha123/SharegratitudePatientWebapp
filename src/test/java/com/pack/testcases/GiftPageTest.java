package com.pack.testcases;

import com.pack.base.TestBase;
import com.pack.pages.*;
import com.pack.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GiftPageTest extends TestBase {

    LandingPage landingPage;
    DepartmentPage departmentPage;
    RecipientPage recipientPage;
    MessagePage messagePage;
    GiftPage giftPage;
    TestUtil testUtil;

    public GiftPageTest(){
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
        giftPage = new GiftPage();
    }

    @Test(priority=1)
    public void verifyGiftPageTitleTest(){
        String giftPageTitle = giftPage.validateGiftPageTitle();
        Assert.assertEquals(giftPageTitle, "ShareGratitude");
    }

    @Test(priority=2)
    public void verifyNavigatingGiftPageTest(){
        landingPage.verifyNavigatingDepartmentPage();
        departmentPage.verifyNavigatingRecepientPage();
        recipientPage.verifyNavigatingMessagePage();
        messagePage.verifyNavigatingGiftPage();
    }

    @Test(priority=3)
    public void verifyGitPageTest(){
        landingPage.verifyNavigatingDepartmentPage();
        departmentPage.verifyNavigatingRecepientPage();
        recipientPage.verifyNavigatingMessagePage();
        messagePage.verifyNavigatingGiftPage();
        giftPage.verifySelectGiftLabel();
        giftPage.verifyGiftOptions();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
