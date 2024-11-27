Feature: Search Employee

  @project @regression
  Scenario: Search Employee
    #Given user is able to access HRMS application
    When user enters admin username and password
    And user clicks on login button
    Then user on dashboard page
    When user clicks on PIM option
    And user cliks on employee list option

