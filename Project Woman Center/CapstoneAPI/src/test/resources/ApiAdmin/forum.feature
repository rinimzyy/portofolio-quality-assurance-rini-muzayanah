Feature: Admin Get All Forum

  Scenario: View All Forum
    Given I set forum endpoint URL
    When I send a get forum request with valid auth
    Then I successfully view all forum

  Scenario: View All Forum Invalid Endpoint
    Given I set forum invalid endpoint URL
    When I send a get forum request with invalid endpoint
    Then I fail view all forum 404

  Scenario: View All Forum Invalid Token
    Given I set forum endpoint
    When I send a get forum request with invalid token
    Then I fail view all forum 401

  Scenario: View Forum Detail By ID
    Given I set forum endpoint URL with ID
    When I send a get forum request with valid id
    Then I success view forum detail

  Scenario: View Forum Detail By Invalid ID
    Given I set forum endpoint URL with invalid ID
    When I send a get forum request with invalid id
    Then I fail view forum detail 400

  Scenario: View Forum Detail By Invalid Token
    Given I set forum endpoint URL with invalid token
    When I send a get forum by id request with invalid token
    Then I fail view forum detail 401

  Scenario: Delete By ID
    Given I set forum endpoint with valid ID
    When I send a delete forum request with valid id
    Then I success delete forum by id

  Scenario: Delete Invalid ID
    Given I set forum endpoint with invalid ID
    When I send a delete forum request with invalid id
    Then I fail delete forum by id 400

