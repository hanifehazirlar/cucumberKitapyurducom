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
    And Android clicks "PTT Kargo" with textview
    And Android clicks "Devam Et" with textview
    And Android clicks BankTransfer Radio Button
    And Android clicks "Devam Et" with textview
    And Android verifies total price
    And Android clicks preInformation checkBox
    And Android clicks "Siparişi Onaylayın" with textview
    And Android verifies the order is created
