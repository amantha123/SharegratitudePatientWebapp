package com.pack.testcases;

import com.pack.base.TestBase;
import com.pack.pages.LandingPage;
import com.pack.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LandingPageTest extends TestBase {

    LandingPage landingPage;
    TestUtil testUtil;


    public LandingPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        testUtil = new TestUtil();
        landingPage = new LandingPage();
    }


    @Test(priority=1)
    public void verifyLandingPageTitleTest(){
        String landingPageTitle = landingPage.validateLandingPageTitle();
        Assert.assertEquals(landingPageTitle, "ShareGratitude");
    }

    @Test(priority=2)
    public void verifyLandingPageTest(){
        landingPage.verifyLogo();
        landingPage.verifyThankStaffLabel();
        landingPage.verifyText();
        landingPage.verifyContinueBtn();
        landingPage.verifyTermsofService();
        landingPage.verifyAcceptableUsePolicy();
        landingPage.verifyPrivacyPolicy();
    }

    @Test(priority=3)
    public void verifyViewingTermsofServiceTest(){
        landingPage.verifyViewingTermsofService();
    }

    @Test(priority=4)
    public void verifyViewingAcceptableUsePolicyTest(){
        landingPage.verifyViewingAcceptableUsePolicy();
    }

    @Test(priority=5)
    public void verifyViewingPrivacyPolicyTest(){
        landingPage.verifyViewingPrivacyPolicy();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
