@DeleteSchedule
Feature: Delete - Delete Schedule
  As a admin
  I want to delete schedule
  So that I can delete schedule

  @DeleteScheduleValidEndpoint
  Scenario: Delete Schedule With Valid Endpoint
    Given I set delete schedule valid endpoint
    When I send delete schedule HTTP request with valid endpoint
    Then I received valid Delete schedule HTTP response code 200

  @DeleteScheduleInvalidEndpoint
  Scenario: Delete Schedule With invalid Endpoint
    Given I set delete schedule invalid endpoint
    When I send delete HTTP request for update schedule with invalid endpoint
    Then I received delete schedule HTTP response code 404

  @DeleteScheduleInvalidId
  Scenario: Delete Schedule Invalid Id
    Given I set delete schedule with endpoint and invalid id
    When I send delete HTTP request with invalid id
    Then I received response code 400

  @DeleteScheduleWithoutToken
  Scenario: Delete Schedule Without Token
    Given I set delete schedule with endpoint
    When I send delete HTTP request without token
    Then I received response code 401
