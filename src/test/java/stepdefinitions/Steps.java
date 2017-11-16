package stepdefinitions;

import static org.junit.Assert.assertEquals;

import com.bdd.retail.entities.Customer;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class Steps {
	
	String name;
	String surname;
	Customer customer;

	@Given("^(.+) (.+) wants to become a new customer$")
	public void wants_to_become_a_new_customer(String name, String surname) {
	    this.name = name;
	    this.surname = surname;
	}

	@When("^I signup (?:him|her) into the platform$")
	public void signup_somebody_into_the_platform() {
	    customer = new Customer("123456789", name, surname);
	}

	@Then("^(?:he|she) starts with (\\d+) points$")
	public void starts_with_points(int expectedNumberOfPoints) throws PendingException {
	    assertEquals(100, customer.getPoints());
	}

}
