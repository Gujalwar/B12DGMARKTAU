@B12DGMAU-18-AC1
  Feature: Popular tag navigation
    Scenario: User should be able to navigate to popular tags
      Given The user logs in with the given username "ders@dgmarkt.com" and password "2574dGlogin"
      When The user navigates to the My Account menu and selects login
      Then The user enter valid username "gujalwarpooja@gmail.com" and password "pooja@123"
      Then The user hover over on Category
      Then The user clicks on Televisions
      Then The user clicks on popular tag Apple
      Then The user verify that there are no products to your search criteria error message



