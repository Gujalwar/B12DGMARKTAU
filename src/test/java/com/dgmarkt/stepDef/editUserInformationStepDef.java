package com.dgmarkt.stepDef;

import com.dgmarkt.pages.HomePage;
import com.dgmarkt.pages.InitialLoginPage;
import com.dgmarkt.pages.LoginPopUp;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class editUserInformationStepDef {
    InitialLoginPage initialLoginPage = new InitialLoginPage();
    LoginPopUp loginPopUp = new LoginPopUp();
    HomePage homePage = new HomePage();


    @When("The user navigates to the My Account menu and selects login")
    public void the_user_navigates_to_the_my_account_menu_and_selects_login() {

        homePage.myAccountMenu.click();
        homePage.loginButton.click();
    }

    @Then("The user enter valid username {string} and password {string}")
    public void the_user_enter_valid_username_and_password(String email, String password) {
        loginPopUp.login(email, password);


    }

    @Then("The user clicks on Edit your account information")
    public void the_user_clicks_on_edit_your_account_information() {
        homePage.myAccountMenuList.click();
        homePage.myAccount.click();
        homePage.editUserInfo.click();

    }

    @Then("The user update the firstname to {string}")
    public void the_user_update_the_firstname_to(String name) {
        homePage.updateFirstName.sendKeys(name);
        homePage.continueButton.click();

    }

    @Then("Verify the user can update the information successfully")
    public void verifyTheUserCanUpdateTheInformationSuccessfully() {

        String expectedMessage = "Success: Your account has been successfully updated.";
        String actualMessage = homePage.userInfoUpdateMessage.getText();
        Assert.assertEquals(expectedMessage, actualMessage);

    }

    @Then("The user deletes the username and clicks on submit button")
    public void the_user_deletes_the_username_and_clicks_on_submit_button() {
        homePage.updateFirstName.clear();
        homePage.continueButton.click();

    }
    @Then("Verify user gets an error message")
    public void verify_user_gets_an_error_message() {
        String expectedMessage = "First Name must be between 1 and 32 characters!";
        String actualMessage = homePage.userInfoEmptyErrorMessage.getText();
        Assert.assertEquals(expectedMessage,actualMessage);

    }


}


