@googlesearch @first
Feature: Google search

  Background: User is on the google page
    Given user is in the google page

  @iphone
  Scenario: user searches iphone in google
    And user searches iphone
    Then verify result has iphone

  @nokia
  Scenario: user searches nokia in google
    And user searches nokia
    Then verify result has nokia

    #Scenario :kullanici google da iphone arar
      #Given  :kullanici google sayfasinda
      #And    :kullanici iphone arattirir
      #Then   :sonucta iphone oldugunu dogrula