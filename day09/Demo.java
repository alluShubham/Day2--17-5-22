package com.masai.day09;

public class Demo {
	public static void main(String[] args) {
		Student d1 = new Student (10,"aa",'A',600);
		d1.displayDetails(d1);
//		System.out.println(d1);
//		Student s1 = new Student();
		Student d2 = new Student (11,"Allu",'A',700);
		d1.displayDetails(d2);
	}

}
