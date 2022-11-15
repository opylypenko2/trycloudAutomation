Feature: As a user, I should e able to log in.


  Scenario Outline: Verify user login fails with invalid credentials

    Given User is on the login page
    When User enters invalid "<username>" and "<password>" and clicks login button
    Then verify "<message>" should be displayed

    Examples:
      | username | password    | message                     |
      | User9    | Wrong       | Wrong username or password. |
      | Wrong    | Userpass123 | Wrong username or password. |
      | Wrong    | Wrong       | Wrong username or password. |
