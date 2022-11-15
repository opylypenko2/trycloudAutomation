package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US4_accessingFilesModulePage_Ikram {

    public US4_accessingFilesModulePage_Ikram(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@aria-label='Files']")
    public WebElement filesIcon;

    @FindBy(xpath = "//input[@class='select-all checkbox']")
    public WebElement plusCheckBox;

    @FindBy(tagName = "input")
    public List<WebElement> nameCheckboxes;




}
