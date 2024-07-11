package com.oops.abs;

public class SubBranch extends Branch2{

	@Override
	void carLoan() {
		System.out.println("car loan in subbranch");		
	}
	
   @Override
	void eduLoan() {
	   System.out.println("edu loan in subbranch - 8%");
	}

void chequePayment() {
	   System.out.println("Payment in subbranch");
   }
	
}
