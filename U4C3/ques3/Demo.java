package com.masai.U4C3.ques3;
import java.util.Scanner;

public class Demo {
	
	void showDetails(Month m){
		if(Month.JAN == m) {
			System.out.println("This is the 1st Month of the Year January");
		}
		else if(Month.FEB ==m) {
			System.out.println("This is the 2nd Month of the Year February");
		}
		else if(Month.MAR ==m) {
			System.out.println("This is the 3rd Month of the Year March");
		}
		else if(Month.APR ==m) {
			System.out.println("This is the 4th Month of the Year April");
		}
		else if(Month.MAY ==m) {
			System.out.println("This is the 5th Month of the Year May");
		}
		else if(Month.JUN ==m) {
			System.out.println("This is the 6th Month of the Year June");
		}
		else if(Month.JUL ==m) {
			System.out.println("This is the 7th Month of the Year July");
		}
		else if(Month.AUG ==m) {
			System.out.println("This is the 8th Month of the Year August");
		}
		else if(Month.SEP ==m) {
			System.out.println("This is the 9th Month of the Year September");
		}
		else if(Month.OCT ==m) {
			System.out.println("This is the 10th Month of the Year October");
		}
		else if(Month.NOV ==m) {
			System.out.println("This is the 11th Month of the Year November");
		}
		else if(Month.DEC ==m) {
			System.out.println("This is the 12th Month of the Year December");
		}
		else {
			System.out.println("Invalid Month Name");
		}
	}
	
	public static void main(String[] args) {
		Demo d1 = new Demo();
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the month name:");
		
		String name =scn.next();
		
		Month m = Month.valueOf(name);
		
		d1.showDetails(m);
	}
}
