Feature: Application HomePage

@RegressionTest
Scenario: Service Now Home Page correct login
Given User is on Service Now login page
When User login into application with username and password
Then Service Now Home Page is displayed
And Service Now Home Page is validated
And close browser