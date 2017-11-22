package com.bdd.retail.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Retail {
	
	private List<Customer> customers = new ArrayList<>();

	public List<Customer> getCustomersSignedUpOn(Date date) {
		List<Customer> customersSignedUpOnDate = new ArrayList<>();
		for (Customer customer : this.customers) {
			if (customer.getSignedUpDate().equals(date)) {
				customersSignedUpOnDate.add(customer);
			}
		}
		return customersSignedUpOnDate;
	}

	public void addCustomer(Customer customer) {
		customers.add(customer);
	}
	
}
