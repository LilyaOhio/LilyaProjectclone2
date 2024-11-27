Feature: Add dependent scenario

  @add @regression
  Scenario: Search Employee by ID
    Given user is able to access HRMS application
    When user enters admin username and password
    And user clicks on login button
    Then user on dashboard page
    When user clicks on PIM option
    And user enter emplyee ID
    When user clicks on search button
    Then user is albe to see employee
    When  user clicks on ID number
    And user clicks on Dependents option
    And user clicks on Add option
    Then user enter firstname
    When user select relationship
    And user enters Date of Birth
    Then dependets saved successfully