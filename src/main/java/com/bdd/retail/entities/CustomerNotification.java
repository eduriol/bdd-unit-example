package com.bdd.retail.entities;

public class CustomerNotification {

	private String title;
	private Customer receiver;

	public CustomerNotification(String title, Customer receiver) {
		this.title = title;
		this.receiver = receiver;
	}

	public String getTitle() {
		return this.title;
	}

	public String getReceiverName() {
		return this.receiver.getName() + " " + this.receiver.getSurname();
	}

}
