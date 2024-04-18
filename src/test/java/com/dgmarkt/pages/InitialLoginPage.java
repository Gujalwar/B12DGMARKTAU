package com.dgmarkt.pages;

import com.dgmarkt.utilities.ConfigurationReader;
import com.dgmarkt.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InitialLoginPage extends BasePage{

    @FindBy (xpath = "//input[@name='email']")
    public static WebElement emailInput;
    @FindBy (xpath = "//input[@name='password']")
    public static WebElement passwordInput;
    @FindBy (xpath = "//input[@type='submit']")
    public static WebElement loginButton;


}
