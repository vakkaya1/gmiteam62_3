Feature: Password Page Functionality


  Background: The user logged in and go to password page

    Given Given User navigates go to "gmi_url"
    Then click menu icon
    Then user logged in with a valid username and password
    Then User clicks to account menu
    Then User clicks to password button

  Scenario: US_008 TC_01 The old password should not be used

    Then User enters the current password in the current and new password boxes
    And Check the fail-box message

  Scenario Outline: US_008 TC_02-TC_03-TC_04-TC_05-TC_06
    Then  User enters "<pass>" to use at least  "<char>" char for stronger password and see the level chart change accordingly
    Examples:
      | pass    | char           |
      | 123456p | 1 lowercase    |
      | 123456P | 1 uppercase    |
      | pppppp1 | 1 digit        |
      | 123456. | 1 special char |
      | 1Aa.123 | 7              |
