package com.bdd.retail.entities;

import static org.junit.Assert.assertEquals;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;

import com.bdd.retail.entities.Customer;

public class WhenSigningUpANewCustomerTest {
	
	DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
	
	@Test
	public void the_customer_should_be_correctly_set_up() throws ParseException {
		Customer customer = new Customer("123456789", "Marty", "McFly", dateFormatter.parse("2015-12-25"));
		assertEquals("Marty", customer.getName());
		assertEquals("McFly", customer.getSurname());
		assertEquals("123456789", customer.getCustomerNumber());
		assertEquals(dateFormatter.parse("2015-12-25"), customer.getSignedUpDate());
	}
	
	@Test
	public void the_customer_should_receive_100_points_when_set_up() throws ParseException {
		Customer customer = new Customer("123456789", "Marty", "McFly", dateFormatter.parse("2015-12-25"));
		assertEquals(100, customer.getPoints());
	}
	
	@Test
	public void the_customer_should_receive_a_welcome_message() throws ParseException {
		Customer customer = new Customer("123456789", "Marty", "McFly", dateFormatter.parse("2015-12-25"));
		assertEquals("Welcome to our platform!", customer.getLastNotificationReceived().getTitle());
	}

}
