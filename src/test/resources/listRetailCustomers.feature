Feature: List retail customers
In order to learn about my retail sign up activity
As a retail manager
I want to get lists of new customers

Scenario: platform should provide with a list of customers signed up today
	Given the following people signed up:
		| name		| surname	| signed up date	|
		| Marty		| McFly		| 2017-11-19		|
		| Jennifer	| Parker	| 2017-11-19		|
		| Emmett	| Brown		| 2016-10-25		|
		| Biff		| Tannen	| 2015-08-31		|
	When I order a list of customers signed up after yesterday
	Then I get the following customers:
		| name		| surname	|
		| Marty		| McFly		|
		| Jennifer	| Parker	|