package com.masai.day04;

public class Student {
	private int roll;
	private String name;
	private int age;
	private int marks;
	
	public Student() {
	}
	
	public Student(int roll,String name, int age, int marks) {
		this.roll =roll;
		this.name =name;
		this.age =age;
		this.marks =marks;
	}
	
	public void setRoll(int roll) {
		this.roll =roll;
	}
	public int getRoll() {
		return roll;
	}
	
	public void setAge(int age) {
		if(age >18 && age <60) {
			this.age =age;
		}
	}
	
	public void setName(String name){
		this.name=name; 
		} 
	
	public String getName(){
		return name;
		}
	
	public void setMarks(int marks){
		if(marks >0 && marks <=500) {
			this.marks= marks;
		}
		}
	
	public int getMarks(){
		return marks;
		}
	
	void showDetails() {
		System.out.println("Name arr:"+name);
		System.out.println("Age are:"+age);
		System.out.println("Roll are:"+roll);
		System.out.println("Marks are"+marks);
	}
	
}
