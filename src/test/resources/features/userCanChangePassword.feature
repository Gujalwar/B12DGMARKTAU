@B12DGMAU-8 @smoke
Feature: Password change function

  @B12DGMAU-37
  Scenario: The user changes the password successfully
    Given The user logs in with the given username "ders@dgmarkt.com" and password "2574dGlogin"
    When the user navigates to the My Account menu and selects login
    Then the user enter valid username "nurettincerrah35@gmail.com" and password "nurettintest"
    And the user should verify that successfully logged in
    Then the user navigates to my account and clicks change password
    And the user should enter the new password as "nurettintest" and verify that password has changed

  @B12DGMAU-38
  Scenario: The user needs to get an error message if the user cant confirm password
    Given The user logs in with the given username "ders@dgmarkt.com" and password "2574dGlogin"
    When the user navigates to the My Account menu and selects login
    Then the user enter valid username "nurettincerrah35@gmail.com" and password "nurettintest"
    And the user should verify that successfully logged in
    Then the user navigates to my account and clicks change password
    And the user should enter the new password as "nurettintest" and confirmation password as "Test" and verify error message