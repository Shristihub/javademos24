package com.inter.basics;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter choice as card/cash/upi");
		String choice = sc.next().toUpperCase();
		PaymentGateway payment;
		switch(choice) {
		 case "CASH":
			 payment = new CashPayment();
			 payment.payBills();
			 break;
		 case "CARD":
			 payment = new CreditPay();
			 payment.payBills();
			 break;
		 case "UPI":
			 payment = new UPIPayment();
			 payment.payBills();
			 break;
		default:
			System.out.println("invalid");
		
		}
		
		
	}
}
