package com.dgmarkt.stepDef;

import com.dgmarkt.pages.CategoryPage;
import com.dgmarkt.pages.HomePage;
import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.Driver;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class cartIconFunctionStepDef {
    HomePage homePage = new HomePage();
    CategoryPage categorypage = new CategoryPage();
    WebDriver driver;




    @Then("The user hover over the Category")
    public void theUserHoverOverTheCategory() {
        BrowserUtils.hover(categorypage.category);


    }

    @Then("The user clicks on TELEVISIONS")
    public void theUserClicksOnTELEVISIONS() {
        categorypage.televisionCategory.click();

    }
    @Then("the user add CELLO LED-BACKLIT LCD TV to a cart by clicking cart icon")
    public void theUserAddCELLOLEDBACKLITLCDTVToACartByClickingCartIcon() {
        categorypage.celloTvToAdd.click();
        categorypage.addToCartButton.click();
    }

    @Then("Verify that the user is able to see products into the cart by clicking cart icon")
    public void verify_that_the_user_is_able_to_see_products_into_the_cart_by_clicking_cart_icon() {
        categorypage.cartIcon.click();

    }


    @Then("The user clicks on cart icon")
    public void theUserClicksOnCartIcon() {
        categorypage.cartTotal.click();

    }

    @Then("Verify that the user is able to see products into the cart by clicking view cart button")
    public void verifyThatTheUserIsAbleToSeeProductsIntoTheCartByClickingViewCartButton() {
        categorypage.viewCartButton.click();
    }
}


