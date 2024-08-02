package com.exception.throwsd;

public class Bank {

	void withdraw(int amount) throws Exception {
		System.out.println("inside bank");
		try {
			if (amount > 2000) {
				throw new Exception("out of limits");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw e;
		} finally {
			System.out.println("close db");
		}
		System.out.println("Work done");
	}
}
