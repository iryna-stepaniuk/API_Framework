@2
Feature: Collector endpoint
  As a user
  I want to be able to manipulate with collector endpoint
  so that I can use it

  @2-1
  Scenario Outline: Create new collector
    When I create new collector with <nickname> and <fear factor> and check <StatusCode>
    Examples:
      |      nickname    | fear factor  | StatusCode |
      |      "qwerty"    |    1         |      201   |
      |      "blabla"    |    5         |      201   |

  @2-2
  Scenario Outline: Get collector by id
    When I Get collector by <id> with <StatusCode>
    Examples:
      | id | StatusCode |
      |  0 |      200   |
      |  1 |      200   |
      | 14 |      404   |

  @2-3
  Scenario: Get all collectors
    And I Get all collectors

  @2-4
  Scenario Outline: Delete collector
    When I Delete collector by <id> with <response code>
    Examples:
      | id | response code |
      |  1 | 200           |
      | 15 | 404           |