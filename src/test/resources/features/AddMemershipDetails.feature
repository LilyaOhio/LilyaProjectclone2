Feature: Add membership

  @member
  Scenario: Membership

            #Given user is able to access HRMS application
    When user enters admin username and password
    And user clicks on login button
    Then user on dashboard page
    When user clicks on PIM option
    And user enter emplyee ID
    When user clicks on search button
    Then user is albe to see employee
    When  user clicks on ID number
    Then user click on membership button
    And user clicks on Add option button
    Then user select option from dropdown menu
    And user select Subscription Paid By
    Then user enter paid amount "70"
    Then user select Currency
    And user enters day of Subscription and Renewal
    Then user clicks on save button