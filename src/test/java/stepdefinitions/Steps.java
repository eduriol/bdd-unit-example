package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

	@Given("^(.+) wants to become a new customer$")
	public void wants_to_become_a_new_customer() throws PendingException {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I signup (?:him|her) into the platform$")
	public void signup_somebody_into_the_platform() throws PendingException {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	@Then("^(?:he|she) starts with (\\d+) points$")
	public void starts_with_points(int numberOfPoints) throws PendingException {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
}