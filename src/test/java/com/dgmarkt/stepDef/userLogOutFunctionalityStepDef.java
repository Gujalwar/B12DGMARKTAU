package com.dgmarkt.stepDef;

import com.dgmarkt.pages.HomePage;
import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class userLogOutFunctionalityStepDef {

    HomePage homePage = new HomePage();

    @Then("the user navigates to the My Account menu and selects logout")
    public void the_user_navigates_to_the_my_account_menu_and_selects_logout() {
        homePage.mAMenu.click();
        homePage.myAccountButton.click();
        String expectedTitle = "My Account";
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
        homePage.mAMenu.click();
        homePage.logOutButton.click();
        homePage.conButton.click();

    }
    @Then("verify that user redirected to main page again")
    public void verify_that_user_redirected_to_main_page_again() {
        String expectedTitle = "Your Store";
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @Then("navigate back on browser and verify that user can not login")
    public void navigateBackOnBrowserAndVerifyThatUserCanNotLogin() {
        Driver.get().navigate().back();
        String expectedMessage = "You have been logged off your account.";
        String actualMessage = homePage.logOutMessage.getText();
        Assert.assertTrue(actualMessage.contains(expectedMessage));
        BrowserUtils.waitFor(3);
    }
}
