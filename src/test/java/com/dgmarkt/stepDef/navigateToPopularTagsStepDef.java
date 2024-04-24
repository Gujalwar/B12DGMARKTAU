package com.dgmarkt.stepDef;

import com.dgmarkt.pages.CategoryPage;
import com.dgmarkt.pages.HomePage;
import com.dgmarkt.pages.InitialLoginPage;
import com.dgmarkt.pages.LoginPopUp;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class navigateToPopularTagsStepDef {
    CategoryPage categoryPage = new CategoryPage();




    @Then("The user hover over on Category")
    public void the_user_hover_over_on_category() {
        WebDriver webDriver = new ChromeDriver();

        categoryPage.category.click();



    }
    @Then("The user clicks on Televisions")
    public void the_user_clicks_on_televisions() {
        categoryPage.television.click();

    }
    @Then("The user clicks on popular tag Apple")
    public void the_user_clicks_on_popular_tag_apple() {
        categoryPage.appleTag.click();

    }
    @Then("The user verify that there are no products to your search criteria error message")
    public void the_user_verify_that_there_are_no_products_to_your_search_criteria_error_message() {
        String expectedMessage = "There is no product that matches the search criteria.";
        String actualMessage = categoryPage.appleTag.getText();
        Assert.assertEquals(expectedMessage,actualMessage);

    }

}
