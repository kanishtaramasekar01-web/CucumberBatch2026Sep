Feature: Validate the facebook login Page
Background: 
    Given User Enters the facebook url through Chrome browser
    
Scenario: Validation of facebook login Page Using Invalid Username and Invalid Password
When User Enters the invalid username and invalid password
And  User Clicks on the Login Button
Then User Validates the error Message


Scenario: Validation of facebook login Page Using valid Username and valid Password
When User Enters the valid username and valid password
And  User Clicks on the Login Button
Then User Validates the error Message


