Feature: User transaction
  Scenario Outline: User able to get transaction by id
    Given I set user get transaction endpoint with "<uuid>"
    When I send GET user get transaction request
    Then I receive user get transaction status code response "<code>"
    Examples:
      | uuid                                 | code |
      | 90657701-0e39-11ee-99a8-0242c0a89003 | 200  |
      | 90657701-0e39-11ee-99a8-0242c0a89005 | 400  |
      | 24dd5102-0c26-11ee-9bfb-0242ac1c000  | 400  |