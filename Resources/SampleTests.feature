Feature: Sample tests

  @tag1
  Scenario: Perform Registration
    Given I Navigate to application
    When I select "Sign in" element
    And I enter Email Address
    And I select "Create an Account" element
    And I perform registration with below data
      | CusFirstName | CusLastName | Password  | Dob        | FirstName | LastName | Company     | Address   | City      | State   | Zip    | Country       | Phone      | Mobile | Assign |
      | Johnson      | Smith       | Smith@123 | 23-5-1990 | John      | Nison    | Abc Company | Hyderabad | Hyderabad | Indiana | 500019 | United States | 9999988888 | Sample |  Assign      |
    And I select "Register" element
    Then user should be register
    And Verify the user name in the screen
    When I select "Any item" element
    And I select "Add to cart" element
    And I select "Proceed to checkout" element
    And I select "Proceed to checkout" element
And I select "Proceed to checkout" element
And I select "Terms of Service" element
And I select "Proceed to checkout" element
Then Verify the product details in Payment page
