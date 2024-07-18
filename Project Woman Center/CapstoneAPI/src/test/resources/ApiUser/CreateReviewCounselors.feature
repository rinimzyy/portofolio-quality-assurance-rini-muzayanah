@CreateReviewCounselor
Feature: POST - Create Review Counselor
  As a user
  I want to create review counselor
  So that I can create review counselor

  @CreateReviewCounselorValidEndpoint
  Scenario: POST - Create Review Counselor Valid Endpoint
    Given I set POST create review counselor valid endpoint
    When I send POST create review counselor HTTP request with valid endpoint
    Then I received POST create review counselor HTTP response code

  @CreateReviewCounselorInvalidEndpoint
  Scenario: POST - Create Review Counselor Invalid Endpoint
    Given I set POST create review counselor invalid endpoint
    When I send POST create review counselor HTTP request with invalid endpoint
    Then I received POST create review counselor HTTP response code 404

  @CreateReviewCounselorInvalidId
  Scenario: POST - Create Review Counselor Invalid Id
    Given I set POST create review counselor invalid Id
    When I send POST create review counselor HTTP request with invalid id
    Then I received POST create review counselor HTTP response code 400

  @CreateReviewCounselorWithoutToken
  Scenario: POST - Create Review Counselor Without Token
    Given I set POST create review counselor valid endpoint and without token
    When I send POST create review counselor HTTP request with valid endpoint and without token
    Then I received POST create review counselor HTTP response code 401

  @CreateReviewCounselorDoesNotIncludeAnyConditions
  Scenario: POST - Create Review Counselor Does Not Include Any Conditions
    Given I set POST create review counselor Does Not Include Any Conditions
    When I send POST create review counselor HTTP request Does Not Include Any Conditions
    Then I received create review counselor HTTP response code 400