package com.masai.U4C4.ques4;
import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.Matcher;

public class Demo {
	
	
	public static void main(String[] args) {
		Demo d1 = new Demo();
		Customer c1 = new Customer();
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter User name:");
		String user =scn.next();
		
		System.out.println("Enter Password:");
		String pass =scn.next();
		
		System.out.println("Enter Mobile number:");
		String mobile =scn.next();
		
		System.out.println("Enter Email:");
		String email = scn.next();
		
		c1.setUsername(user);
		c1.setPassword(pass);
		c1.setMobileNumber(mobile);
		c1.setEmail(email);
						System.out.println("UserName:"+c1.getUsername());
				System.out.println("Password:"+c1.getPassword());
				System.out.println("Mobile:"+c1.getMobileNumber());
				System.out.println("Email:"+c1.getEmail());
		
	}

}
