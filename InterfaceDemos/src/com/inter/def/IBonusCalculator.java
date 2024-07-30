package com.inter.def;

public interface IBonusCalculator {
	String MESSAGE ="Great Day";
	double ALLOWANCE=2300;
	void calcInterest(double amount);
	default void paymentTerms() {
		System.out.println("6 months");
	}
	static void showDetails() {
		System.out.println("Bonus Calculator of employess");
	}
}

interface Greeter{
	String greetMessage(String username);
}