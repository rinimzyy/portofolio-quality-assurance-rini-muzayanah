Feature: Login

  Scenario: TC001 - Successfully login by entering valid email and password
    Given I am on the login page
    When I enter valid email and password
      | Email                          | Password       |
      | qa.rakamin.jubelio@gmail.com   | Jubelio123!    |
    And I click login button
    Then I successfully login

  Scenario: Login with invalid credential
    Given I am on the homepage to login
    When I enter the following credentials and click button login
      | Email                          | Password       |
      | qa.rakamin.jubelio@gmail.co    | Jubelio123!    |
      | qa.rakamin.jubelio@gmail.com   | jubelio123!    |
    Then I fail to login