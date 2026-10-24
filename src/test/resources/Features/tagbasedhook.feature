Feature: Validate the facebook login Page
@smoke
Scenario: Valid Login
Given user enters username and password
@regression
Scenario:   Invalid Login
Given user enters invalid username and password