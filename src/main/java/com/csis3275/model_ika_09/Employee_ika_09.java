/**
 * 
 */
package com.csis3275.model_ika_09;

/**
 * 
 */
import java.util.Random;
import java.util.UUID;

public class Employee_ika_09 extends Person_ika_09 implements GenerateTicket_ika_09 {
	// Constructor
	public Employee_ika_09(String name) {
		super(name);
		generateEmployeeID();
		calculateMonthlySalary();
	}

	// Properties
	public String employeeID;
	public double monthlySalary;

	// Non-trivial Methods
	public void calculateMonthlySalary() {
		double salary = 28.95;
		this.monthlySalary = salary*120;
		
	}

	public void generateEmployeeID() {
		Random random = new Random();
		int id = random.nextInt(500, 900);
		employeeID = "#EMP" + String.valueOf(id);

	}

	@Override
	public String generateTicket() {
		// TODO Auto-generated method stub
		UUID uuid = UUID.randomUUID();
		return "EMP-" + uuid.toString();
	}

}
