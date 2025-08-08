Feature: SauceDemo login
  Scenario: Valid Login
    Given I open the SauceDemo login page
    When I enter valid credentials
    Then I should see the products page