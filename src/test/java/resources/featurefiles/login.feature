Feature: Login Test

  @sanity @regression
  Scenario: User should login successfully with valid credentials
    Given I am on homepage
    When I enter "<standard_user>" in the username field
    And I enter "<secret_sauce>" in the password field
    And I click on the login button
    And I verify the title of the page
    Then I verify the list of the products
