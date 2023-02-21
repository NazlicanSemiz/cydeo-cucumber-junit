Feature: User should be able to login using correct credented


  Scenario: Positive login scenario
    Given user is on the login page of web table app
    When user enters username "Test"
    And user enters password "Testers"
    And user clicks to login button
    Then user should see url contains orders

  @wip
  Scenario: Positive login scenario
    Given user is on the login page of web table app
    When user enters username "Test" password "Testers" and logins
    Then user should see url contains orders

    #1- implement this new step
  #2- create login method in WebTableLoginPage
  #this login method should have multiple different overload version