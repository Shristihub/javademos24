package com.oops.abs;

public abstract class Bank {
	public final int BONUS = 1000;
	int num = 900;
	abstract void eduLoan();
	abstract void carLoan();
	abstract void housingLoan();
	final void admin() {
		System.out.println("Admin detailss");
		
	}
}
