Feature: Login
  As a user
  I want to login
  So that i can access homepage

  @test1
  Scenario: Login with valid credential
    Given I am on homepage to login
    When I click button to login
    And I enter following credentials:
      | Username       | Password     |
      | testing1       | apaapa123    |
    Then I success to login and close app

  @test2
  Scenario: Login with invalid credential
    Given I am on the homepage to login
    When I click the button to login
    And I enter the following credentials:
      | Username       | Password     |
      | ini salahh     | apaapa12    |
      |                | apaapa123    |
      |testing1        |              |
    Then I fail to login and close app
