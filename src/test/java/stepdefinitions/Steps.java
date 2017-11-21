package stepdefinitions;

import static org.junit.Assert.assertEquals;

import java.util.Date;
import java.util.List;

import com.bdd.retail.entities.Customer;
import com.bdd.retail.entities.Retail;

import cucumber.api.Format;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class Steps {
	
	String name;
	String surname;
	Customer customer;
	Retail retail = new Retail();
	List<Customer> signedUpPeople;
	List<Customer> customersSignedUpAfterYesterday;

	@Given("^(.+) (.+) wants to become a new customer$")
	public void wants_to_become_a_new_customer(String name, String surname) {
	    this.name = name;
	    this.surname = surname;
	}
	
	@Given("^the following people signed up:$")
	public void the_following_people_signed_up(@Format("yyyy-MM-dd") List<Customer> signedUpPeople) {
	    this.signedUpPeople = signedUpPeople;
	}
	
	@Given("^I assign them to my retail$")
	public void i_assign_them_to_my_retail() {
	    for (Customer customer: signedUpPeople) {
	    	this.retail.addCustomer(customer);
	    }
	}

	@When("^I signup (?:him|her) into the platform$")
	public void signup_somebody_into_the_platform() {
	    this.customer = new Customer("123456789", name, surname, new Date());
	}
	
	@When("^I order a list of my retail customers signed up after yesterday$")
	public void i_order_a_list_of_customers_signed_up_today() {
		Date yesterday = new Date(System.currentTimeMillis()-24*60*60*1000);
		this.customersSignedUpAfterYesterday = this.retail.getCustomersSignedUpAfter(yesterday);
	}

	@Then("^(?:he|she) starts with (\\d+) points$")
	public void starts_with_points(int expectedPoints) {
	    assertEquals(expectedPoints, this.customer.getPoints());
	}
	
	@Then("^(?:he|she) receives a welcome notification$")
	public void she_receives_a_welcome_notification() {
		assertEquals("Welcome to our platform!", this.customer.getLastNotificationReceived().getTitle());
	}
	
	@Then("^I get the following customers:$")
	public void i_get_the_following_customers(@Format("yyyy-MM-dd") List<Customer> expectedCustomersSignedUpAfterYesterday) {
	    assertEquals(expectedCustomersSignedUpAfterYesterday.size(), this.customersSignedUpAfterYesterday.size());
	    for (int i = 0; i < expectedCustomersSignedUpAfterYesterday.size(); i++) {
	    	Customer expectedCustomer = expectedCustomersSignedUpAfterYesterday.get(i);
	    	Customer actualCustomer = this.customersSignedUpAfterYesterday.get(i);
	    	assertEquals(expectedCustomer.getName(), actualCustomer.getName());
	    	assertEquals(expectedCustomer.getSurname(), actualCustomer.getSurname());
	    }
	}

}
