package com.inter.ext;

public class CalcMain {

	public static void main(String[] args) {

		ICalculator calc = new ScientificCalculator();
		calc.add(1, 20);
		calc.product(20, 40);
		
	   IScientific scientific = (IScientific)calc;
	   scientific.cube(3);
	   scientific.square(4);
	   
				
	}

}
