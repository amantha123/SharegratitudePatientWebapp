package com.pack.testcases;

import com.pack.base.TestBase;
import com.pack.pages.*;
import com.pack.util.TestUtil;
import org.testng.annotations.BeforeMethod;

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


}
