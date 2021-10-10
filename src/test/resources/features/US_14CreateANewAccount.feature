Feature:  Create a new account Functionality (Date should be created on the time of account creation)

  Background: The employee must be logged in with a valid username and password
    Given Given User navigates go to "gmi_url"
    Then click menu icon1
    Then user logged in with a valid username and password


  Scenario: TC_01 The date cannot be typed earlier, in the past, at the time of creation an account

    And User clicks to My Operations menu
    Then User clicks to Manage Accounts button
    Then User clicks to Create a new Account button
    Then User enter "DenemeAcountTeam62" in the Description and "5500" in the balance boxes
    Then User enter earlier Date in Create Date box.
    Then User enter the later Date at the time of creation time.
    Then User enter Save button.
    And User checks if new account has been created

  Scenario : TC_02 The date should be created as month, day, year, hour and minute

    And User clicks to My Operations menu
    Then User clicks to Manage Accounts button
    Then User clicks to Create a new Account button
    Then User enter "DenemeAcountTeam62" in the Description and "5500" in the balance boxes

