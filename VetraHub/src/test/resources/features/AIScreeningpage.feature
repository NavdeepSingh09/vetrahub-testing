Feature: AI Screening Landing Page

  Scenario: Verify User is on AI Screening Page
    Given the user navigates to Vetrahub home page
    When the user clicks on For Employers
    And the user clicks on AI Screening
    Then the AI Screening and Evalution label should be displayed

  Scenario: Verify "Get Started Free" Button
    Given User is on AI Screening page
    When the user clicks on get started free button
    Then the user should be navigated to sign up page

  Scenario: Verify "Book a Demo" Button
    Given the user navigates to AI Screening Page
    When the user clicks on Book a demo button
    Then User should be navigated to book a demo page



