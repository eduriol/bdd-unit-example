package com.bdd.retail.entities;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bdd.retail.entities.Customer;
import com.bdd.retail.entities.CustomerNotification;

public class WhenCreatingANewNotification {
	
	@Test
	public void the_notification_should_be_correctly_created() {
		Customer customer = new Customer("123456789", "Marty", "McFly");
		CustomerNotification notification = new CustomerNotification("Welcome to our platform!", customer);
		assertEquals("Welcome to our platform!", notification.getTitle());
		assertEquals("Marty McFly", notification.getReceiverName());
	}

}
