package com.dgmarkt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {



    @FindBy(css = "a[title='My Account'] span[class='hidden-xs']")
    public WebElement myAccountMenu;
    @FindBy(xpath = "//a[text()=\"My Account\"]")
    public WebElement myAccount;

    @FindBy(xpath = "//a[@id='pt-login-link']")
    public WebElement login;

    @FindBy(xpath = "//a[text()=\"Edit your account information\"]")
    public WebElement editUserInfo;

    @FindBy(xpath = "//input[@name = 'firstname']")
    public  WebElement updateFirstName;

    @FindBy(xpath = "//input[@type = 'submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//div[@class = 'alert alert-success alert-dismissible']")
    public WebElement userInfoUpdateMessage;

    @FindBy(xpath = "//input[@value='Continue']")
    public WebElement continueButton;

    @FindBy(css = ".text-danger")
    public WebElement userInfoEmptyErrorMessage;




}
