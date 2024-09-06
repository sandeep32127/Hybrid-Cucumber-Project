Feature: Verifying My Account Page functionalities

@Regression
Scenario Outline: Verify the My Account navigation bar items
Given User is on Login Page
And User logins with correct credentials <uName> <password>
When User lands on Account Page
Then User should verify the Navigation Items count as <count>
Examples:
|uName                  |password      |count|
|sandeep321260@gmail.com|Sandeep@321260|10   |