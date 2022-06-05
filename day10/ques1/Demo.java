package com.masai.day10.ques1;
import java.util.Scanner;

public class Demo {
	
	public Hotel provideFood(int amount) {
		if(amount > 1000) {
			return new TajHotel();
		}
		else if(amount >200 && amount <=1000) {
			return new RoadSideHotel();
		}
		else {
			System.out.println("Please enter amount greater than 200");
			return null;
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Demo d1 = new Demo();
		System.out.println("Please enter amount =>");
		Hotel h1 = d1.provideFood(scn.nextInt());
		
		if(h1 instanceof  TajHotel) {
		h1.chickenBiryani();
		h1.masalaDosa();
		TajHotel th = (TajHotel)h1;
		th.welcomeDrink();
		}
		
		h1.chickenBiryani();
		h1.masalaDosa();
		

	}

}
