package com.masai;

public class SumOfNaturalNumber {
	static int sum=0;
	static void sumNatural(int num) {
//		sum =20;
	sum = (num*(num+1))/2;
	System.out.println(sum);
	}
	public static void main(String[] args) {
		System.out.println("main");
		sumNatural(5);
	}

}
