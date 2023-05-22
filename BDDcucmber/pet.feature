Feature: Jpetstore


Scenario: login with claid credentials
Given Iam a user who launched a jpetsore to sign up a account
When I click on the Sign Inlink
Then Hit enter key to sign up
When I enter the username " <username>"
And I enter the password
And I click on the login button
Then I should be logged in with my account
Examples:
|username|
|j2ee|


Scenario: login with claid credentials
Given Iam a user who launched a jpetsore to sign up a account
When I click on the Sign Inlink
Then Hit enter key to sign up
When I enter the username " <username>"
And I enter the password
And I click on the login button
Then I should be logged in with my account
Then I click fish
And  I click F1-SW-01
Then I click EST-1
And I click add to cart
Then I click proceed to checkout
And I click continue
Examples:
|username|
|j2ee|


Scenario: login with claid credentials
Given Iam a user who launched a jpetsore to sign up a account
When I click on the Sign Inlink
Then Hit enter key to sign up
When I enter the username " <username>"
And I enter the password
And I click on the login button
Then I should be logged in with my account
Then I click fish
And  I click F1-SW-01
Then I click EST-1
And I click add to cart
Then I click proceed to checkout
And I click continue
Then I click Birds
And I click Av-cb-01
Then I click add to cart
And I click proceed to checkout
Then I click continue
And I click confirm



Examples:
|username|