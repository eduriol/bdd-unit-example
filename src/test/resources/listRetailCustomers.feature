Feature: List retail customers
In order to learn about my retail sign up activity
As a retail manager
I want to get lists of new customers

Scenario: platform should provide with list of customers signed up today
	Given the following people signed up today:
		| name		| surname	|
		| Marty		| McFly		|
		| Jennifer	| Parker	|
	And the following people signed up yesterday:
		| name		| surname	|
		| Emmett	| Brown		|
		| Biff		| Tannen	|
	When I order a list of customers signed up today
	Then I get the following customers:
		| name		| surname	|
		| Marty		| McFly		|
		| Jennifer	| Parker	|	