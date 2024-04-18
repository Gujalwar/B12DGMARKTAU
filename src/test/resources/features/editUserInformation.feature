@B12DGMAU-7
  Feature: My Account-User can Edit account information
    @B12DGMAU-7-AC-1
    Scenario: Verify that the user can update their account information
      Given The user logs in with the given username "ders@dgmarkt.com" and password "2574dGlogin"
      When The user navigates to the My Account menu and selects login
      Then The user enter valid username "gujalwarpooja@gmail.com" and password "pooja@123"
      And The user clicks on Edit your account information
      Then The user update the firstname to "Pooja1"
      Then Verify the user can update the information successfully

    @B12DGMAU-7-AC-2
      Scenario:  Verify that the error message is displayed when the user does not fill in the required field.
        Given The user logs in with the given username "ders@dgmarkt.com" and password "2574dGlogin"
        When The user navigates to the My Account menu and selects login
        Then The user enter valid username "gujalwarpooja@gmail.com" and password "pooja@123"
        And The user clicks on Edit your account information
        Then The user deletes the username and clicks on submit button
        Then Verify user gets an error message




