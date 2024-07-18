Feature: Logout

  @test1
  Scenario: User successfully logout
    Given I go to login page
    When I enter user credential and success login
      | Username       | Password     |
      | testing1       | apaapa123    |
    And I go to profile page
    And Click sign out
    And Click sure
    Then I successfully logout

    @test2
  Scenario: User cancel logout
    Given I open login page
    When I enter user credential and successfully login
      | Username       | Password     |
      | testing1       | apaapa123    |
    And I go to user profile page
    And Click sign out button
    And Click maybe later
    Then I cancel logout