Feature: Login

  Scenario Outline: Login with valid data
    Given I set login endpoint server
    When I send POST request with "<username>" and "<password>"
    Then I success login and receive response with a token
    Examples:
    | username           | password       |
    | admin              | admin          |

  Scenario Outline: Login with invalid data
    Given I set login endpoint
    When I send POST request "<username>" and "<password>"
    Then I fail login and receive response code 400
    Examples:
      | username        | password       |
      | admin           | admi           |
      |                 |                |

  Scenario Outline: Login with invalid method
    Given I set login endpoint with invalid method
    When I send GET http request "<username>" and "<password>"
    Then I fail login and receive response code 401
    Examples:
      | username        | password       |
      | admin           | admin          |
