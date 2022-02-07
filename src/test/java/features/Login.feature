Feature: Application login

@smoke
Scenario: Home page default login
	Given User is on netbanking landing page
	When User loging into app using "jin" and "123" 
	Then Home is poppulated
	
@regression
Scenario: Facebook login page function
	Given User is on facebook login page
	When user providing userid and password
	Then validate credentials and navigate to home page
	
