package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeletedFilesPage {

    @FindBy(xpath = "//table[@id='filestable']/tbody/tr[@data-path='IMG_3104.HEIC']//span[@data-original-title='IMG_3104.HEIC']")//table[@id='filestable']/tbody/tr[@data-path='IMG_3104.HEIC']")
    public WebElement deletedFile;

    @FindBy(xpath = "(//table[@id='filestable']/tbody/tr[@data-type='file'])[1]//span[.=' Restore']")
    public WebElement restoreBtn;

    public DeletedFilesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
