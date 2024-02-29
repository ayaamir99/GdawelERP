@Runner
Feature: Login || user could Login to the site

  Scenario: user could Login entering valid data

    And Open "https://gdawel.app/"
    And user click on Account then SignIn
    And user enter valid email"detebag627@elixirsd.com" and valid password"74108520"
    And user user click on SignIn Button
