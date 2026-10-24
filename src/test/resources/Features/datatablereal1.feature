Feature: Registration Form
Scenario: Register multiple users
Given user is on the registration form
When user enters registration details
      | country | title | firstName | lastName | dob        | doj        | email             | phone      | communication |
      | India   | Mr.    | Arun      | Kumar    | 1990-05-20 | 01/06/2021 | arun@test.com     | 9876543210 | Email         |
      | India   | Mr.    | Ravi      | Kumar    | 1991-06-15 | 02/06/2021 | ravi@test.com     | 9876543211 | Phone         |
      | India   | Ms.    | Priya     | Sharma   | 1992-07-10 | 03/06/2021 | priya@test.com    | 9876543212 | Email         |