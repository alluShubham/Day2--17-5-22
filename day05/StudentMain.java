package com.masai.day05;
import java.util.Scanner;
//Que4-02
public class StudentMain {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter No of Student");
		Student[] s1 = new Student[scn.nextInt()]; scn.nextLine();
//		Student[] s1 = new Student[3];
//		System.out.println(s1.length);
//		s1[0] = new Student();
//		s1[1] = new Student();
//		s1[2] = new Student();
		
		for (int i = 0; i < s1.length; i++) {
			s1[i]= new Student();
//			System.out.println(s1[i]);
		}
		for (int i = 0; i < s1.length; i++) {
			
			System.out.println("Enter Details of Student"+(i+1));
			System.out.println("Enter Name:");
			s1[i].setName(scn.nextLine()); //scn.nextLine();
			
			System.out.println("Enter id:");
			s1[i].setRoll(scn.nextInt());
			
			System.out.println("Enter Marks:");
			s1[i].setMarks(scn.nextInt()); scn.nextLine();
			
			System.out.println("Enter Address:");
			s1[i].setAddress(scn.nextLine());
			

		}
		for (int i = 0; i < s1.length; i++) {
			System.out.println("Details printing of Student"+(i+1));
			System.out.println("Roll:"+s1[i].getRoll());
			System.out.println("Name:"+s1[i].getName());
			System.out.println("Address:"+s1[i].getAddress());
			System.out.println("Marks:"+s1[i].getMarks());
			System.out.println("================================");
		}
	}

}
