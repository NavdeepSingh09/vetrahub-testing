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


  Scenario: Verify "Interview Integrity" Button
    Given the user navigates back to AI Screening Page from BookDemo
    When the user scrolls down to the Interview Integrity Section
    And The user clicks on Interview Integrity
    Then The user verifies the page title

  Scenario: Verify "High-Volume Roles" is displayed
    Given the user navigates back to AI Screening Page from Interview
    When the user scrolls down to Lean Teams section
    Then Lean Teams section should be displayed