package com.oops.override;

public class Square extends MyShape {

	@Override
	void area(int x, int y) {
		
		System.out.println("Sq " + ( x * x));
		super.area(x, y); // to call the method of superclass
	}

}