Feature: List retail customers
In order to learn about my retail sign up activity
As a retail manager
I want to get lists of new customers

Scenario: platform should provide with a list of customers signed up today
	Given the following people signed up:
		| name		| surname	| sign up date	|
		| Marty		| McFly		| now			|
		| Jennifer	| Parker	| now			|
		| Emmett	| Brown		| 2016-10-25	|
		| Biff		| Tannen	| 2015-08-31	|
	When I order a list of customers signed up today
	Then I get the following customers:
		| name		| surname	|
		| Marty		| McFly		|
		| Jennifer	| Parker	|