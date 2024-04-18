package com.dgmarkt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoryPage extends BasePage {

    @FindBy(xpath = "//span[normalize-space()='Category'")
    public WebElement category;

    @FindBy(xpath = "//a[text()='Televisions']")
    public WebElement television;

    @FindBy(xpath = "//a[normalize-space()='Apple']")
    public WebElement appleTag;

}
