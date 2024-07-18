@DeleteCounselor
Feature: DELETE - Delete Counselor
  As a admin
  I want to delete counselor data
  So that I can delete counselor data

  @DeleteCounselorValidEndpoint
  Scenario: Delete Counselor With Valid Endpoint
    Given I set delete counselor valid endpoint
    When I send delete HTTP request with valid endpoint
    Then I received valid Delete HTTP response code

  @DeleteCounselorInvalidId
  Scenario: Delete Counselor with id
    Given I set delete counselor with endpoint and invalid id
    When I send delete HTTP request with endpoint and invalid id
    Then I received delete HTTP response code 400

  @DeleteCounselorInvalidEndpoint
  Scenario: Delete Counselor With Invalid Endpoint
    Given I set delete counselor invalid endpoint
    When I send delete HTTP request with invalid endpoint
    Then I received delete HTTP response code 404

  @DeleteCounselorWithoutToken
  Scenario: Delete Counselor Without Token
    Given I set DELETE counselor with valid endpoint
    When I send DELETE HTTP request without Token
    Then I received DELETE HTTP response code 401