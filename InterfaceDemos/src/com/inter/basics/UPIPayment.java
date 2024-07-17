package com.inter.basics;

public class UPIPayment implements PaymentGateway {

	@Override
	public void payBills() {
		System.out.println("payment using UPI");
	}

}
