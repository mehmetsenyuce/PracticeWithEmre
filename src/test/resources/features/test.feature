@smoke
Feature: Amazon verification
  #Comments goes using this sign
  @amazon1
  Scenario: Amazon title verification
    When User is on Amazon application
    Then User should see Amazon in title
    And User searches for something
