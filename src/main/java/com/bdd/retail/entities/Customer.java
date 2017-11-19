package com.bdd.retail.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Customer {

	private String name;
	private String surname;
	private String customerNumber;
	private Date signedUpDate;
	private int numberOfPoints;
	private Retail retail;
	private List<CustomerNotification> notificationsReceived;
	private static final int INITIAL_NUMBER_OF_POINTS = 100;
	private static final String WELCOME_MESSAGE = "Welcome to our platform!";

	public Customer(String customerNumber, String name, String surname, Date signedUpDate, Retail retail) {
		this.customerNumber = customerNumber;
		this.name = name;
		this.surname = surname;
		this.signedUpDate = signedUpDate;
		this.numberOfPoints = Customer.INITIAL_NUMBER_OF_POINTS;
		if (retail != null) {
			this.retail = retail;
		} else {
			this.retail = new Retail();
		}
		this.retail.addCustomer(this);
		this.notificationsReceived = new ArrayList<CustomerNotification>();
		this.notificationsReceived.add(new CustomerNotification(Customer.WELCOME_MESSAGE, this));
	}
	
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public String getCustomerNumber() {
		return customerNumber;
	}

	public int getPoints() {
		return numberOfPoints;
	}

	public CustomerNotification getLastNotificationReceived() {
		return this.notificationsReceived.get(this.notificationsReceived.size() - 1);
	}

	public Date getSignedUpDate() {
		return this.signedUpDate;
	}
	
}
