package com.pack.testcases;

import com.pack.base.TestBase;
import com.pack.pages.DepartmentPage;
import com.pack.pages.LandingPage;
import com.pack.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DepartmentPageTest extends TestBase {

    LandingPage landingPage;
    DepartmentPage departmentPage;
    TestUtil testUtil;

    public DepartmentPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        testUtil = new TestUtil();
        landingPage = new LandingPage();
        departmentPage = new DepartmentPage();
    }

    @Test(priority=1)
    public void verifyDepartmentPageTitleTest(){
        String departmentPageTitle = departmentPage.validateDepartmentPageTitle();
        Assert.assertEquals(departmentPageTitle, "ShareGratitude");
    }

    @Test(priority=2)
    public void verifyNavigatingDepartmentPageTest(){
        landingPage.verifyNavigatingDepartmentPage();
    }

    @Test(priority=3)
    public void verifyDepartmetPageTest(){
        landingPage.verifyNavigatingDepartmentPage();
        departmentPage.verifyLogo();
        departmentPage.verifyShareGratitudeLabel();
        departmentPage.verifySearchBox();
        departmentPage.verifyDepartmentOptions();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
