Feature: Application Login

@SmokeTest
Scenario: Service Now Home Page correct login
Given User is on Service Now login page
When User login into application with username and password
Then Service Now Home Page is displayed
And Logo is displayed
And close browser

@SmokeTest
Scenario: Service Now Home Page correct login parameterized
Given User is on Service Now login page
When User login into application with "NA End User" and "SNOW1234"
Then Service Now Home Page displayed is "true"
And Logo is displayed
And close browser

@SmokeTest
Scenario: Service Now Home Page Incorrect login parameterized
Given User is on Service Now login page
When User login into application with "Test" and "password"
Then Service Now Home Page displayed is "false"
And close browser

@SmokeTest
Scenario: Service Now Home Page correct login with table
Given User is on Service Now login page
When User login into application with following details
| NA End User | SNOW1234 |
Then Service Now Home Page displayed is "true"
And Logo is displayed
And close browser

@SmokeTest
Scenario Outline: Service Now Home Page login parameterized
Given User is on Service Now login page
When User logging to application with <username> and <password>
Then Service Now Home Page displayed is "true"
And Logo is displayed
And close browser

Examples:
|username |password|
|NA End user |SNOW1234|
|NA End User General |SNOW1234|
|NA End User Conf |SNOW1234|

