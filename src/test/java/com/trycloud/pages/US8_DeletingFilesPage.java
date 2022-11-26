package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US8_DeletingFilesPage {

    @FindBy(xpath = "//input[@type='file']")
    public WebElement fileUpload;

    @FindBy(xpath = "//span[normalize-space()='Delete file']")
    //   //div/ul/li/a/span[.='Delete file']
    //   //span[contains(text(),'Delete f')]
    public WebElement deleteFileOption;


    @FindBy(xpath = "(//table[@id='filestable']/tbody/tr[@data-type='file'])[1]")
    public WebElement file;

    @FindBy(xpath = "//table[@id='filestable']//tr[@data-type='file']/td[2]/a/span[2]/a[2]/span")
    public WebElement actionsIconFile;
    //  @FindBy(xpath = "(//table[@id='filestable']/tbody/tr[@data-type='file'])[1]//a[@class='action action-menu permanent']")

    @FindBy(xpath = "(//table[@id='filestable']/tbody/tr[@data-type='dir'])[1]")
    public WebElement folder;

    @FindBy(xpath = "(//table[@id='filestable']/tbody/tr[@data-type='dir'])[1]//a[@class='action action-menu permanent']")
    public WebElement actionsIconFolder;

    @FindBy(xpath = "//a[normalize-space()='Deleted files']")
    public WebElement deletedFilesModule;

    @FindBy(xpath = "//table[@id='filestable']/tbody//tr")
    public List<WebElement> allDeletedFiles;


    public US8_DeletingFilesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
