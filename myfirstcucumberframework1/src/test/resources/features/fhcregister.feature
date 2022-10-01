@fhcregister
Feature: FhcTrip Registration
  Scenario: fhcTrip registration test
    Given kullanici fhctrip sayfasindadir
    And kullanici "create a new account " butonuna tiklar
    And kullanici username girer
    And kullanici password girer
    And kullanici email girer
    And kullanici fullname girer
    And kullanici phone girer
    And kullanici SSN girer
    And kullanici Driver lisans girer
    And kullanici country dropdown secer
    And kullanici state dropdown secer
    And kullanici address girer
    And kullanici working sector girer
    And kullanici bithday girer
    And kullanici save butonuna tiklar
    Then kullanci success mesajini gorur
