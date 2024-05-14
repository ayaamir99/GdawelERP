@Runner
Feature: Login || user could Login to the site

  Scenario: user could Login entering valid data

    Given  I am on the Sample App login page
   And    I fill  the User Name
    And    I fill  the Password
    When I click on the Log In button
#   Then  I see the message {string}

