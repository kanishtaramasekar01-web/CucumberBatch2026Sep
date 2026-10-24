Feature: Login
Scenario Outline: Login with multiple users
Given user is on login Page 
When user enters "<username>" and "<password>"
Then errormessage should be displayed
Examples:
| username | password |
| admin    | admin123 |
| student  | stud123  |
| employee | emp123   |


