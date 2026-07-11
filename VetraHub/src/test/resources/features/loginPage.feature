Feature: Login page of VetraHub web application
  Verify user is on application main landing page
  Scenario: user must be on Login page
    Given navigate to VetraHub website
    When check title of VetraHub main page
    And verify header of the page
    Then verify Log in is available