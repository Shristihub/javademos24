package com.inter.basics;

public class DebitPay extends CardPayment{

	@Override
	public void payBills() {
		System.out.println("using debit card");
	}

}
