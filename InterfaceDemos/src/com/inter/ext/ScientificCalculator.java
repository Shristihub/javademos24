package com.inter.ext;

public class ScientificCalculator implements IScientific{

	@Override
	public void add(int x, int y) {
		
	}

	@Override
	public void product(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void square(int x) {
		System.out.println(Math.pow(x, 2));
	}

	@Override
	public void cube(int x) {
		System.out.println(Math.pow(x, 3));
	}

}
