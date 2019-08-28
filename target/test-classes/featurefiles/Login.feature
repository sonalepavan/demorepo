#StyoryType=WEB
#Owner=ejagruti
#CreationDate=24-12-2017 Sunday
@Login
Feature: Login Feature

Background: user is successfully logged in
When user opens the browser
And user enter the url "http://localhost:90/finsys"  
@SmokeTest @EndToEnd
Scenario: Login Functionality for valid username and password 
Given user is on the application login page
When user enters "dummyfm" as username
And user enters "passw0rd" as password
And user clicks on login button
Then user is on the application home page
And user gets the message starting with "Welcome" on the top
And user closes the browser
@SmokeTest @EndToEnd
Scenario: Login Functionality for valid username and invalid password
Given user is on the application login page
When user enters "dummyfm" as username
And user enters "Password" as password
And user clicks on login button
Then user is not logged in and user is on login page
And error message is displayed
And user closes the browser

@SmokeTest @EndToEnd
Scenario: Login Functionality for invalid username and valid password
Given user is on the application login page
When user enters "dummy" as username
And user enters "passw0rd" as password
And user clicks on login button
Then user is not logged in and user is on login page
And error message is displayed
And user closes the browser

@SmokeTest @EndToEnd
Scenario: Login Functionality for blank username and  password
Given user is on the application login page
When user enters "" as username
And user enters "" as password
And user clicks on login button
Then user is not logged in and user is on login page
And error message is displayed 
And user closes the browser
@SmokeTest @EndToEnd
Scenario: Login Functionality by passing special characters in username and invalid password
Given user is on the application login page
When user enters "@#$%^" as username
And user enters "password" as password
And user clicks on login button
Then user is not logged in and user is on login page
And error message is displayed
And user closes the browser

