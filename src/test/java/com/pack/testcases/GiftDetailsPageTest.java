package com.pack.testcases;

import com.pack.base.TestBase;
import com.pack.pages.*;
import com.pack.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GiftDetailsPageTest extends TestBase {

    LandingPage landingPage;
    DepartmentPage departmentPage;
    RecipientPage recipientPage;
    MessagePage messagePage;
    GiftPage giftPage;
    GiftDetailPage giftDetailPage;
    TestUtil testUtil;

    public GiftDetailsPageTest(){
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
        giftDetailPage = new GiftDetailPage();
    }

    @Test(priority=1)
    public void verifyGiftDetailPageTitleTest(){
        String giftDetailPageTitle = giftDetailPage.validateGiftDetailPageTitle();
        Assert.assertEquals(giftDetailPageTitle, "ShareGratitude");
    }

    @Test(priority=2)
    public void verifyNavigatingGiftDetailPageTest(){
        landingPage.verifyNavigatingDepartmentPage();
        departmentPage.verifyNavigatingRecepientPage();
        recipientPage.verifyNavigatingMessagePage();
        messagePage.verifyNavigatingGiftPage();
        giftPage.verifyNavigatingGiftDetailPage();
    }

    @Test(priority = 3)
    public void verifyGiftDetailPage(){
        landingPage.verifyNavigatingDepartmentPage();
        departmentPage.verifyNavigatingRecepientPage();
        recipientPage.verifyNavigatingMessagePage();
        messagePage.verifyNavigatingGiftPage();
        giftPage.verifyNavigatingGiftDetailPage();
        giftDetailPage.verifyLabel();
        giftDetailPage.verifyText();
        giftDetailPage.verifyAmount();
        giftDetailPage.verifyContinueBtn();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
