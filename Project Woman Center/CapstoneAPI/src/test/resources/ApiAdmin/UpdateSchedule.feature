@UpdateSchedule
Feature: PUT - Update Schedule
  As a admin
  I want to update schedule
  So that I can update schedule

  @UpdateScheduleValidEndpoint
  Scenario: Update Schedule With Valid Endpoint
    Given I set PUT update schedule valid endpoint
    When I send PUT HTTP request for update schedule with valid endpoint
    Then I received PUT HTTP response code 200

  @UpdateScheduleInvalidEndpoint
  Scenario: Update Schedule With invalid Endpoint
    Given I set PUT update schedule invalid endpoint
    When I send PUT HTTP request for update schedule with invalid endpoint
    Then I received PUT HTTP response code 404

  @UpdateScheduleWithoutToken
  Scenario: Update Schedule Without Token
    Given I set PUT update schedule with endpoint
    When I send PUT HTTP request for update schedule without token
    Then I received HTTP response code 401

  @UpdateScheduleWithoutId
  Scenario: Update Schedule Invalid Id
    Given I set PUT update schedule data valid endpoint
    When I send PUT HTTP request invalid id
    Then I received Put HTTP response code 400