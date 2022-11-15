package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US3_BasePage_AccessingMainModules_Olena {

    @FindBy(xpath = "//ul[@id='appmenu']/li[@tabindex='-1']/a/span")
    public List<WebElement> actualMainModules;

    public US3_BasePage_AccessingMainModules_Olena() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
