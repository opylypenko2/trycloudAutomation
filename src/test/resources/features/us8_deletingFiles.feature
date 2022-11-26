Feature: As a user, I should be able to delete a file/folder.

  @wip
  Scenario: Verify users delete a file/folder
    Given user on the dashboard page
    When the user clicks the Files module
    And user clicks action-icon from any file on the page
    And user chooses the Delete file option
    When user clicks the Deleted files sub-module on the left side
    Then Verify the "IMG_3104.HEIC" is displayed on the page