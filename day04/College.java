package com.masai.day04;

public class College {
	public static void main(String[] args) {
		Student s1 = new Student();
		
		s1.setAge(25);
		s1.setRoll(20);
		s1.setName("Allu");
		s1.setMarks(500);
		
		System.out.println("Details of Zero constructor ");
		s1.showDetails();
		
		Student s2 = new Student(21,"Arjun",26,90);
		System.out.println("Details of Parameterised constructor ");

		s2.showDetails();
	}
}
