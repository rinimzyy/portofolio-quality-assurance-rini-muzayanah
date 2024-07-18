@UpdateCounselorData
Feature: PUT - Update Counselor Data
  As a admin
  I want to update counselor data
  So that I can update counselor data

  @PutUpdateCounselorDataEndpoint
  Scenario: Put Update Counselor Data With Valid Endpoint
    Given I set PUT update counselor data valid endpoint
    When I send PUT HTTP request with valid endpoint
    Then I received valid PUT HTTP response code 200

  @PutUpdateCounselorInvalidId
  Scenario: Put Update Counselor Data With Invalid Id
    Given I set PUT update counselor data with endpoint and invalid id
    When I send PUT HTTP request with endpoint and invalid id
    Then I received HTTP response code 400

  @PutUpdateCounselorInvalidEndpoint
  Scenario: Put Update Counselor Data With Invalid Endpoint
    Given I set PUT update counselor data invalid endpoint
    When I send PUT HTTP request with invalid endpoint
    Then I received HTTP response code 404

  @PutUpdateCounselorWithoutToken
  Scenario: Put Update Counselor Data Without Token
    Given I set PUT update counselor data with endpoint
    When I send PUT HTTP request without token
    Then I received PUT HTTP response code 401