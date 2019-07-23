Feature: Rediffmail page

@First
Scenario: Open the rediffmail page
	Given open the browser
	When enter the email
	Then enter the password
	Then click
	
@Second
Scenario: Fill the details
	Given click on new account link
	When enter the first name
	Then enter the last name
	Then enter the email id