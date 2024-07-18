Feature: Admin Get User

  Scenario: View All User
    Given I set get user endpoint
    When I send a get user request with valid token
    Then I successfully view all user

  Scenario: View All User with filter
    Given I set get user endpoints
    When I send a get user request with filtered condition
    Then I successfully view filtered user

  Scenario: View All User Invalid Endpoint
    Given I set get user invalid endpoints
    When I send a get user request with invalid endpoint
    Then I fail view all user 404

  Scenario: View All User Invalid Token
    Given I set get user invalid token
    When I send a get user request with invalid token
    Then I fail view all user 401

  Scenario: View User Data By ID
    Given I set get user endpoint by ID
    When I send a get user request with valid ID
    Then I successfully view user data

  Scenario: View User Data By Invalid ID
    Given I set get user endpoint by invalid ID
    When I send a get user request with invalid ID
    Then I fail view user data 404

  Scenario: View User Data By Invalid Token
    Given I set get user endpoint by invalid token
    When I send a get user data request with invalid token
    Then I fail view user data 401

  Scenario: Delete User Data By Valid ID
    Given I set delete user endpoint by ID
    When I send a delete user request with valid ID
    Then I successfully delete user data

  Scenario: Delete User Data By Invalid ID
    Given I set delete user endpoint by invalid ID
    When I send a delete user request with invalid ID
    Then I fail delete user data 404