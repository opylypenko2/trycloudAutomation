package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class US7_ManageFilesPage_Mani {
    public US7_ManageFilesPage_Mani() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//ul[@id='appmenu']//a[@aria-label='Files']")
    public WebElement filesModule;


    @FindBy(xpath = "//span[@class='icon icon-add']")
    public WebElement addIcon;

    @FindBy(xpath = "//span[normalize-space()='New folder']")
    public WebElement newFolderIcon;

    @FindBy(xpath = "//input[@id='view13-input-folder']")
    public WebElement newFolderInput;

    @FindBy(xpath = "//input[@class='icon-confirm']")
    public WebElement submitBtn;
    @FindBy(xpath = "//td[@class='filename ui-draggable ui-draggable-handle']//span[@class='innernametext']")
    public List<WebElement> fileAndFoldersList;

    @FindBy(xpath = "//a[@class='menu-option option-delete']")
    public WebElement deleteFolderAction;

    @FindBy(xpath = "//input[@type ='file']")
    public WebElement inputButton;

    @FindBy(xpath = "//span[@class='innernametext']")
    public List<WebElement> fileName;


    @FindBy(xpath = "(//tr[@data-type='dir'])[1]")
    public WebElement firstFolder;

//    public void addFolder(String folderName) {
//        addIcon.click();
//        newFolderIcon.click();
//        newFolderInput.sendKeys(folderName);
//        submitBtn.click();
//
//    }

    public void deleteFolder(WebElement folder) {
        Actions actions = new Actions(Driver.getDriver());
        actions.contextClick(folder).perform();
        deleteFolderAction.click();
    }


    public void verifyFileName(List<WebElement> listOfElements, String expected) {
        String actual = "";
        for (WebElement each : listOfElements) {
            if (each.getText().equalsIgnoreCase(expected)) {
                actual += "" + each.getText();
                break;
            }
        }
        System.out.println(actual);
        Assert.assertEquals(expected, actual);

    }

}
