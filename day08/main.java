package com.masai.day08;

public class main {

	public static void main(String[] args) {
		Bird b1 = new Parrot();
		b1.fly();
		Parrot p1 =(Parrot)b1;
		p1.sing();

	}

}
