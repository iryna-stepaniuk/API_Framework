@1
Feature: Appointment endpoint
  As a user
  I want to be able to manipulate with appointment endpoint
  so that I can use it

  @1-1
  Scenario Outline: Create new appointment
    When Create appointment with <debtId> and check <StatusCode>
    Examples:
      | debtId | StatusCode|
      |    0   | 200       |
      |    1   | 200       |
      |   500  | 404       |
      |   -5   | 400       |

  @1-3
  Scenario Outline: Get appointment by id
    When I Get appointment by <id> with <StatusCode>
    Examples:
      | id | StatusCode |
      |  0 |      200   |
      |  1 |      200   |
      | 14 |      404   |

  @1-4
  Scenario: Get all appointments
    And I Get all appointments

  @1-5
  Scenario Outline: Delete appointment
    When I Delete appointment by <id> with <response code>
    Examples:
    | id | response code |
    |  0 | 200           |
    | 15 | 404           |