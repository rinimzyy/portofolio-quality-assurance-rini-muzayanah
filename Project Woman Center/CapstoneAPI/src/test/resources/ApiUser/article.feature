@Article
Feature: Article
  As an user
  I want to see article
  So that I can create comment on article

  @SuccessGetArticle
  Scenario: As user I have be able to get article non login
    Given I set Get articles non login endpoint
    When I send GET articles Request
    Then I success get articles and response code 200

  @FailedGetArticle
  Scenario: As user I have failed to get article non login with invalid endpoint
    Given I set invalid Get articles non login endpoint
    When I send GET articles Request with invalid endpoint
    Then I failed get articles and response code 404

  @SuccessCreateComment
  Scenario: As user I have be able to create comment
    Given I set create comment endpoint
    When I send POST comment Request
    Then I success create comment and response code 200

  @FailedCreateCommentWithInvalidId
  Scenario: As user I failed to create comment with invalid id
    Given I set create comment endpoint
    When I send POST comment Request with invalid id
    Then I failed create comment and message article not found

  @FailedCreateCommentWithoutBody
  Scenario: As user I failed to create comment with invalid body parameter
    Given I set create comment endpoint
    When I send POST comment Request without body value
    Then I failed create comment and message all field are required

  @FailedCreateCommentWithoutToken
  Scenario: As user I failed to create comment without token
    Given I set create comment endpoint
    When I send POST comment Request without token
    Then I failed create comment and message invalid token

  @SuccessGetAllComment
  Scenario: As user I have be able to get all comment
    Given I set Get all comment endpoint
    When I send GET all comment Request
    Then I success get all comment and response code 200

  @FailedGetAllCommentInvalidArticleId
  Scenario: As user I failed to get all comment with invalid article id
    Given I set Get all comment endpoint
    When I send GET all comment Request with invalid article id
    Then I failed get all comment and response code 404

  @FailedGetAllCommentWithoutToken
  Scenario: As user I failed to get all comment without token
    Given I set Get all comment endpoint
    When I send GET all comment Request without token
    Then I failed get all comment and response code 401

  @SuccessDeleteComment
  Scenario: As user I have be able to delete comment
    Given I set delete comment endpoint
    When I send DELETE comment Request
    Then I success delete comment and response code 200

  @FailDeleteCommentInvalidArticleId
  Scenario: As user I failed to delete comment with invalid article id
    Given I set delete comment endpoint
    When I send DELETE comment Request with invalid article id
    Then I fail delete comment and response code 404

  @FailDeleteCommentInvalidCommentId
  Scenario: As user I failed to delete comment with invalid comment id
    Given I set delete comment endpoint
    When I send DELETE comment Request with invalid comment id
    Then I fail delete comment and response code 404

  @FailDeleteCommentWithoutToken
  Scenario: As user I failed to delete comment without token
    Given I set delete comment endpoint
    When I send DELETE comment Request without token
    Then I fail delete comment and response code 401
