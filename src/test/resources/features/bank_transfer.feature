Feature: Bank transfer

  Scenario: Transfer money to a saving account
    Given Amy has a savings account with $500
    And she has a current account with $200
    When she transfers $100 from her current account her savings
    Then her savings account should have $600
    And her current account should have $100

