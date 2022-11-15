package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class Us10_UpdatingSettingsPage_Jamil {

    public Us10_UpdatingSettingsPage_Jamil(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@aria-label='Files'])[1]")
    public WebElement filesButton;
    @FindBy(xpath = "//button[@class='settings-button']")
    public WebElement settingsButton;
//    @FindBy(xpath = "//input[@class='checkbox']")
//    public List<WebElement> checkBoxesFromSettings;
    @FindBy(xpath = "//label[@for='showRichWorkspacesToggle']")
    public WebElement firstCheckBox;
    @FindBy(xpath = "//label[@for='recommendationsEnabledToggle']")
    public WebElement secondCheckBox;
    @FindBy(xpath = "//label[@for='showhiddenfilesToggle']")
    public WebElement thirdCheckBox;

    @FindBy(xpath = "//li[@id='quota']")
    public WebElement storage;
    @FindBy(xpath = "//a[@class='button new']")
    public WebElement plusButton;
    @FindBy(xpath = "//label[@data-action='upload']")
    public WebElement uploadFileButton;
    @FindBy(xpath = "//input[@type='file']")
    public WebElement inputFile;
    @FindBy(xpath = "//div[@id='uploadprogressbar']")
    public WebElement uploadProgressBar;

    public List<WebElement> list(){
        List<WebElement> checkBoxesFromSettings = new ArrayList<>();
        checkBoxesFromSettings.add(firstCheckBox);
        checkBoxesFromSettings.add(secondCheckBox);
        checkBoxesFromSettings.add(thirdCheckBox);
        return checkBoxesFromSettings;
    }
}
