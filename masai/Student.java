package com.masai;

class Student {
	int roll;
	String name;
	int marks;
	void displayStudentDetails() {
		System.out.println("Roll is :"+roll);
		System.out.println("Name is :"+name);
		System.out.println("Marks is :"+marks);
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		s1.roll=10;
		s1.name="Allu";
		s1.marks=50;
		s1.displayStudentDetails();
		
		s2.roll=11;
		s2.name="Arjun";
		s2.marks=45;
		s2.displayStudentDetails();

	}

}
