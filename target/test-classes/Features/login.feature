Feature: Validate the facebook login
Scenario: Validation of Facebook Login Page Using invalid Username and invalid Password  
Given User Enters the facebook url
When User Enters the invalid username and invalid password
And User Clicks on the LoginButton
Then User Validates The Error Message After Login

