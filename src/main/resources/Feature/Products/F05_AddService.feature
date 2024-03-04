@Runner
Feature: Products || user could  Add Service

  Scenario: user could Add New  Service

    Given I Open Products Page
    When I click on Add New Product Button
    And I Select Service Product Tab
    Then I Enter product name
    And I Enter product quantity
    And I Enter price for product unit
    And  I Click on save Button