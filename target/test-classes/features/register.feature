@Register
Feature: Register
  Scenario: Register Test
    Given User goes to url
    And User click to MyAccount Icon
    And User click to Register Button
    And User types "firstname" to name box
    And User types "lastname" to last name box
    And User types "email" to email box
    And User types "password" to password box
    And User types "comfirmpassword" to confirmation password box
    And User click personal data privacy check box
    And User click Register Button
    And User verifies Account Created message is visible