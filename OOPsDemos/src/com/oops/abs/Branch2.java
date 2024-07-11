package com.oops.abs;

public abstract class Branch2 extends Bank{

	@Override
	void eduLoan() {
		System.out.println("edu loan in branch2 - 10%");		
	}

	@Override
	void housingLoan() {
		System.out.println("housing loan in branch2");		
	}

	void showBills() {
		System.out.println("bills in branch2 ");
	}
}
