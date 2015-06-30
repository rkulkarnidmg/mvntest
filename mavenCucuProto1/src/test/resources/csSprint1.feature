Feature: Sprint1 Stories are covered here

Scenario: Successful Login
Given I am on SFServiceCloud
When I use valid credentials
Then I am logged in

Scenario: OP1 can create invoice
Given I am logged in as OP1TSS
When I enter valid information
And I click on ProcessMe
Then I can create an invoice