@GetArticleById
Feature: GET - Article By Id
  As a user
  I want to see article by id
  So that I can see article by id

  @GetArticleByIdValidEndpoint
  Scenario: Get Article By Id Valid Endpoint
    Given I set GET article by id valid endpoint
    When I send GET article by id HTTP request with valid endpoint
    Then I received GET article by id HTTP response code 200

  @GetArticleByIdInvalidEndpoint
  Scenario: Get Article By Id Invalid Endpoint
    Given I set GET article by id invalid endpoint
    When I send GET article by id HTTP request with invalid endpoint
    Then I received GET article by id HTTP response code 404

  @GetArticleByIdInvalidId
  Scenario: Get Article By Id Invalid Id
    Given I set GET article by id invalid id
    When I send GET article by id HTTP request with invalid id
    Then I received GET article by id HTTP response code 400

  @GetArticleByIdWithoutToken
  Scenario: Get Article By Id Without Token
    Given I set GET article by id without token
    When I send GET article by id HTTP request without token
    Then I received GET article by id HTTP response code 401