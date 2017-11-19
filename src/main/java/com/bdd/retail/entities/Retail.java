package com.bdd.retail.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Retail {
	
	private List<Customer> customers = new ArrayList<>();

	public List<Customer> getCustomersSignedUpAfter(Date startingDate) {
		List<Customer> customersSignedUpAfterDate = new ArrayList<>();
		for (Customer customer : this.customers) {
			if (customer.getSignedUpDate().after(startingDate)) {
				customersSignedUpAfterDate.add(customer);
			}
		}
		return customersSignedUpAfterDate;
	}

	public void addCustomer(Customer customer) {
		customers.add(customer);
	}
	
}
