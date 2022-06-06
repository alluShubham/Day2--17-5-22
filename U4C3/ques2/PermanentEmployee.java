package com.masai.U4C3.ques2;

public class PermanentEmployee extends Employee {
	
	private double basicPay;

	public PermanentEmployee(int employeeId, String employeeName,double basicPay) {
		super(employeeId, employeeName);
		// TODO Auto-generated constructor stub
	}

	@Override
	void calculateSalary() {
		double PFAmount = basicPay *(0.12);
		this.salary =basicPay-PFAmount;
		
	}

}
