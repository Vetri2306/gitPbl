
Feature: Searching brand name

@Brands
Scenario: search valid brand name
Given I launch the application
When I hovered over the brand tab
When I searched a valid brand name 
Then I verified that brandname gat searched successfully

@Brands-Invalid
Scenario: search invalid brand name
Given I launch the application
When I hovered over the brand tab
When I searched a valid brand name 
Then I verified that brandname gat searched succesfully

