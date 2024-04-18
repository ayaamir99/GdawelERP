@Runner
Feature: Login || user could Login to the site

  Scenario: user could Login entering valid data

    Given I Open "https://gdawel.app/"
    And  I am on the login page
    When I enter valid email"detebag627@elixirsd.com" and valid password"74108520"
    And I user click on SignIn Button
    Then I should be redirected to the Dashboard
#    And I should see a welcome message

