package com.bdd.retail.entities;

import static org.junit.Assert.assertEquals;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;

import com.bdd.retail.entities.Customer;
import com.bdd.retail.entities.CustomerNotification;

public class WhenCreatingANewNotificationTest {
	
	DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
	
	@Test
	public void the_notification_should_be_correctly_created() throws ParseException {
		Customer customer = new Customer("123456789", "Marty", "McFly", dateFormatter.parse("2016-12-25"), new Retail());
		CustomerNotification notification = new CustomerNotification("Welcome to our platform!", customer);
		assertEquals("Welcome to our platform!", notification.getTitle());
		assertEquals("Marty McFly", notification.getReceiverName());
	}

}
