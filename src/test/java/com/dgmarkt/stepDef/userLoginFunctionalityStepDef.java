package com.dgmarkt.stepDef;

import com.dgmarkt.pages.BasePage;
import com.dgmarkt.pages.HomePage;
import com.dgmarkt.pages.LoginPopUp;
import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class userLoginFunctionalityStepDef {

    HomePage homePage = new HomePage();
    LoginPopUp loginPopUp = new LoginPopUp();

    @Given("the user navigates to the My Account menu and selects login")
    public void the_user_navigates_to_the_my_account_menu_and_selects_login() {
        homePage.myAccountMenuList.click();
        homePage.loginButton.click();
    }

    @When("the user enter valid username {string} and password {string}")
    public void the_user_enter_valid_username_and_password(String email, String password) {
        loginPopUp.login(email, password);
    }

    @Then("the user should verify that successfully logged in")
    public void the_user_should_verify_that_successfully_logged_in() {
        String expectedMessage = "Congratulation! Login Successfully";
        String actualMessage = homePage.loginSuccessfulMessage.getText();
        Assert.assertTrue(actualMessage.contains(expectedMessage));
    }
}
