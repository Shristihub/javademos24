package com.exception.throwsd;

public class ATMDemo {

	public static void main(String[] args) throws Exception{
		System.out.println("welcome");
		Bank bank = new Bank();
		
//			try {
				bank.withdraw(8000);
				System.out.println("Amount withdrawn successfully");
//			} catch (Exception e) {
//				System.out.println("tech error");
//			}
			
		
		System.out.println("good bye");
		}
	}

