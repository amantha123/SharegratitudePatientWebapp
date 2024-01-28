package com.pack.testcases;

import com.pack.base.TestBase;
import com.pack.pages.*;
import com.pack.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PaymentPageTest extends TestBase {

    LandingPage landingPage;
    DepartmentPage departmentPage;
    RecipientPage recipientPage;
    MessagePage messagePage;
    GiftPage giftPage;
    GiftDetailPage giftDetailPage;
    PaymentPage paymentPage;
    TestUtil testUtil;

    public PaymentPageTest(){
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
        paymentPage = new PaymentPage();
    }

    @Test(priority=1)
    public void verifyPaymentPageTitleTest(){
        String paymentPageTitle = paymentPage.validatePaymentPageTitle();
        Assert.assertEquals(paymentPageTitle, "ShareGratitude");
    }

    @Test(priority=2)
    public void verifyNavigatingPaymentPageTest(){
        landingPage.verifyNavigatingDepartmentPage();
        departmentPage.verifyNavigatingRecepientPage();
        recipientPage.verifyNavigatingMessagePage();
        messagePage.verifyNavigatingGiftPage();
        giftPage.verifyNavigatingGiftDetailPage();
        giftPage.verifyNavigatingGiftDetailPage();
        giftDetailPage.verifyNavigatingPaymentPage();
    }

    @Test(priority = 3)
    public void verifyPaymentPageTest(){
        landingPage.verifyNavigatingDepartmentPage();
        departmentPage.verifyNavigatingRecepientPage();
        recipientPage.verifyNavigatingMessagePage();
        messagePage.verifyNavigatingGiftPage();
        giftPage.verifyNavigatingGiftDetailPage();
        giftPage.verifyNavigatingGiftDetailPage();
        giftDetailPage.verifyNavigatingPaymentPage();
        paymentPage.verifyLogo();
        paymentPage.verifyPaywithCardLabel();
        paymentPage.verifyName();
        paymentPage.verifyCardNo();
        paymentPage.verifyEmail();
        paymentPage.verifyEmail();
        paymentPage.verifyPayBtn();
    }

    @Test(priority = 4)
    public void verifyMakingPaymentTest(){
        landingPage.verifyNavigatingDepartmentPage();
        departmentPage.verifyNavigatingRecepientPage();
        recipientPage.verifyNavigatingMessagePage();
        messagePage.verifyNavigatingGiftPage();
        giftPage.verifyNavigatingGiftDetailPage();
        giftPage.verifyNavigatingGiftDetailPage();
        giftDetailPage.verifyNavigatingPaymentPage();
        paymentPage.verifyMakingPayment();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
