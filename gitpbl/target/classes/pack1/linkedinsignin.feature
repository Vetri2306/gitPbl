Feature: signin

@Signin
Scenario: Linkedinsignin
Given Launch the application
When I enter the Email in the field
When I enter the password in the field
When I click the signin button
Then Verified that user signin succesfully