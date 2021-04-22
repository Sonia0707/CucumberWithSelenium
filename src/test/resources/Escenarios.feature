Feature: run a self-test to see if chrome opens as a guest
  Scenario: open Chrome to check if you are a guest
    Given Open Chrome and run the application.
    When I click on the button to accept cookies
    Then I hit click on the login button