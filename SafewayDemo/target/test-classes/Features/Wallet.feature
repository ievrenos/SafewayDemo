Feature: View digital receipts in wallet

  As a Safeway customer I want to view my digital receipts in my wallet 
  So that I can keep track of my purchases and payments

  Scenario: View digital receipts as a valid user with no receipts
    Given I open Safeway
    When I enter "ilkerevrenos@hotmail.com" and "password123!"
    And I click on sign in button
    And I sign in successfully
    And I click on wallet
    And I click on view all receipts
    Then I can view digital receipts