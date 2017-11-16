package com.bdd.retail.entities;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	private String name;
	private String surname;
	private String customerNumber;
	private int numberOfPoints;
	private List<CustomerNotification> notificationsReceived;
	private static final int INITIAL_NUMBER_OF_POINTS = 100;
	private static final String WELCOME_MESSAGE = "Welcome to our platform!";

	public Customer(String customerNumber, String name, String surname) {
		this.customerNumber = customerNumber;
		this.name = name;
		this.surname = surname;
		this.numberOfPoints = Customer.INITIAL_NUMBER_OF_POINTS;
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
	
}
