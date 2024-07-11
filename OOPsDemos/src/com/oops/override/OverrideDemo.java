package com.oops.override;

public class OverrideDemo {

	public static void main(String[] args) {

		MyShape myShape = new MyShape();
		myShape.area(1, 2);
		myShape = new Square();
		myShape.area(2, 2);
		
		
		long x=10;
		myShape = new Rectangle();
		myShape.area(20, 80);
	
		myShape = new Triangle();
		myShape.area(30, 40);
		
		int y = (int)x;
		Rectangle rect = (Rectangle)myShape;
		rect.perimeter(90, 90);
		
		
		
		
	}

}
