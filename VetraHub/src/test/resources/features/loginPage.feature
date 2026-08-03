Feature: Login page of VetraHub web application Verify user is on application main landing page

  Scenario: user must be on Login page
    Given navigate to VetraHub website
    When check title of VetraHub main page
    And verify header of the page

  Scenario: Verify user can check ATS screen
    Given User is on home page
    When User click on ATS screen page
    And Verify header of the page2
    And Scroll down to login button
    Then verify login button on Ats

    Scenario: check job boards and alerts options
      Given User is on home page1
      When User scroll down till jobs board
      And User click on jobs board
      Then User verify page Title2

Scenario: check home page footer
  Given User is on home page2
  When USer scroll down till footer
  And user click on one of the footer
  Then User verify page Title

