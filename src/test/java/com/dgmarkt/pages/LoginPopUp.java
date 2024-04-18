package com.dgmarkt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPopUp extends BasePage {

    @FindBy(id = "input-email")
    public static WebElement emailInput;
    @FindBy(id = "input-password")
    public static WebElement passwordInput;
    @FindBy(xpath = "(//button[@class='button btn'])[1]")
    public static WebElement loginButton;
    @FindBy(xpath = "(//button[@class='button btn'])[2]")
    public static WebElement createAccountButton;
    @FindBy(xpath = "//div[contains(text(),'Warning: No match for E-Mail Address and/or Password.')]")
    public static WebElement wrongEmailOrPasswordWarningMessage;
    @FindBy (className = "forgotten")
    public static WebElement forgottenPasswordLink;



    public void login(String username, String password) {
        emailInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }


}
