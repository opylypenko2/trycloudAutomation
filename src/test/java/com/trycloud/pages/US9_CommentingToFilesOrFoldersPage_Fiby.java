package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US9_CommentingToFilesOrFoldersPage_Fiby {


    @FindBy(xpath = "(//a[@aria-label='Files'])[1]")
    public WebElement filesModule;

    @FindBy(xpath = "(//span[@class='icon icon-more'])[2]")
    public WebElement actionIcon;

    @FindBy(xpath="//span [.='Details']")
    public WebElement detailsOption;

    @FindBy(id = "commentsTabView")
    public WebElement commentsTab;

@FindBy(className = "message")
    public WebElement inputBox;

@FindBy(xpath = "//input[@class='submit icon-confirm has-tooltip']")
    public WebElement submitButton;

//@FindBy(id = "tab-commentsTabView")
@FindBy(xpath = "(//div[@class='message'])[2]")
    public WebElement commentSection;


    public US9_CommentingToFilesOrFoldersPage_Fiby() {

        PageFactory.initElements(Driver.getDriver(), this);
    }


}
