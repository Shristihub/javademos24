package com.exception.userdefined;

public class CustomATM {

	public static void main(String[] args) {
		System.out.println("welcome");
		CustomBank bank =new CustomBank(4000);
		try {
			bank.withdraw(9000);
			System.out.println("amount withdrawn successfully");
		} catch (NegativeBalanceException e) {
			System.out.println(e.getMessage()+ "...");
		} catch (OutOfLimitsException e) {
			System.out.println(e.getMessage()+ "...");
		} catch (Exception e) {
			System.out.println(e.getMessage()+ "...");
		}
		
		System.out.println("good bye");
		}
	}

