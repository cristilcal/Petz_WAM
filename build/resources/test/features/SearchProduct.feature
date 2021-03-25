Feature: Search a Product
  Scenario: Search a Simple Product With Success
    Given I access Petz HomePage
    When I search "Aquário"
    Then I see a list of product "Aquário"
    And I click in product "Aquário Boyu Curvo 100 187 Litros Preto Champagne"
    Then I show the Title "Aquário Boyu Curvo 100 187 Litros Preto Champagne" and the price "R$ 3.199,99"