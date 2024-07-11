package com.oops.override;

public class Triangle extends MyShape {

	@Override
	void area(int x, int y) {
		super.area(x, y);
		System.out.println("Tri " + (0.5 * x * y));
	}

}
