
Feature: Application Login

	@WebTest
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User logs into application with username and password 
    Then Homepage is populated
    And cards displayed are "true"
	
	@SmokeTest1
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User logs into application with username "jin" and password "1234"
    Then Homepage is populated
    And cards displayed are "true"
  
  @MobileTest  
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User logs into application with username "john" and password "4321"
    Then Homepage is populated
    And cards displayed are "false"
  
  @MobileTest  
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User signs up with following details
    | jenny | abcd | jenny@abcd.com | Australia | 0401094859 |
    Then Homepage is populated
    And cards displayed are "false"
	
	@WebTest
  Scenario Outline: Home page default login
  	Given User is on NetBanking landing page
  	When User logs in to application with username <username> and password <password>
  	Then Homepage is populated
  	And cards displayed are "true"

  Examples: 
      | username | password |
      | user1    | pass1    |
      | user2    | pass2    |
      | user3    | pass3    |
      | user4    | pass4    |
