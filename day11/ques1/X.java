package com.masai.day11.ques1;

public interface X {
	abstract void absX();
	
	default void m1DefX() {
		System.out.println("m1DEF FROM X");
	}
	
	static void m2StaticX() {
		System.out.println("m2Static from X");
	}

}
