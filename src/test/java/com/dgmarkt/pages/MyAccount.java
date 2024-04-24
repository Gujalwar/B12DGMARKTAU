package com.dgmarkt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount extends BasePage{

    @FindBy (xpath = "//a[contains(text(),'Password')]")
    public WebElement passwordTab;
    @FindBy(id = "input-password")
    public WebElement passwordInput;
    @FindBy(id = "input-confirm")
    public WebElement passwordConfirmInput;
    @FindBy(xpath = "//input[@type='submit']")
    public WebElement continueButton;
    @FindBy(xpath = "//div[contains(text(),'Success')]")
    public WebElement passwordChangedSuccessMessage;
    @FindBy(xpath = "//div[@class='text-danger']")
    public WebElement passwordConfirmationError;
}
