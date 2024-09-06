Feature: User should be verifying the functionalities of Login Page

@Regression
Scenario Outline: User should verify the login page title
Given User is on Login Page
When User gets the title of the page
Then The title of the page should be <title>
Examples:
|title|
|Customer Login|

@Smoke @Skip
Scenario: Forgot Password link should be displayed on Login Page
Given User is on Login Page
Then Forgot Password link should be displayed

@Sanity
Scenario Outline: User logins with the correct credentials
Given User is on Login Page
And User enters the user name <uName>
And User enters the password <password>
When User enters the login button
And User gets the title of the page
Then The title of the page should be <title>
Examples:
|uName									|password			 |title			|
|sandeep321260@gmail.com|Sandeep@321260|My Account|