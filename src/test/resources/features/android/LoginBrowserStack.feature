@Browser
Feature: Android Login

  Scenario: Android Valid Login Test
    Given Android on the "Browser Stack" main screen
    And Android Browser clicks to my account icon
    And Android Browser enters "nesteren_2007@hotmail.com" to email checkbox
    And Android Browser enters "Hanife04061982" to password checkbox
    And Android Browser clicks login button
    And Android Browser verifies logged in