Feature: Admin - Counselor
  
  @GetAllCounselor
  Scenario: Get all admin counselor with valid endpoint
    Given I set GET all counselor with valid endpoint
    When I send HTTP GET request with valid endpoint
    Then I receive a valid HTTP response code 200 OK

  @GetAllCounselorByPage
  Scenario: Get all admin counselor with valid endpoint by page
    Given I set GET all counselor with valid endpoint by page
    When I send HTTP GET request with valid endpoint by page
    Then I receive a valid HTTP by page response code 200 OK

  @GetAllCounselorByLimit
  Scenario: Get all admin counselor with valid endpoint by limit
    Given I set GET all counselor with valid endpoint by limit
    When I send HTTP GET request with valid endpoint by limit
    Then I receive a valid HTTP by limit response code 200 OK

  @GetAllCounselorBySearch
  Scenario: Get all admin counselor with valid endpoint by search
    Given I set GET all counselor with valid endpoint by search
    When I send HTTP GET request with valid endpoint by search
    Then I receive a valid HTTP by search response code 200 OK

  @GetAllCounselorBasedSortBy
  Scenario: Get all admin counselor with valid endpoint based sort by
    Given I set GET all counselor with valid endpoint based sort by
    When I send HTTP GET request with valid endpoint based sort by
    Then I receive a valid HTTP based sort by response code 200 OK

  @GetAllCounselorByHasSchedule
  Scenario: Get all admin counselor with valid endpoint by has schedule
    Given I set GET all counselor with valid endpoint by has schedule
    When I send HTTP GET request with valid endpoint by has schedule
    Then I receive a valid HTTP by has schedule response code 200 OK

  @GetAllCounselorWithInvalidEndpoint
  Scenario: Get all admin counselor with invalid endpoint
    Given I set GET all counselor with invalid endpoint
    When I send HTTP GET request with invalid endpoint
    Then I received HTTP response code 404 Not Found

  @GetCounselorByIDWithValidEndpoint
  Scenario: Get admin counselor by ID with valid endpoint
    Given I set GET valid endpoint by ID
    When I send HTTP GET to the request with valid endpoint
    Then I receive a HTTP response code 200 OK

  @GetCounselorByIDWithInvalidID
  Scenario: Get admin counselor invalid ID with valid endpoint
    Given I set GET counselor valid endpoint with invalid ID
    When I send HTTP GET counselor to request with invalid ID
    Then I receive HTTP response code is 404 Not Found

  @GetCounselorWithEmptyID
  Scenario: Get admin counselor with empty ID
    Given I set GET valid endpoint with empty ID
    When I send HTTP GET to request with valid endpoint with empty ID
    Then I receive a HTTP response code 400 Bad Request
