Feature:User should able to click and access the functionalities of Puma home page


  Scenario: Verify that user should take the cursor on element present on the home page

    Given user navigate to the home page
    When user move cursor on women icon
    Then user display the page of women icon
    And user able to click on the sustainability
    Then user should get display the text
    And user able to click on the product and gender icon
    Then user should display the product list page




    Scenario:Verify that user able to click on the element

      Given user navigate to home page
      When user click on the women icon
      Then user should display the text of women
      And user able to select the category,accessories and price
      Then user should display the products list page
      And user able to click on the grid
      Then user should navigate to the page according to grid



    Scenario:Verify that user able to enter the product name in search bar

      Given user navigate to puma home page
      When user able to enter the product name(Shoes) in the search bar
      Then user should get display the product name
      And user able to select the size of the shoes
      Then user should get display the size
      And user able to select the colour of the shoes
      Then user should get display the products based on the size and colour

  @smoke
   Scenario: Verify that user able to enter the  invalid pincode

      Given user navigate to the puma home page
      When user able to enter the product name Shoes in search bar
      Then user should get display the name of product
      And user able to select the colour of shoes
      Then user should get display the products
      And user able to click on the gender from the dropdown
      Then user should get display the products based on the selected from the dropdown
      And user able to click on the product which is displayed based on the colour and gender
      Then user should display the title of the product
      And user enter the invalid pincode
      Then user should display the error message



      Scenario: Verify that user able to click on the icon

        Given user navigate to home page of puma
        When user able to click on the wishlist icon
        Then user should navigate login page
        And user able to click on the cart icon
        Then user should navigate to the login and Register page


    Scenario Outline: Search

      Given user is on home page
      When user able to type "<text>"
      Then "<results>" are displayed
      Examples:
        | text            | results |
        | Dress           |  Dress     |
        | Bags And Tshirt | Bags And Tshirt |
