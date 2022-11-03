Feature: As a user, I should be able to log in.

  @wip
  Scenario Outline: Verify login with valid credentials
    Given user on the login page
    When user use username "<username>" and passcode "<password>"

    And user click the login button
    Then verify the user should be at the dashboard page
    Examples:
      | username | password    |
      | user7    | Userpass123 |
      | user34   | Userpass123 |
      | user99   | Userpass123 |