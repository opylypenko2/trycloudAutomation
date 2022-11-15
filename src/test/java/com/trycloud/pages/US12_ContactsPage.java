package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US12_ContactsPage {

public US12_ContactsPage(){

    PageFactory.initElements(Driver.getDriver(),this);
}

 @FindBy(css = "li[data-id='contacts']>a>svg>image")
public WebElement contactsModule;













}
