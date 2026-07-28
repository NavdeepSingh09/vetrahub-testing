Feature: Check the for employer page functionality

  Scenario: Verify navigation to video interviews page

    Given the user is on home page
    When the user click on For Employer button
    And the user click on AI Screening
    Then the user should be on For Employer Screen
    And the Get started free button should be enabled
    And the Book a Demo button should be Displayed
    When the user Scrolls and click on Video Interviews
    Then the user should be on Video interview page