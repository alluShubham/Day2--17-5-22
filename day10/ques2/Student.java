package com.masai.day10.ques2;

public abstract class Student {
	String name;
	String address;
	abstract int getPercentage( );
	public Student(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	

}
