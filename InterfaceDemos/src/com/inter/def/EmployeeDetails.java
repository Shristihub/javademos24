package com.inter.def;

public class EmployeeDetails implements IBonusCalculator,ILoanCalculator{
	@Override
	public void calcInterest(double amount) {
		System.out.println("Interest "+(amount/2));
		
	}
 // two interfaces having same default method, then override it
	@Override
	public void paymentTerms() {
		System.out.println("in employee details");
		System.out.println("3 months");
		ILoanCalculator.super.paymentTerms();
		IBonusCalculator.super.paymentTerms();
	}

	

}
