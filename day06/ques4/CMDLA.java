package com.masai.day06.ques4;

public class CMDLA {

	public static void main(String[] args) {
		if(args.length==1) {
			int fact =1;
			int a =Integer.parseInt(args[0]);
			for (int i = 1; i <=a; i++) {
				fact =fact*i;
			}
			System.out.println("Factorial of "+args[0]+" is: "+fact);
		}
		else if(args.length==2) {
			int a =Integer.parseInt(args[0]);
			int b =Integer.parseInt(args[1]);
			System.out.println(Math.abs(a-b));
		}
		else
			System.out.println("Error");

	}

}
