@B12DGMAU-2 @smoke
Feature:User-Logout Functionality

  @B12DGMAU-35
  Scenario: The user should be able to logout successfully and redirected to main page
    Given The user logs in with the given username "ders@dgmarkt.com" and password "2574dGlogin"
    When the user navigates to the My Account menu and selects login
    Then the user enter valid username "nurettincerrah35@gmail.com" and password "nurettintest"
    And the user should verify that successfully logged in
    Then the user navigates to the My Account menu and selects logout
    And verify that user redirected to main page again


  @B12DGMAU-36
  Scenario: Once the user logs out, the user should not be able to login back by going back on browser
    Given The user logs in with the given username "ders@dgmarkt.com" and password "2574dGlogin"
    When the user navigates to the My Account menu and selects login
    Then the user enter valid username "nurettincerrah35@gmail.com" and password "nurettintest"
    And the user should verify that successfully logged in
    Then the user navigates to the My Account menu and selects logout
    And verify that user redirected to main page again
    Then navigate back on browser and verify that user can not login