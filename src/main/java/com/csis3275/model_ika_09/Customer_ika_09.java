package com.csis3275.model_ika_09;

import java.util.Random;
import java.util.UUID;

public class Customer_ika_09 extends Person_ika_09 implements GenerateTicket_ika_09 {
	// Constructor
	public Customer_ika_09(String name) {
		super(name);
		generateCustomerID();
		calculateStoreCredit();
	}

	// Properties
	public String customerID;
	public double storeCredit;

	// Trivial Methods
	public void generateCustomerID() {
		Random random = new Random();
		int id = random.nextInt(100, 400);
		this.customerID = "#CUST" + String.valueOf(id);

	}

	public void calculateStoreCredit() {
		final double CREDIT_PERCENTAGE = 0.05;
		Random random = new Random();
		double purchaseAmount = random.nextDouble(200, 900);
		this.storeCredit = purchaseAmount * CREDIT_PERCENTAGE;

	}

	// Overridden Method
	@Override
	public String generateTicket() {
		// TODO Auto-generated method stub
		UUID uuid = UUID.randomUUID();
		return "CUST-" + uuid.toString();

	}

}
