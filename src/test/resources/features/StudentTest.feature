@4
Feature: student endpoint
  As a user
  I want to be able to manipulate with student endpoint
  so that I can use it

  @4-1
  Scenario Outline: Create new student
    When Create student with <name> <age> <sex> <risk> and check <StatusCode>
    Examples:
      | name       | age | sex   | risk | StatusCode |
      |"FirstName" | 15  | true  |   2  |     201    |
      |"SecondName"| 25  | false |   5  |     201    |
      |"ThirdName" | 50  | true  |   9  |     400    |
      |"FourthName"| -10 | true  |   2  |     400    |

  @4-2
  Scenario Outline: Get student by id
    When I Get student by <id> with <StatusCode>
    Examples:
      | id | StatusCode |
      |  0 |      200   |
      |  1 |      200   |
      | 14 |      404   |

  @4-3
  Scenario: Get all students
    And I Get all students

  @4-4
  Scenario Outline: Delete student
    When I Delete student by <id> with <response code>
    Examples:
      | id | response code |
      |  2 | 200           |
      | 15 | 404           |
