package com.masai.day11.ques1;

public interface Y {
	abstract void absY();
	
	default void m1DefY() {
		System.out.println("m1DEF FROM Y");
	}
	
	static void m2StaticY() {
		System.out.println("m2Static from Y");
	}
	
//	public void m3();
	
}
