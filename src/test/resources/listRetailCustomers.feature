Feature: List retail customers
In order to learn about my retail sign up activity
As a retail manager
I want to get lists of new customers

Scenario: platform should provide with a list of customers signed up last Christmas Day
	Given the following people signed up:
		| name		| surname	| signed up date	|
		| Marty		| McFly		| 2017-11-22		|
		| Jennifer	| Parker	| 2017-11-22		|
		| Emmett	| Brown		| 2016-12-25		|
		| Biff		| Tannen	| 2015-08-31		|
	And I assign them to my retail
	When I order a list of my retail customers signed up during last Christmas Day
	Then I get the following customers:
		| name		| surname	| signed up date	|
		| Emmett	| Brown		| 2016-12-25		|