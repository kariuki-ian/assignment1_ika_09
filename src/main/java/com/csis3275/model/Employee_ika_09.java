package com.csis3275.model;

import java.util.Random;
import java.util.UUID;

public class Employee_ika_09 extends Person_ika_09 implements GenerateTicket_ika_09 {
	// Constructor
	public Employee_ika_09(String name) {
		super(name);
	}

	// Properties
	private String employeeID;
	private double salary;

	// Non-trivial Methods
	public double calculateMonthlySalary() {
		double monthlySalary = this.salary * 120;
		return monthlySalary;
	}

	public String generateEmployeeID() {
		Random random = new Random();
		int id = random.nextInt(500, 900);
		this.employeeID = "#EMP" + String.valueOf(id);
		return this.employeeID;
	}

	@Override
	public String generateTicket() {
		// TODO Auto-generated method stub
		UUID uuid = UUID.randomUUID();
		return "EMP-" + uuid.toString();		
	}

}
