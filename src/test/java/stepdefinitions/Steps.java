package stepdefinitions;

import static org.junit.Assert.assertEquals;

import com.bdd.retail.entities.Customer;

import cucumber.api.DataTable;
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
	
	@Given("^the following people signed up (\\d+) days? ago:$")
	public void the_following_people_signed_up_days_ago(int numberOfDaysAgo, DataTable signedUpPeople) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    throw new PendingException();
	}

	@When("^I signup (?:him|her) into the platform$")
	public void signup_somebody_into_the_platform() {
	    customer = new Customer("123456789", name, surname);
	}
	
	@When("^I order a list of customers signed up in the last (\\d+) days?$")
	public void i_order_a_list_of_customers_signed_up_in_the_last_days(int numberOfDays) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^(?:he|she) starts with (\\d+) points$")
	public void starts_with_points(int expectedNumberOfPoints) throws PendingException {
	    assertEquals(100, customer.getPoints());
	}
	
	@Then("^(?:he|she) receives a welcome notification$")
	public void she_receives_a_welcome_notification() throws PendingException {
		assertEquals("Welcome to our platform!", customer.getLastNotificationReceived().getTitle());
	}
	
	@Then("^I get the following customers:$")
	public void i_get_the_following_customers(DataTable expectedCustomers) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    throw new PendingException();
	}

}
