Feature: As a user, I should be able to access to Contacts module.

@smoke
  Scenario:  verify user access to Contacts module

    Given user on the dashboard page
    When the user clicks the "Contacts" modules
    Then verify page title is "Contacts - Trycloud QA"