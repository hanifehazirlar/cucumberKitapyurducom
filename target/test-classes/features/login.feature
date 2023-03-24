@loginTest
Feature: Login Test

  @loginHappyPath
  Scenario:Valid Login
    Given User goes to url
    When User click to loginButton
    And User send "validEmail" to email box
    And User send "validPassword" to password box
    #And User click loginButton on login page
    Then User see "validEmail" text
    When User clear the cookies