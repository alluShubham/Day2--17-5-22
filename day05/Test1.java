package com.masai.day05;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Id:");
		int eID =scn.nextInt(); scn.nextLine();
		System.out.println(eID);
		System.out.println("Enter Name:");
		String eName =scn.nextLine();
		System.out.println(eName);
		System.out.println("Enter Salary");
		double eSal =scn.nextDouble();
		System.out.println(eSal);
		System.out.println("Enter PF percentage:");
		int ePF =scn.nextInt();
		scn.close();
		
		Employee e2 = new Employee();
		Employee details =e2.getEmployeeDetails(e2,eID, eName, eSal);
//		System.out.println(details.employeeId);
		
		int pF =e2.getPFPercentage(ePF);
		
		e2.calculateNetSalary(pF);
	}

}
