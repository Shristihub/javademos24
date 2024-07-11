package com.oops.abs;

final public class Branch1 extends Bank {
	int num = 1000;

	@Override
	void eduLoan() {
		System.out.println("edu loan in branch1");
	}

	@Override
	void carLoan() {
		System.out.println("car loan in branch1");
	}

	@Override
	void housingLoan() {
		System.out.println("housing loan in branch1");
	}
	
	void payBills() {
		System.out.println("Bills of branch1");
	}

}


