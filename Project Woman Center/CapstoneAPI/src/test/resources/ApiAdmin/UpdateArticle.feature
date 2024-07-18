@UpdateArticle
Feature: PUT - Update Article
  As a admin
  I want to update article
  So that I can update article

  @UpdateArticleValidEndpoint
  Scenario: Update Article With Valid Endpoint
    Given I set PUT update article valid endpoint
    When I send PUT HTTP request for update article with valid endpoint
    Then I received PUT update article HTTP response code 200

  @UpdateArticleInvalidEndpoint
  Scenario: Update Article With Invalid Endpoint
    Given I set PUT update article invalid endpoint
    When I send PUT HTTP request for update article with invalid endpoint
    Then I received PUT update article HTTP response code 404

  @UpdateArticleInvalidId
  Scenario: Update Article With Invalid Id
    Given I set PUT update article valid endpoint and invalid id
    When I send PUT HTTP request for update article with invalid id
    Then I received PUT update article HTTP response code 400

  @UpdateArticleWithoutToken
  Scenario: Update Article Without Token
    Given I set PUT update article valid endpoint and without token
    When I send PUT HTTP request for update article without token
    Then I received PUT update article HTTP response code 401