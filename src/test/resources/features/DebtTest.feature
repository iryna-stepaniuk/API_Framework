@3
Feature: Debt endpoint
  As a user
  I want to be able to manipulate with debt endpoint
  so that I can use it

  @3-1
  Scenario Outline: Create new debt
    When I create new debt with <studentId> <amount> <monthlyPercent> and check <StatusCode>
    Examples:
    | studentId | amount     |   monthlyPercent | StatusCode |
    |      3    |   200.234  |        5         | 200        |
    |      4    |   100.100  |        2         | 200        |

  @3-2
  Scenario Outline: Get debt by id
    When I Get debt by <id> with <StatusCode>
    Examples:
      | id | StatusCode |
      |  0 |      200   |
      |  1 |      200   |
      | 14 |      404   |

  @3-3
  Scenario: Get all debts
    And I Get all debts

  @3-4
  Scenario Outline: Delete debt
    When I Delete debt by <id> with <response code>
    Examples:
      | id | response code |
      |  2 | 200           |
      | 15 | 404           |