package com.oops.override;

public class Rectangle extends MyShape {

	@Override
	void area(int x, int y) {
		System.out.println("Rect "+(x*y));
		super.area(x, y);
	}
	
	void perimeter(int x, int y) {
		System.out.println("Peri "+(2*(x+y)));
	}
}
