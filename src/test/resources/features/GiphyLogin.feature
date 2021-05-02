Feature: GiphyLogin

  Scenario: GiphyLogin - User is successfully logged in to app
    Given user go to Login screen
    When I enter credentials of existing user on Login screen
      And I tap Log In button on Login screen
    Then user is logged in