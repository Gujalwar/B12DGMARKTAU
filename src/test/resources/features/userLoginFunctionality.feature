@B12DGMAU-1 @smoke
Feature: User-Login Functionality

  @B12DGMAU-25
  Scenario: Verify that user can login with given credentials for the first authentication
    Given The user logs in with the given username "ders@dgmarkt.com" and password "2574dGlogin"

  @B12DGMAU-26
  Scenario: Verify that user can login by entering the valid E-Mail and password
    Given The user logs in with the given username "ders@dgmarkt.com" and password "2574dGlogin"
    When the user navigates to the My Account menu and selects login
    Then the user enter valid username "nurettincerrah35@gmail.com" and password "nurettintest"
    And the user should verify that successfully logged in

  @B12DGMAU-27
  Scenario: Verify that user can not login with wrong credentials
    Given The user logs in with the given username "ders@dgmarkt.com" and password "2574dGlogin"
    When the user navigates to the My Account menu and selects login
    Then the user enter valid username "wrongEmailAddress@gmail.com" and password "wrongPassword"
    And the user should verify that error message appears

  @B12DGMAU-29
  Scenario Outline: Verify that user can not login with invalid credentials
    Given The user logs in with the given username "ders@dgmarkt.com" and password "2574dGlogin"
    When the user navigates to the My Account menu and selects login
    Then the user enter valid username "<email>" and password "<password>"
    And the user should verify that error message appears
    Examples:
      | email                      | password     |
      | invalidEmailAddress@asd    | nurettintest |
      | nurettincerrah35@gmail.com | l1*&^!"*)(K  |

  @B12DGMAU-30
  Scenario: Verify that user can not login with blank inputboxes
    Given The user logs in with the given username "ders@dgmarkt.com" and password "2574dGlogin"
    When the user navigates to the My Account menu and selects login
    Then the user enter valid username "" and password ""
    And the user should verify that error message appears

  @B12DGMAU-31
  Scenario: Verify that user can see the password as bullet signs by default
    Given The user logs in with the given username "ders@dgmarkt.com" and password "2574dGlogin"
    When the user navigates to the My Account menu and selects login
    Then the user enter any username "nurettincerrah35@gmail.com" and password "nurettintest"
    And the user should verify that password is visible as bullet signs by default

  @B12DGMAU-32
  Scenario: Verify that user can see and use the ‘Forgotten Password’ functionality
    Given The user logs in with the given username "ders@dgmarkt.com" and password "2574dGlogin"
    When the user navigates to the My Account menu and selects login
    Then verify that forgotten password link is visible and working

  @B12DGMAU-33
  Scenario: Verify that user can not login with incorrect credentials after exceeded login 5 attempt
    Given The user logs in with the given username "ders@dgmarkt.com" and password "2574dGlogin"
    When the user navigates to the My Account menu and selects login
    Then the user enter valid username "wrongEmailAddress@gmail.com" and password "wrongPassword"
    And the user enter valid username "wrongEmailAddress@gmail.com" and password "wrongPassword"
    Then the user enter valid username "wrongEmailAddress@gmail.com" and password "wrongPassword"
    And the user enter valid username "wrongEmailAddress@gmail.com" and password "wrongPassword"
    Then the user enter valid username "wrongEmailAddress@gmail.com" and password "wrongPassword"
    And the user enter valid username "wrongEmailAddress@gmail.com" and password "wrongPassword"
    Then the user should verify that warning message shown


