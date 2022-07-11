@login
Feature: Validate Login
#background is for precondition
Background: Open browser and Launch Url
   Given User should Open browser as "chrome" 
   And User should Launch url
  @validlogin
 Scenario: User should able to login with valid credentials
   Given User enter Username "standard_user"
   And User enter Password "secret_sauce"
   When Click on Login button
   Then User should navigate to HomePage

   @invalidlogin
   Scenario Outline: user should not able to login with invalid credentials
   Given User enter Username "<username>"
   And User enter Password "<pwd>"
   When Click on Login button
   Then User should get error message
   Examples:
   |username|pwd|
   |test|test123|
   |abctest|abc123|