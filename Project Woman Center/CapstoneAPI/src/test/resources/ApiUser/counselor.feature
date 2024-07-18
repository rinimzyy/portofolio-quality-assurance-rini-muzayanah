Feature: Counselor

  @test1
  Scenario: Get counselor by id
    Given I set counselor endpoint
    When I send counselor GET HTTP request with valid id
    Then I success get counselor data

  @test2
  Scenario: Get counselor by invalid id
    Given I set counselor endpoints
    When I send counselor GET HTTP request with invalid id
    Then I fail get counselor data

  @test3
  Scenario: Get counselor by invalid token
    Given I set counselor endpoints url
    When I send counselor GET HTTP request with invalid token
    Then I fail get counselor data 401

  Scenario Outline: User able to get counselor schedule
    Given I set user get counselor schedule endpoint with "<uuid>"
    When I send GET user get counselor schedule request
    Then I receive user get counselor schedule status code response "<code>"
    Examples:
      | uuid                                 | code |
      | 519e50f4-09cd-11ee-b8a9-0242ac140003 | 200  |
      | 519e50f4-09cd-11ee-b8a9-0242ac140002 | 404  |
      | 519e50f4-09cd-11ee-b8a9-0242ac14000  | 400  |