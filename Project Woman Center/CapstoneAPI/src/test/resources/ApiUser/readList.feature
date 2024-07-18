Feature: Reading List

  Scenario Outline: Create reading list
    Given I set reading list endpoint server
    When I send reading list POST request with "<name>" and "<description>"
    Then I success create reading list and receive response 200
    Examples:
      | name               | description      |
      |test                | ini test         |

  Scenario Outline: Create reading list invalid endpoint
    Given I set create reading list endpoint server
    When I send reading list POST request with "<name>" and "<description>" with invalid endpoint
    Then I fail create reading list and receive response 404
    Examples:
      | name               | description      |
      |test                | ini test         |

  Scenario Outline: Create reading list invalid token
    Given I set reading list endpoint
    When I send reading list POST request with "<name>" and "<description>" with invalid token
    Then I fail create reading list and receive response 401
    Examples:
      | name               | description      |
      |test                | ini test         |

  Scenario Outline: Create reading list empty data
    Given I set reading list endpoint url server
    When I send reading list POST request with "<name>" and "<description>" with empty field
    Then I fail create reading list and receive response 400
    Examples:
      | name               | description      |
      |test                |                  |
      |                    |coba              |
      |                    |                  |

  Scenario: Get all reading list user
    Given I set reading list endpoints
    When I send reading list GET request
    Then I success get user reading list

  Scenario: Get all reading list user invalid token
    Given I set reading list endpoints url
    When I send reading list GET request with invalid token
    Then I fail get user reading list 401

  Scenario Outline: Add article to reading list
    Given I set reading list endpoints server
    When I send add to reading list POST request with "<article_id>" and "<reading_list_id>"
    Then I receive valid response add article
    Examples:
      | article_id                                         | reading_list_id                        |
      |4d5d5a00-0dda-11ee-8b27-0242c0a86003                | 12aa888d-2560-4bb3-9598-932112f2745b   |
      |                                                    |                                        |

  Scenario Outline: Add article to reading list invalid token
    Given I set reading list endpoints server url
    When I send add to reading list POST request with "<article_id>" and "<reading_list_id>" with invalid token
    Then I receive valid response add article 401
    Examples:
      | article_id                                         | reading_list_id                        |
      |4d5d5a00-0dda-11ee-8b27-0242c0a86003                | 7083b3e8-0840-11ee-9db9-089798ecad5e   |

  @test1
  Scenario Outline: Add article to reading list empty fields
    Given I set reading list endpoint server url
    When I send add to reading list POST request with "<article_id>" and "<reading_list_id>" with empty data
    Then I receive valid response add article 400
    Examples:
      | article_id                                         | reading_list_id                        |
      |                                                    |                                        |
      |4d5d5a00-0dda-11ee-8b27-0242c0a86003                |                                        |
      |                                                    | 7083b3e8-0840-11ee-9db9-089798ecad5e   |

  @GetReadingListByID
  Scenario: Get reading list data by ID
    Given I set GET reading list by ID with valid endpoint
    When I send HTTP GET reading list request with valid endpoint
    Then I receive a valid HTTP reading list response code 200 OK

  @GetReadingListByIDInvalidEndpoint
  Scenario: Get reading list data by ID with invalid endpoint
    Given I set GET reading list by ID with invalid endpoint
    When I send HTTP GET reading list request with invalid endpoint
    Then I receive a valid HTTP reading list response code 404 Not Found

  @GetReadingListWithInvalidID
  Scenario: Get reading list data with invalid ID
    Given I set GET reading list invalid ID with valid endpoint
    When I send HTTP GET reading list request with invalid ID
    Then I receive a valid HTTP reading list response code 400

  @GetReadingListWithInvalidToken
  Scenario: Get reading list data by ID with invalid token
    Given I set GET reading list by ID with valid endpoint but invalid token
    When I send HTTP GET reading list request with invalid token
    Then I receive a valid HTTP reading list response code 401 Invalid Token

  @UpdateReadingList
  Scenario: Update reading list data with valid endpoint
    Given I set PUT reading list with valid endpoint
    When I send HTTP PUT reading list request with valid endpoint
    Then I receive a valid HTTP update reading list response code 200 OK

  @UpdateReadingListInvalidEndpoint
  Scenario: Update reading list data with invalid endpoint
    Given I set PUT reading list with invalid endpoint
    When I send HTTP PUT reading list request with invalid endpoint
    Then I receive a valid HTTP update reading list response code 404

  @UpdateReadingListInvalidID
  Scenario: Update reading list data with invalid ID
    Given I set PUT reading list with invalid ID
    When I send HTTP PUT reading list request with invalid ID
    Then I receive a valid HTTP update reading list response code 400

  @UpdateReadingListInvalidToken
  Scenario: Update reading list data with invalid token
    Given I set PUT reading list with invalid token
    When I send HTTP PUT reading list request with invalid token
    Then I receive a valid HTTP update reading list response code 401

  @DeleteReadingList
  Scenario: Delete reading list with valid endpoint
    Given I set DELETE reading list with valid endpoint
    When I send HTTP DELETE reading list request with valid endpoint
    Then I receive a valid HTTP delete reading list response code 200 OK

  @DeleteReadingListInvalidEndpoint
  Scenario: Delete reading list with invalid endpoint
    Given I set DELETE reading list with invalid endpoint
    When I send HTTP DELETE reading list request with invalid endpoint
    Then I receive a valid HTTP delete reading list response code 404

  @DeleteReadingListInvalidID
  Scenario: Delete reading list with invalid ID
    Given I set DELETE reading list with invalid ID
    When I send HTTP DELETE reading list request with invalid ID
    Then I receive a valid HTTP delete reading list response code 400

  @DeleteReadingListInvalidToken
  Scenario: Delete reading list with invalid token
    Given I set DELETE reading list with invalid token
    When I send HTTP DELETE reading list request with invalid token
    Then I receive a valid HTTP delete reading list response code 401
