Feature: Admin Get All Topics

  Scenario: View All Topics
    Given I set topic endpoint URL
    When I send a get topic request with valid token
    Then I successfully view all topic

  Scenario: View All Topics With Wrong Method
    Given I set topic endpoint
    When I send a get topic request with wrong method
    Then I fail to view all topics and receive status code 405

  Scenario: View All Topics With Wrong Endpoint
    Given I set topic endpoints url
    When I send a get topic request with wrong endpoint
    Then I fail to view all topics and receive status code 404

