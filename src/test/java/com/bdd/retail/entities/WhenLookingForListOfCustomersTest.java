package com.bdd.retail.entities;

import static org.junit.Assert.assertEquals;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class WhenLookingForListOfCustomersTest {
	
	DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
	
	@Test
	public void the_list_of_customers_signed_up_on_a_date_should_be_correctly_created() throws ParseException {
		Retail myRetail = new Retail();
		Date today = new Date();
		Date yesterday = new Date(System.currentTimeMillis()-24*60*60*1000);
		myRetail.addCustomer(new Customer("123456789", "Marty", "McFly", today));
		myRetail.addCustomer(new Customer("123456788", "Jennifer", "Parker", today));
		myRetail.addCustomer(new Customer("123456787", "Emmett", "Brown", yesterday));
		myRetail.addCustomer(new Customer("123456786", "Biff", "Tannen", dateFormatter.parse("2015-12-25")));
		assertEquals(1, myRetail.getCustomersSignedUpOn(yesterday).size());	
	}

}
