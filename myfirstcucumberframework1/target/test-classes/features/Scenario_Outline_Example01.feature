@datatable01 @third
Feature: scenario outline example
  Scenario: testing the data tables web page
    Given User is on the datatables homepage
    When User clicks on new button
    And User enters first name "Defne"
    And User enters last name "CAKIR"
    And User enters position "SDET"
    And User enters office "London"
    And User enters extension "222"
    And User enters start date "2022-01-01"
    And User enters salary "100000"
    And User clicks Create button
    And User enters firs name "Defne" to the searchbox
    Then verify that user see the first name "Defne" in the searchbox
