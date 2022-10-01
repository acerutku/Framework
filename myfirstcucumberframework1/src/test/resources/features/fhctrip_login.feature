@fhclogin @smoketest
Feature: Login  feature
    Scenario: TC01_user logins with valid credentials
      Given user is on the fhctriplogin page
      And user enters valid username
      And user enters valid password
      And user clicks login button
      Then verify login is successfull