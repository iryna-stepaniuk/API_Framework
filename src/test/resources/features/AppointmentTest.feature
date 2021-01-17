@1
  Feature: Create new appointment
    As a user
    I want to be able to create new appointment
    so that I can use it

    @1-1
    Scenario Outline: Create new appointment with all correct data
      Then Create appointment with <deptId>
      Examples:
      | deptId |
      |    0   |
      |    1   |
      |    2   |


    @1-2
    Scenario Outline: Create new appointment with invalid deptId
      Then Create appointment with <deptId>
      Examples:
        | deptId |
        |  500   |
        |  200   |
        |  -5    |