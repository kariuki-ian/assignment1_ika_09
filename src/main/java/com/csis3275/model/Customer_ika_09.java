package com.csis3275.model;

import java.util.Random;
import java.util.UUID;

public class Customer_ika_09 extends Person_ika_09 implements GenerateTicket_ika_09 {
	// Constructor
	public Customer_ika_09(String name) {
		super(name);
	}

	// Properties
	private String customerID;
	private static final double CREDIT_PERCENTAGE = 0.05;

	// Trivial Methods
	public String generateCustomerID() {
		Random random = new Random();
		int id = random.nextInt(100, 400);
		this.customerID = "#CUST" + String.valueOf(id);
		return this.customerID;
	}

	public String calculateStoreCredit() {
		Random random = new Random();
		double purchaseAmount = random.nextDouble(200, 900);
		double credit = purchaseAmount * CREDIT_PERCENTAGE;
		return String.format("For $%.2f purchase, you get $%.2f store credits.", purchaseAmount, credit);
	}

	// Overridden Method
	@Override
	public String generateTicket() {
		// TODO Auto-generated method stub
		UUID uuid = UUID.randomUUID();
		return "CUST-" + uuid.toString();

	}

}
