package com.shristi.threads;

public class Loan {

	void calcInterest(String name, double amount)  {
		System.out.println("Welcome to ABC bank "+name);
		System.out.println("calculating interest "+amount);
		double interest = (amount*2*5)/100;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Interest "+interest);
	}
}
