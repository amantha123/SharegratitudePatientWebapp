package com.pack.pages;

import com.pack.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GiftPage extends TestBase {

    @FindBy(xpath = "//span[contains(.,'Select Gift')]")
    WebElement SelectGift;

    @FindBy(xpath = "//span[contains(.,'Coffee Drink')]")
    WebElement GiftOptions;


}
