@google
Feature: Google verification
  Background: User goes to google
    When User goes to google
  @google1
  Scenario: google search page title verification
    And User searches for "bags" on Google
    Then User needs to see "bags" in the title page
  @google2 @smoke
  Scenario: google results page verification
    And User searches for "clocks" on google
    Then user should get "clocks" in the title
    @google3
    Scenario: google results verification
      And User search for "books","cars", on google
      Then user
      #birden fazle aytim aranabilir max 5 if 5 den fazla ise arrylist olamali
      And User shoul see following items
      |car|
      |apple|
      |books|
      |pen  |
