Feature: Testing with multiple data
  @multiple
  Scenario: Testing data
    Given User goes to amazon
    And User verifies following search departments
      |Alexa Skills|
      |Computers   |
      |Courses     |
      |Electronics |
      |Baby        |
    Then User closes the amazon