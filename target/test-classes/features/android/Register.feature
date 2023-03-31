@AndroigRegister
Feature: Android Register
  Scenario: Android Register Test
    Given Android on the main screen
    And Android clicks to my account icon
    And Android click to Free Register Button
    And Android types "firstname" to name box
    And Android types "lastname" to last name box
    And Android types "email" to email box
    And Android types "password" to password box
    And Android types "comfirmpassword" to confirmation password box
    And Android click personal data privacy check box
    And Android click Register Button on register page
    And Android verifies Account Created message is visible