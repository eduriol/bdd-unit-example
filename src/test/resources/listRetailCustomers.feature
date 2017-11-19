Feature: List retail customers
In order to learn about my retail sign up activity
As a retail manager
I want to get lists of new customers

Scenario: platform should provide with a list of customers signed up in the last 3 days
	Given the following people signed up 1 day ago:
		| name		| surname	|
		| Marty		| McFly		|
		| Jennifer	| Parker	|
	And the following people signed up 2 days ago:
		| name		| surname	|
		| Emmett	| Brown		|
		| Biff		| Tannen	|
	And the following people signed up 4 days ago:
		| name		| surname	|
		| George	| McFly		|
	When I order a list of customers signed up in the last 3 days
	Then I get the following customers:
		| name		| surname	|
		| Marty		| McFly		|
		| Jennifer	| Parker	|
		| Emmett	| Brown		|
		| Biff		| Tannen	|