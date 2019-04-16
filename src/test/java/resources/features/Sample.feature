Feature: verify sample5

Scenario: verify sample scenario5
 Given User is on Home Page
     When User Navigate to LogIn Page
     And User enters UserName and Password
     Then Message displayed LogIn Successfully
 