package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US11_accessingTalkModulePage_Mohamed {


    public US11_accessingTalkModulePage_Mohamed(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath = "(//a[@aria-label='Talk'])[1]")
    public WebElement TalkButton;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement searchBoxInput;

    @FindBy(xpath = "//a[@aria-label='Conversation, Mike India']")
    public WebElement userMike;



    @FindBy(xpath = "//div[@role='textbox']")
    public WebElement inputMesgBox;


    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButtn;


    @FindBy(xpath = "//div[@class='scroller']")
    public WebElement textMessage;
}
