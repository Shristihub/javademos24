package com.inter.def;

public class EmpMain {

	public static void main(String[] args) {
		IBonusCalculator calculator = new EmployeeDetails();
		calculator.calcInterest(2000);
		calculator.paymentTerms();
		
		ILoanCalculator loanCalc = (ILoanCalculator)calculator;
		loanCalc.calcInterest(200);
		loanCalc.paymentTerms();
		
		IBonusCalculator.showDetails();
		System.out.println(IBonusCalculator.ALLOWANCE);
		System.out.println(IBonusCalculator.MESSAGE);
		
		
	}
}
