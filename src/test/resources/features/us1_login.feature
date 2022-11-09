Feature: As a user, I should be able to log in.


  Scenario Outline: Verify login with valid credentials
    Given user on the login page
    When user enters username "<username>" and passcode "<password>" and clicks the login button
    Then verify the user should be at the dashboard page
    Examples:
      | username | password    |
      | user22   | Userpass123 |
      | user52   | Userpass123 |
      | user82   | Userpass123 |
      | user112  | Userpass123 |