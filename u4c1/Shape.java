package com.masai.u4c1;

public class Shape {
//	Circle circle =new Circle();
	
	public void area(Circle circle) {
		
		System.out.println("from circle");
	}
	
	public void area(Rectangle rectangle) {
		System.out.println("from rect");
	}
	public void area(Square square) {
		System.out.println("from square");
	}

}

class Circle{
	int radius;
	
}
class Rectangle {
	int length; 
	int breadth;
}
class Square{
	int side;
}
