
Feature: Story: As a user, I should be able to update settings.

  Background:
    Given user on the dashboard page
    When the user clicks the "Files" module

  Scenario: Verify users update settings
    And user clicks Settings on the left bottom cornerr
    Then the user should be able to click any buttonss

  Scenario: Verify users to see the app storage usage
    And user checks the current storage usagee
    And user uploads file with the upload file optionn
    And user refresh the pagee
    Then the user should be able to see storage usage is increasedd