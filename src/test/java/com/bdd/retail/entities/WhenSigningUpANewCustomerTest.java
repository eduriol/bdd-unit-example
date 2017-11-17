package com.bdd.retail.entities;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bdd.retail.entities.Customer;

public class WhenSigningUpANewCustomerTest {

	@Test
	public void the_customer_should_be_correctly_set_up() {
		Customer customer = new Customer("123456789", "Marty", "McFly");
		assertEquals("Marty", customer.getName());
		assertEquals("McFly", customer.getSurname());
		assertEquals("123456789", customer.getCustomerNumber());
	}
	
	@Test
	public void the_customer_should_receive_100_points_when_set_up() {
		Customer customer = new Customer("123456789", "Marty", "McFly");
		assertEquals(100, customer.getPoints());
	}
	
	@Test
	public void the_customer_should_receive_a_welcome_message() {
		Customer customer = new Customer("123456789", "Marty", "McFly");
		assertEquals("Welcome to our platform!", customer.getLastNotificationReceived().getTitle());
	}

}
