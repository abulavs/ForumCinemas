@ForumCinemasTest

Feature: Forum Cinemas profile test

  @UserNameTest
  Scenario: Checks user Name
    Given Open Chrome
    And Open ForumCinemas homepage
    And Open Login page
    When Fill Username username@username and password usernamePassword
    And Press Submit
    And Press Edit Profile Button
    And Compare Name AAAAAA and Surname BBBBBBBBBB
    Then Change Name to Jānis and Surname to Ozols
    And Change Birth data 11 day 10 month 2000 year
    And Save changes
    And Close Chrome
