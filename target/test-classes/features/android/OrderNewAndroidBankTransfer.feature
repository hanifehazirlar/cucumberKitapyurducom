@AndroidBankTransfer
Feature: New User Order with Bank Transfer on Android

  Scenario: New User Order with Bank Transfer Test on Android
    Given Android on the main screen
    When Android clicks a physical product
    And Android clicks "Sepete Ekle" with textview
    And Android clicks "Giriş Yap / Üye Ol" button
    And Android clicks Üye Ol button
    And Android fills in the information in the form with valid values
    And Android clicks Sepetim button
    And Android clicks "Satın Al" with textview
    And Android clicks "Adres Ekle" with textview
    And The Android fills in the information on the address page
    Then Android verifies that they have successfully added the address
    And Android clicks OK button
    And Android clicks my basket icon
    And Android clicks buy icon
    And Android clicks continue button
    And Android clicks Bank transfer radio button
    And Android clicks continue button
    And Android clicks preinformation check box
    And Android confirm order button
    Then Android verifies order created message is visible