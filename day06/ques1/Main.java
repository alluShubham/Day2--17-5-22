package com.masai.day06.ques1;

import java.util.Scanner;

public class Main {
	public static String reversString(String input){
		char[] ch = input.toCharArray();
		String str = "";
		 for (int i =ch.length-1; i >=0 ; i--) {
//	            ch[i] = input.charAt(i);
			 str = str + ch[i];
	        }
		return str;
		}
		public static void main(String[] args){
			
			
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a String to reverse");
		String orignalString = scn.next();
		String result = Main.reversString(orignalString);
//		System.out.println("Original String is :"+ originalString);
		System.out.println("Reversed String is :"+ result);
		}
}
