Feature: Sample feature3 

#Data table
@Sample_03 
Scenario: Sample scenario3 
	Given User access home page 
	And user clicks on Sign In link in the header
	And User enters credentials 
		|oxo11@yopmail.com|Password@123|
		|oxo9@yopmail.com|Password@123|   
	And Clicks on login button