@Forum
Feature: Forum
  As an user
  I want to create forum
  So that I can update forum

  @SuccessCreateForum
  Scenario: As user I have be able to create forum
    Given I set create forum endpoint
    When I send POST create forum Request
    Then I success create forum and response code 200

  @FailCreateForumEmptyCategoryId
  Scenario: As user I failed to create forum with empty category id
    Given I set create forum endpoint
    When I send POST create forum Request with empty category id
    Then I fail create forum and message category is required

  @FailCreateForumEmptyLink
  Scenario: As user I failed to create forum with empty link
    Given I set create forum endpoint
    When I send POST create forum Request with empty link
    Then I fail create forum and message link is required

  @FailCreateForumEmptyTopic
  Scenario: As user I failed to create forum with empty topic
    Given I set create forum endpoint
    When I send POST create forum Request with empty topic
    Then I fail create forum and message topic are required

  @FailCreateForumInvToken
  Scenario: As user I failed to create forum with invalid token
    Given I set create forum endpoint
    When I send POST crete forum Request with invalid token
    Then I fail create forum and message invalid token

  @SuccessGetAllForum
  Scenario: As user I have be able to get all forum
    Given I set get all forum endpoint
    When I send GET all forum Request
    Then I success get all forum and response code 200

  @FailGetAllForumInvToken
  Scenario: As user I failed to get all forum with invalid token
    Given I set get all forum endpoint
    When I send GET all forum Request with invalid token
    Then I fail get all forum and message invalid token