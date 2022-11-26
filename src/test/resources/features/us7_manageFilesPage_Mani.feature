@wip
Feature: As a user, I should be able to remove files from the favorites and upload a file directly
  UserStory: As a user, I should be able to manage folders


  Background:
    Given user on the dashboard page
    When the user clicks the "Files" module
    And user clicks the add icon on the top

  Scenario: Verify users can add the folder

    And user click "new folder"
    And user write a folder name
    When the user click submit icon
    Then Verify the "Manuela12" is displayed on the page


  Scenario: Verify users can upload a file inside a folder
    And user choose a folder from the page
    When the user uploads a file with the upload file option
    Then Verify that the file is displayed on the page