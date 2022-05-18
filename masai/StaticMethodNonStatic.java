package com.masai;

// Static-Method: The method which contain Static keyword is called Static Method.

//Non Static-Method:The method which does not contain Static keyword is called Static Method.

 class StaticMethodNonStatic {
	static void m1() {
		System.out.println("m1 from static");
	}
	
	void m2() {
		System.out.println("m2 from Non-Static");
		m1();
	}

	public static void main(String[] args) {
		StaticMethodNonStatic s1 = new StaticMethodNonStatic();
		m1();
		s1.m2();

	}

}
