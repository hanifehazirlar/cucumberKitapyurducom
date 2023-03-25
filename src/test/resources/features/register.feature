@Register
Feature: Register
  Scenario: Register Test
    Given User goes to url
    And User click to MyAccount Icon
    And User click to Register Button
    And User types "Hanife" to name box
    And User types "Hazirlar" to last name box
    And User types "hanifeunlu74@hotmail.com" to email box
    And User types "CanTeam123*" to password box
    And User types "CanTeam123*" to confirmation password box
    And User click personal data privacy check box
    And User click Register Button
    And User verifies Account Created message is visible