package com.masai.U4C3.ques1;

import java.util.MissingFormatArgumentException;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter size of array");
		int[] arr = new int[scn.nextInt()];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter Number:");
			arr[i]=scn.nextInt();
			
		}
		System.out.println("Enter the index you want");
		try {
			int num =scn.nextInt();
			System.out.println("The array element at index "+num+" ="+arr[num]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		}
		catch(NumberFormatException e) {
			System.out.println("java.lang.NumberFormatException");
		}
		
	}
}
