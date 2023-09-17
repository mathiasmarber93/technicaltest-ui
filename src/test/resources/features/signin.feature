@UI
Feature: Sign In as customer

  Scenario: Sign In
    Given customer open the website
    When registers an account
    And buys products in the shopping cart
    Then the order is created successfully with the correct information