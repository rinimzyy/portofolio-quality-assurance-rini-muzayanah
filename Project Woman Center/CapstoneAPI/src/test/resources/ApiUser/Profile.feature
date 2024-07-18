@Profile
Feature: Profile
  As an user
  I want to see user profile
  So that I can update user profile

  @SuccessGetProfile
  Scenario: Get - As user I have be able to get user self data
    Given I set get user self data endpoint
    When I send GET HTTP Request
    Then I success get profile and response code 200

  @FailedGetProfileInvToken
  Scenario: Get - As user I failed to get user self data with invalid user token
    Given I set get user self data endpoint
    When I send GET HTTP Request with invalid user token
    Then I fail get profile response code 401

  @SuccessUpdateProfile
  Scenario: As user I have be able to update data profile
    Given I set PUT update data profile endpoint
    When I send PUT HTTP Request
    Then I success update profile and response code 200

  @FailUpdateProfileUsernameAlreadyRegistered
  Scenario: As user I failed to update data profile with username already registered
    Given I set PUT update data profile endpoint
    When I send PUT HTTP Request with username already registered
    Then I receive HTTP response code 409

  @FailUpdateProfileInvalidToken
  Scenario: As user I failed to update data profile with invalid token
    Given I set PUT update data profile endpoint
    When I send PUT HTTP Request with invalid token
    Then I fail update profile response code 401

  @SuccessUpdatePassword
  Scenario: As user I have be able to update password
    Given I set PUT update password endpoint
    When I send PUT update password HTTP Request
    Then I success update password response code 200

  @FailUpdatePasswordInvalidCurrentPassword
  Scenario: As user I failed to update password with invalid current password
    Given I set PUT update password endpoint
    When I send PUT update password HTTP Request with invalid current password
    Then I fail update password response code 400

  @FailUpdatePasswordInvalidToken
  Scenario: As user I failed to update password with invalid token
    Given I set PUT update password endpoint
    When I send PUT update password HTTP Request with invalid token
    Then I fail update password response code 401

  @FailUpdatePasswordCurrentPasswordEmptyValue
  Scenario: As user I failed to update password with current password empty value
    Given I set PUT update password endpoint
    When I send PUT update password HTTP Request with current password empty value
    Then I fail update password response code 500