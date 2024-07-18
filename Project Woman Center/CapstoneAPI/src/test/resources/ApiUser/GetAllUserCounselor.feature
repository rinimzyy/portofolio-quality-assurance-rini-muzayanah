@GetAllUserCounselor
Feature: GET - All User Counselor
  As a user
  I want to see list counselor
  So that i can see all counselor

  @GetAllUserCounselorValidEndpoint
  Scenario: Get All Counselor Valid Endpoint
    Given I set GET all user counselor valid endpoint
    When I send GET HTTP request with valid endpoint
    Then I received valid GET HTTP response code 200

  @GetAllUserCounselorInvalidEndpoint
  Scenario: Get All Counselor send invalid Endpoint
    Given I set GET all user counselor invalid endpoint
    When I send GET HTTP request with invalid endpoint
    Then I received GET HTTP response code 404
