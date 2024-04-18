@B12DGMAU-1
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

#  @B12DGMAU-1
#  Scenario: Verify that user can not login with wrong credentials
#  Given
#
#  @B12DGMAU-1
#  Scenario: Verify that user can not login with invalid credentials
#  Given
#
#  @B12DGMAU-1
#  Scenario: Verify that user can not login with blank inputboxes
#  Given
#
#  @B12DGMAU-1
#  Scenario: Verify that user can see the password as bullet signs by default
#  Given
#
#  @B12DGMAU-1
#  Scenario: Verify that user can see and use the ‘Forgotten Password’ functionality
#  Given
#
#  @B12DGMAU-1
#  Scenario: Verify that user can not login with incorrect credentials after excedeed login 5 attempt
#  Given