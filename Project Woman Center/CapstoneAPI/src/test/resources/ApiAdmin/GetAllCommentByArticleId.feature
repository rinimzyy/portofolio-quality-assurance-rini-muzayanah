@GetAllCommentByArticleId
Feature: GET - Get All Comment By Article Id
  As a admin
  I want to see comment by article id
  So that I can see comment

  @GetAllCommentByArticleByIdValidEndpoint
  Scenario: Get All Comment By Article Id Valid Endpoint
    Given I set GET all comment by article id valid endpoint
    When I send GET all comment by article id HTTP request with valid endpoint
    Then I received GET all comment by article id HTTP response code 200

  @GetAllCommentByArticleByIdInvalidEndpoint
  Scenario: Get All Comment By Article Id Invalid Endpoint
    Given I set GET all comment by article id invalid endpoint
    When I send GET all comment by article id HTTP request with invalid endpoint
    Then I received GET all comment by article id HTTP response code 404

  @GetAllCommentByArticleByIdInvalidId
  Scenario: Get All Comment By Article Id Invalid Article Id
    Given I set GET all comment by article id invalid article id
    When I send GET all comment by article id HTTP request with invalid article id
    Then I received GET all comment by article id invalid id HTTP response code 404

  @GetAllCommentByArticleByIdWithoutToken
  Scenario: Get All Comment By Article Id Without Token
    Given I set GET all comment by article id without token
    When I send GET all comment by article id HTTP request without token
    Then I received GET all comment by article id HTTP response code 401