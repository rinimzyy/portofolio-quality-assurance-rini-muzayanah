Feature: Register
  Scenario Outline: User verify credential
    Given I set POST user verify credential endpoint
    When I send POST user verify credential request with "<email>" and "<username>"
    Then I receive verify credential status code "<code>"
    Examples:
      | email                   | username        | code  |
      | vokot@onlcool.com       | vokot123456     | 200   |
      | vokot@onlcool.com       | vokot123        | 400   |
      | vokot15169@onlcool.com  | vokot1234       | 400   |
      | vokot15169@onlcool.com  | vokot123        | 400   |