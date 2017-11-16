package com.bdd.retail.entities;

public class Customer {

	private String name;
	private String surname;
	private String customerNumber;
	private int numberOfPoints;
	private static final int INITIAL_NUMBER_OF_POINTS = 100;

	public Customer(String customerNumber, String name, String surname) {
		this.customerNumber = customerNumber;
		this.name = name;
		this.surname = surname;
		this.numberOfPoints = Customer.INITIAL_NUMBER_OF_POINTS;
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
	
}
