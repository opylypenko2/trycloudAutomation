package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US1_LoginPage {

    @FindBy(css = "input#user")
    public WebElement inputUserName;
    @FindBy(css = "input#password")
    public WebElement inputPassword;
    @FindBy(xpath = "//input[@id='submit-form']")
    public WebElement loginBtn;


    public US1_LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void login(String username, String password) {
        inputUserName.sendKeys(username);
        inputPassword.sendKeys(password);
    }
}
