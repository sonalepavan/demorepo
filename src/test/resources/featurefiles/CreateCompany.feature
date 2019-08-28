#StyoryType=WEB
#Owner=ejagruti
#CreationDate=30-11-2018 friday
@CreateComapny

Feature: Create Company
Background: User is on the Home Page
When user opens the browser
And user enter the url "http://localhost:90/finsys"
Then user is on the application login page
When user enters "dummyfm" as username
And user enters "passw0rd" as password
And user clicks on login button
Then user is on the application home page
And user gets the message starting with "Welcome" on the top
@SmokeTest @EndToEnd
Scenario: Create New Company
When user clicks on Manage Company
Then user is on Manage Company tab 
When user clicks on New button
And User enters Company name as "COMPANY1"
And User selects Company type as "IT"
And User selects Company Subtype as "Development"
And user enters Company Address as"Sinhgad Road, Pune"	
And User enters Phone as "8768768678"
And User enters Email as "xyz@gmail.com"
And User enters Pan Details as "GAGPS343434"
And User enters Tin details as "6767867868678"
And user enters Mobile as "9096676244"
And user enters Web Site as "www.tcs.com"
And User selects Country as "INDIA"
And User selects State as "MAHARASHTRA"
And User selects City name as "PUNE"
And User enters Total Employee as "42"
And User clicks on Save button
Then user should see the successfully created company name in company list
And user will close the browser

@EndToEnd
Scenario: User should not be able to create New Company due to existing Company name
Given User is on Home page after successful login
When user clicks on Manage Company
Then user is on Manage Company tab 
When user clicks on New button
And User enters Company name as "COMPANY1"
And User selects Company type as "IT"
And User selects Company Subtype as "Development"
And user enters Company Address as"Sinhgad Road, Pune"	
And User enters Phone as "768768768678"
And User enters Email as "xyz@gmail.com"
And User enters Pan Details as "GAGPS343434"
And User enters Tin details as "6767867868678"
And user enters Mobile as "9096676244"
And user enters Web Site as "www.tcs.com"
And User selects Country as "INDIA"
And User selects State as "MAHARASHTRA"
And User selects City name as "PUNE"
And User enters Total Employee as "42"
And User clicks on Save button
Then user should see the error message saying "Company already exist"
And user will close the browser

@EndToEnd
Scenario:	User should create company by passing only valid mandatory fields
	When user clicks on Manage Company
	Then user is on Manage Company tab
	When user clicks on New button
	And User enters Company name as "Tester12"
	And User enters Email as "abcdef@gmail.com"
	And User enters Pan Details as "ARPPT3211265498"
	And User enters Tin details as "32165432165487"
	And User clicks on Save button
	Then user should see the successfully created company name in company list
	And user will close the browser
@EndToEnd
	Scenario:	User should create company by passing only valid non-mandatory fields
	Given User is on Home page after successful login
	When user clicks on Manage Company
	Then user is on Manage Company tab
	When user clicks on New button
	And User enters Company name as "Tester12"
	And User selects Company type as "IT"
	And User selects Company Subtype as "Support"
	And User selects City name as "Pune"
	And User enters Phone as "0123456789"
	And User enters Email as "abcdef@gmail.com"
	And User enters Pan Details as "ARPPT3211265498"
	And User enters Tin details as "32165432165487"
	And User selects Country as "INDIA"
	And User selects State as "MAHARASHTRA"
	And User selects City name as "PUNE"
	And User enters Total Employee as "1"
	And User clicks on Save button
	Then User should get the validation error message saying "This field is require" for the required fields	
And user will close the browser

