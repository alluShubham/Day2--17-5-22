package com.masai;

public class PrimeFactorial {
	static void checkFact(int n) {
		if(n <2 || n>100) {
			System.out.println("Invalid number");
		}
		else {
//			int fact =0;
			for(int i=1; i<=n; i++) {
				if(n%i==0) {
					System.out.println(i);
				}
			}
		}
	}
	public static void main(String[] args) {
		checkFact(12);
		
	}

}
