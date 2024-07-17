package com.inter.def;

public interface ILoanCalculator {
	void calcInterest(double amount);
	default void paymentTerms() {
		System.out.println("12 months");
	}
}
