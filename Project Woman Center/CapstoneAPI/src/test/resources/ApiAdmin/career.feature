Feature: Admin Career

  Scenario: View All Career
    Given I set career endpoint URL
    When I send a get career request with valid auth
    Then I successfully view all career

  Scenario: View All Career With Wrong Method
    Given I set career endpoint
    When I send a get career request with wrong method
    Then I fail to view all career and receive status code 404

  Scenario: View All Career With Wrong Endpoint
    Given I set career wrong endpoint
    When I send a get career request with wrong endpoint
    Then I receive status code 404

  Scenario: View All Career With Wrong Token
    Given I set career valid endpoint
    When I send a get career request with wrong token
    Then I receive status code 401

  @careerSearch
  Scenario Outline: Admin search career based on search input
    Given I set search career based on "<search>" input endpoint
    When I send search career "<search>" input request
    And I receive status code 200
    Examples:
      | search    |
      | quality   |
      | Alta      |
      | Semarang  |
      | abc       |

    Scenario Outline: Admin delete career
      Given I set delete career endpoint with "<uuid>"
      When I send DELETE admin career request
      Then I receive career delete status code "<code>"
      Examples:
        | uuid                                  | code  |
        | 15313b93-0d96-11ee-8368-0242c0a81003  | 200   |
        | 15313b93-0d96-11ee-8368-0242c0a81003  | 400   |
        | 15313b93-0d96-11ee-8368-0242c0a8100   | 400   |

  @GetCareerByID
  Scenario: Get admin career by ID with valid endpoint
    Given I set GET career valid endpoint by ID
    When I send HTTP GET career to request with valid endpoint
    Then I receive a HTTP career response code 200 OK

  @GetCareerInvalidID
  Scenario: Get admin career invalid ID with valid endpoint
    Given I set GET career valid endpoint with invalid ID
    When I send HTTP GET career to request with invalid ID
    Then I receive a HTTP career response code 400 Not Found

  @GetCareerByIDInvalidToken
  Scenario: Get admin career by ID with invalid token
    Given I set GET career by ID invalid token
    When I send HTTP GET career to request with invalid token
    Then I receive a HTTP career response code 401 Invalid Token

  @UpdateCareer
  Scenario: Update career information
    Given I set PUT career valid endpoint
    When I send HTTP PUT career to request with valid endpoint
    Then I received HTTP career response code 200 OK

  @UpdateCareerInvalidEndpoint
  Scenario: Update career information with invalid endpoint
    Given I set PUT career invalid endpoint
    When I send HTTP PUT career to request with invalid endpoint
    Then I received HTTP career response code 404 Not Found

  @UpdateCareerInvalidID
  Scenario: Update career information with invalid ID
    Given I set PUT career valid endpoint with invalid ID
    When I send HTTP PUT career to request with invalid ID
    Then I received HTTP career response code 400 Bad Request

  @UpdateCareerInvalidToken
  Scenario: Update career information with invalid token
    Given I set PUT career valid endpoint with invalid token
    When I send HTTP PUT career to request with invalid token
    Then I received HTTP career response code 401 Invalid Token