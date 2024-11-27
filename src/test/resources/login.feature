Feature: Login scenarios

  @login @smoke @regression
  Scenario: admin login
    Given user is able to access HRMS application
    When user enters admin username and password
    And user clicks on login button
    Then user on dashboard page



