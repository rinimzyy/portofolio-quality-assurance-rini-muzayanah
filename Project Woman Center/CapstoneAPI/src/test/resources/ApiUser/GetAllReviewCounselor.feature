@GetAllReviewCounselor
Feature: GET - All Review Counselor
  As a user
  I want to see review counselor
  So that I can see all review counselor

  @GetAllReviewCounselorValidEndpoint
  Scenario: Get All Review Counselor Valid Endpoint
    Given I set GET all review counselor valid endpoint
    When I send GET all review HTTP request with valid endpoint
    Then I received GET all review HTTP response code 200

  @GetAllReviewCounselorInvalidEndpoint
  Scenario: Get All Review Counselor Invalid Endpoint
    Given I set GET all review counselor invalid endpoint
    When I send GET all review HTTP request with invalid endpoint
    Then I received GET all review HTTP response code 404

  @GetAllReviewCounselorInvalidId
  Scenario: Get All Review Counselor Invalid Id
    Given I set GET all review counselor invalid Id
    When I send GET all review HTTP request with invalid Id
    Then I received GET all review HTTP response code 400

  @GetAllReviewCounselorWithoutToken
  Scenario: Get All Review Counselor Without Token
    Given I set GET all review counselor valid endpoint and without token
    When I send GET all review HTTP request with valid endpoint and without token
    Then I received GET all review HTTP response code 401