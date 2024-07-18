Feature: Admin article
  Scenario: Admin able to read all articles
    Given I set admin get all articles endpoint
    When I send GET admin get all articles request
    Then I receive status code 200

  Scenario Outline: Admin able to read all articles with query param
    Given I set admin get all articles endpoint with query "<param>"
    When I send GET admin get all articles with query param request
    Then I receive status code 200
  Examples:
    | param             |
    | sort_by=newest    |
    | search=author     |
    | search=xyz123     |

  Scenario: Admin able to create new article
    Given I set admin create article endpoint
    When I send POST admin create article request
      | title       | QE testing automation       |
      | author      | becco                       |
      | description | testing                     |
      | topic       | 2                           |
      | image       | ./image/admin-article-2.png |
    Then I receive status code 200


  Scenario Outline: Admin able to delete article
    Given I set admin delete article endpoint with "<uuid>"
    When I send DELETE admin article request
    Then I receive admin article status code response "<code>"
    Examples:
      | uuid                                 | code |
      | 24dd5102-0c26-11ee-9bfb-0242ac1c0003 | 200  |
      | 24dd5102-0c26-11ee-9bfb-0242ac1c0001 | 400  |
      | 24dd5102-0c26-11ee-9bfb-0242ac1c000  | 400  |
