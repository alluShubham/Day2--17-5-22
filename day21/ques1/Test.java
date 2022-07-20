package com.masai.day21.ques1;

public class Test {
	public static void main(String[] args) {
		Thread th = new Thread(new Calculate());
		th.start();
		System.out.println("main");
	}

}
