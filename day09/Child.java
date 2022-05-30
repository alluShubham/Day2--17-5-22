package com.masai.day09;

public final class Child extends Parent {
	
	public void m4() {
		System.out.println("M4 from Chlid class");
	}
	
	

	@Override
	public void m1() {
		System.out.println("M1 from Child class");
	}

	@Override
	public void m3() {
		System.out.println("M3 from Child class");
	}

	public static void main(String[] args) {
		Parent p1 = new Child();
		p1.m1();
		p1.m2();
		p1.m3();
		
		Child p2 = (Child)p1;
		p2.m4();
	}

}
