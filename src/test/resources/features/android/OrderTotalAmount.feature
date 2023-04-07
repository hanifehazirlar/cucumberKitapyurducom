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
    And Android clicks "Satın Al" with textview
    And Android clicks "PTT Kargo" with textview
    And Android clicks "Devam Et" with textview
    And Android clicks BankTransfer Radio Button
    And Android clicks "Devam Et" with textview
    Then Android confirms the total amount
