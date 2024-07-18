@DeleteArticleComment
Feature: DELETE - Delete Article Comment
  As a admin
  I want to delete article comment
  So that I can delete article comment

  @DeleteArticleCommentValidEndpoint
  Scenario: Delete Article Comment With Valid Endpoint
    Given I set delete article comment Valid endpoint
    When I send delete article comment HTTP request with Valid endpoint
    Then I received delete article comment HTTP response code

  @DeleteArticleCommentInvalidEndpoint
  Scenario: Delete Article Comment With Invalid Endpoint
    Given I set delete article comment invalid endpoint
    When I send delete article comment HTTP request with invalid endpoint
    Then I received delete article comment HTTP response code 404

  @DeleteArticleCommentInvalidIdArticle
  Scenario: Delete Article Comment With Invalid Id Article
    Given I set delete article comment invalid id article
    When I send delete article comment HTTP request with invalid id article
    Then I received delete article comment invalid id HTTP response code 404

  @DeleteArticleCommentWithoutToken
  Scenario: Delete Article Comment Without Token
    Given I set delete article comment without token
    When I send delete article comment HTTP request without token
    Then I received delete article comment HTTP response code 401