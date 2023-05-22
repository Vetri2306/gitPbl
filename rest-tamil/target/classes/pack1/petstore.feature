Feature: PetStore function


Scenario Outline: product search
Given I launch the PetStore application
When I click signin to launch signin page
When I enter the UserName "<UserName>"
When I enter the password 
And I click the login button
Then I see the PetStore HomePage

Examples:

|UserName|
|j2ee|


Scenario: Fish order
Given I am on the PetStore Homepage
When I search for F1-SE
And I add it to cart
And I proceed to checkout
And I continue to confirm the order
Then I see confirm order message



Scenario: Bird order
Given I am on the PetStore Homepage
When I search for AV-CB
And I add it to cart1
And I proceed to checkout1
And I continue to confirm the order1
Then I see confirm order message1