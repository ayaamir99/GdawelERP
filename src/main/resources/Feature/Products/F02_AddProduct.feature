@Runner
Feature: Products || user could  Add Product

  Scenario: user could Add New Product without Tax

    Given I Open Products Page
    And I click on Add New Product Button
    And I Enter product name
    And I Enter product quantity
    And I Enter cost and price for product unit
    Then I Click on save Button

#  Scenario: user could Add New Product with Tax
#
#    Given I Open Products Page
#    When I click on Add New Product Button
#    Then I should be redirected to the Add product page
#    And I Enter product name
#    And I Enter product quantity
#    And I Enter cost and price for product unit
#    And I select Additional Tax
#    When I Click on save Button
#    Then I should be redirected to the  products page


