Feature: Voucher

  @test1
  Scenario: Success get all voucher
    Given I set voucher endpoint
    When I send voucher GET http request with valid user token
    Then I successfully get all voucher

  @test2
  Scenario: Fail get all voucher invalid user token
    Given I set voucher endpoints
    When I send voucher GET http request with invalid user token
    Then I fail get all voucher 401

  @test3
  Scenario: Fail get all voucher invalid endpoint
    Given I set voucher invalid endpoints
    When I send voucher GET http request with invalid endpoints
    Then I fail get all voucher 404