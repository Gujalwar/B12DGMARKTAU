@B12DGMAU-6
  Feature: Cart Icon Function

    @B12DGMAU-6-AC1
    Scenario: Verify that user should be able to *see the products added to the cart by clicking the cart icon
      Given The user logs in with the given username "ders@dgmarkt.com" and password "2574dGlogin"
      When The user navigates to the My Account menu and selects login
      Then The user enter valid username "gujalwarpooja@gmail.com" and password "pooja@123"
      Then The user hover over the Category
      Then The user clicks on TELEVISIONS
      Then the user add CELLO LED-BACKLIT LCD TV to a cart by clicking cart icon
      Then Verify that the user is able to see products into the cart by clicking cart icon


    @B12DGMAU-6-AC2
    Scenario: Verify that user should be able to *see the products added to the cart by clicking the cart icon
      Given The user logs in with the given username "ders@dgmarkt.com" and password "2574dGlogin"
      When The user navigates to the My Account menu and selects login
      Then The user enter valid username "gujalwarpooja@gmail.com" and password "pooja@123"
      Then The user hover over the Category
      Then The user clicks on TELEVISIONS
      Then the user add CELLO LED-BACKLIT LCD TV to a cart by clicking cart icon
      Then The user clicks on cart icon
      Then Verify that the user is able to see products into the cart by clicking view cart button
