Feature: As a user, I should be accessing all the main modules of the app.
  User Story: As a user, I should be accessing all the main modules of the app.

  @wip
  Scenario: Verify users accessing all the main modules of the app.
    Given user on the login page
    When users log in with valid credentials
    Then Verify the user see the following modules:
      | Dashboard |
      | Files     |
      | Photos    |
      | Activity  |
      | Talk      |
      | Mail      |
      | Contacts  |
      | Circles   |
      | Calendar  |
      | Deck      |