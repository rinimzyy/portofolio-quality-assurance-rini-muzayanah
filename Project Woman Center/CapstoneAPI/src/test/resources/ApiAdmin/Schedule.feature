@Schedule
Feature: Schedule
  As an admin
  I want to see counselor schedule
  So that I can create and update schedule

  @SuccessGetSchedule
  Scenario: Get - As admin I have be able to get counselor schedule
    Given I set get counselor schedule endpoint
    When I send Request with method GET
    Then I success get counselor schedule

  @FailedGetScheduleWithInvalidToken
  Scenario: Get - As admin I failed to get counselor schedule with invalid token
    Given I set get counselor schedule endpoint
    When I send Request with method GET with invalid token
    Then I failed get counselor schedule and response code 401

  @FailedGetScheduleWithInvalidId
  Scenario: Get - As admin I failed to get counselor schedule with invalid id
    Given I set get counselor schedule endpoint
    When I send Request with method GET with invalid id
    Then I failed get counselor schedule and response code 400

  @FailedGetScheduleWithInvalidEndpoint
  Scenario: Get - As admin I failed to get counselor schedule with invalid endpoint
    Given I set invalid get counselor schedule endpoint
    When I send Request with method GET with invalid endpoint
    Then I failed get counselor schedule and response code 404

  @SuccessPostSchedule
  Scenario: Post - As admin I have be able to create counselor schedule
    Given I set post counselor schedule endpoint
    When I send POST HTTP Request
    Then I success post counselor schedule

  @FailedPostScheduleInvalidToken
  Scenario: Post - As admin I failed to create counselor schedule with invalid token
    Given I set post counselor schedule endpoint
    When I send POST HTTP Request with invalid token
    Then I failed post counselor schedule and response code 401

  @FailedPostScheduleInvalidId
  Scenario: Post - As admin I failed to create counselor schedule with invalid id
    Given I set post counselor schedule endpoint
    When I send POST HTTP Request with invalid id
    Then I failed post counselor schedule and response code 400

  @FailedPostScheduleInvalidBodyParameter
  Scenario: Post - As admin I failed to create counselor schedule with invalid body parameter
    Given I set post counselor schedule endpoint
    When I send POST HTTP Request with invalid body parameter
    Then I failed post counselor schedule and response code 400

  @FailedPostScheduleEmptyDates
  Scenario: Post - As admin I failed to create counselor schedule with empty dates
    Given I set post counselor schedule endpoint
    When I send POST HTTP Request with empty dates
    Then I failed post counselor schedule and response code 400

  @FailedPostScheduleEmptyBody
  Scenario: Post - As admin I failed to create counselor schedule with empty body
    Given I set post counselor schedule endpoint
    When I send POST HTTP Request with empty body
    Then I failed post counselor schedule and response code 400