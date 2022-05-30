package com.masai.day09;

public class Student {
	private int roll;
	private String name;
	private char grade;
	private int marks;
	public Student(int roll, String name,char grade, int marks) {
		this.roll = roll;
		this.name = name;
		this.grade = grade;
		this.marks = marks;
	}
	
	public void displayDetails(Student s1) {
		System.out.println("Roll:"+s1.roll);
		System.out.println("Name:"+s1.name);
		System.out.println("marks:"+s1.marks);
		char gr =calculateGrade();
		System.out.println("Grade:"+gr);
//		if(s1.grade)
	}
	
	private char calculateGrade() {
		if(this.marks>500) {
			return 'A';
		}
		else if(this.marks >400 && this.marks <500) {
			return 'B';
		}
		else if(this.marks<400) {
			return 'C';
		}
		else {
			return 'F';
		}
	}

	@Override
	public String toString() {
		return name+"Roll "+roll+"marks "+marks+"Grade "+grade;
	}
	
	
	
}
