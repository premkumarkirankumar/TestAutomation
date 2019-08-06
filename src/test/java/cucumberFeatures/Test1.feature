Feature: Application Login

Scenario: Service Now Home Page default login
Given User is on Service Now login page
When User login into application with username and password
Then Service Now Home Page is displayed
And Logo is displayed