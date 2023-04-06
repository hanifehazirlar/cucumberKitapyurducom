@TotalAmount
Feature: Order total amount

  Scenario: Total amount validation
    Given Android on the main screen
    And Android clicks to my account icon
    And Android enters "validEmail" to email checkbox
    And Android enters "validPassword" to password checkbox
    And Android clicks login button
    And Android clicks the homepage icon
    When Android clicks a physical product
    And Android clicks "Sepete Ekle" with textview
    And Android clicks the homepage icon
    When Android clicks on the second item
    And Android clicks "Sepete Ekle" with textview
    And Android clicks Sepetim button
    Then Android confirms the total amount
