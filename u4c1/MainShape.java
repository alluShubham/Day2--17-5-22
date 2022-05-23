package com.masai.u4c1;

public class MainShape {
	
	public static void main(String[] args) {
		Square square =new Square();
		Circle circle = new Circle();
		Rectangle rect = new Rectangle();
		Shape sh = new Shape();
		sh.area(new circle);
		sh.area(Rectangle rect);
		sh.area(Square square);
	}

}
