Feature: Sign up new customer into the platform
In order to fidelize customers
As a cashier
I want to sign up new customers

	Scenario: new customers should start with 100 points
		Given Marty McFly wants to become a new customer
		When I signup him into the platform
		Then he starts with 100 points
		
	Scenario: new customers should receive a welcome notification
		Given Jennifer Parker wants to become a new customer
		When I signup her into the platform
		Then she receives a welcome notification
