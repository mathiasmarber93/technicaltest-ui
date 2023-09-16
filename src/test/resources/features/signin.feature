@Test
Feature: Sign In as customer

  Scenario: Sign In
    Given customer open the website
    When customer register an account
    And customer buy products in the shopping cart
    Then the order is created successfully with the correct information