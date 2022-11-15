package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US2_LoginWithInvalidCredentialsPage_Katya {
    public US2_LoginWithInvalidCredentialsPage_Katya() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//p[@class='warning wrongPasswordMsg']")
    public WebElement message;

}
