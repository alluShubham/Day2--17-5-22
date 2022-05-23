//Create a class Course with 3 instance variables:




package com.masai.u4c1;

import java.util.Scanner;

public class Course {
	int courseId;
	String courseName;
	int courseFee;
	
	public void displayCourseDetails() {
		System.out.println("Course Id:"+courseId);
		System.out.println("Course Name:"+courseName);
		System.out.println("Course Fee:"+courseFee);
	}
	public static void authenticate(String username, String password) {
		if(username=="Admin" && password=="1234" ) {
			Course c1 = new Course();
			Scanner scn = new Scanner(System.in);
			System.out.println("Enter Course Id");
			c1.courseId=scn.nextInt();
			
			System.out.println("Enter Course Name");
			c1.courseName=scn.nextLine(); scn.nextLine();
			
			System.out.println("Enter Course Fee");
			c1.courseFee=scn.nextInt();
			
			c1.displayCourseDetails();
		}
		else {
			System.out.println("Invalid Username or password");
		}
	}
	
	public static void main(String[] args) {
		authenticate("Admin","1234");
		authenticate("Admin","1235");
	}
}
