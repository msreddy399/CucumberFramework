Feature: Sample feature2

#Scenario Outline
@Sample_02	
Scenario Outline: Sample scenario2
	Given User access home page
	And user clicks on Sign In link in the header
    And User enters "<username>" and "<password>"
    And Clicks on login button
Examples:
      | username        | password   |
      |oxo9@yopmail.com |Password@123|
      |oxo11@yopmail.com|Password@123|