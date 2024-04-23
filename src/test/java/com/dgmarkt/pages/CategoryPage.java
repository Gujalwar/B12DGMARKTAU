package com.dgmarkt.pages;

import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class CategoryPage extends BasePage {

    WebDriver driver;
    @FindBy(xpath = "//span[normalize-space()='Category']")
    public WebElement category;

    @FindBy(xpath = "//a[text() ='Televisions']")
    public WebElement televisionCategory;

    @FindBy(xpath = "//a[text()='Cello C1920FS 19\" LED-backlit LCD TV']")
    public WebElement celloTvToAdd;

    @FindBy(xpath = "//button[text()='Add to Cart']")
    public WebElement addToCartButton;

    @FindBy(xpath = "//div[text()='Success: You have added ']")
    public WebElement cartSuccessMessage;

    @FindBy(xpath = "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
    public WebElement cartIcon;

    @FindBy(id = "cart-total")
    public WebElement cartTotal;

    @FindBy(xpath = "//a[@href='https://dgmarkt.com/index.php?route=checkout/cart']")
    public  WebElement viewCartButton;

    @FindBy(xpath = "//strong[normalize-space()='Checkout']")
    public WebElement checkout;


      public void hover(String menu) {
        ////Actions actions = new Actions(Driver.get());
        //actions.moveToElement(category).perform();
          //BrowserUtils.hover(category);

    }
}
