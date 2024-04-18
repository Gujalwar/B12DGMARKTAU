package com.dgmarkt.pages;


import com.dgmarkt.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//a[@class='a-close-newsletter']")
    public static WebElement newsLetterPopupExit;
    @FindBy(id = "top-links")
    public static WebElement myAccountMenuList;
    @FindBy(id = "pt-login-link")
    public static WebElement loginButton;
    @FindBy(xpath = "//div[contains(text(),'Congratulation! Login Successfully')]")
    public static WebElement loginSuccessfulMessage;
}


