package com.masai.day04;

public class Demo {
	public Demo() {
		System.out.println("Hello from Zero constructor");
	}
	public Demo(String s) {
		System.out.println("Hello from String Param constructor");
	}
	public Demo(int i) {
		System.out.println("Hello from Integer param constructor");
	}
	
	public Demo(float f) {
		System.out.println("Hello from Float param constructor");
	}
	
	public static void main(String[] args) {
		Demo d1 = new Demo();
		Demo d2 = new Demo("Allu");
		Demo d3 = new Demo(25000);
		Demo d4 = new Demo(10f);
	}

}
