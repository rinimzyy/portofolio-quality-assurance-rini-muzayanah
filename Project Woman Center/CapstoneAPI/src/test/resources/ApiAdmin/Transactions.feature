@Transactions
Feature: Transactions
  As an admin
  I want to see all transaction
  So that I can put link consultation

  @SuccessGetAllTransaction
  Scenario: As admin I have be able to get all transaction
    Given I set Get all transaction endpoint
    When I send GET all transaction Request
    Then I success get all transaction and response code 200

  @FailGetAllTransactionInvEnd
  Scenario: As admin I failed to get all transaction with invalid endpoint
    Given I set invalid Get all transaction endpoint
    When I send GET all transaction Request with invalid endpoint
    Then I fail get all transaction and response code 404

  @FailGetAllTransactionWithoutToken
  Scenario: As admin I failed to get all transaction without token
    Given I set Get all transaction endpoint
    When I send GET all transaction Request without token
    Then I fail get all transaction and response code 401

  @SuccessPutLink
  Scenario: As admin I have be able to put link
    Given I set PUT link endpoint
    When I send PUT link Request
    Then I success put link and response code 200

  @FailPutLinkInvTransactionId
  Scenario: As admin I failed to put link with invalid transaction id
    Given I set PUT link endpoint
    When I send PUT link Request with invalid transaction id
    Then I fail put link and response code 400

  @FailPutLinkWithLinkAlreadySent
  Scenario: As admin I failed to put link with link already sent
    Given I set PUT link endpoint
    When I send PUT link Request with link already sent
    Then I fail put link and response code 400

  @FailPutLinkWithoutToken
  Scenario: As admin I failed to put link without token
    Given I set PUT link endpoint
    When I send PUT link Request without token
    Then I fail put link and response code 401

  @SuccessPutCancel
  Scenario: As admin I have be able to put cancel
    Given I set PUT cancel endpoint
    When I send PUT cancel Request
    Then I success put cancel and response code 200

  @FailPutCancelInvalidTransactionId
  Scenario: As admin I failed to put link with invalid transaction id
    Given I set PUT cancel endpoint
    When I send PUT cancel Request with invalid transaction id
    Then I fail put cancel and response code 500

  @FailPutCancelWithoutToken
  Scenario: As admin I failed to put link without token
    Given I set PUT cancel endpoint
    When I send PUT cancel Request without token
    Then I fail put cancel and response code 401