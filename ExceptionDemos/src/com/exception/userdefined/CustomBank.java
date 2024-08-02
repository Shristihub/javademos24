package com.exception.userdefined;

public class CustomBank {
	double balance;
	
	public CustomBank(double balance) {
		super();
		this.balance = balance;
	}

	void withdraw(int amount) throws NegativeBalanceException,OutOfLimitsException,Exception {
		System.out.println("inside bank");
		try {
			double total = balance-amount;
			if(total<=0) {
				throw new NegativeBalanceException("balance is negative");
			}
			if(amount>8000)
				throw new OutOfLimitsException("amount should be less than 8000");
			
			balance-=amount;
			System.out.println("Balance "+balance);
		} catch (NegativeBalanceException e) {
			System.out.println(e.getMessage()+ " in server");
			throw e;
		} catch (OutOfLimitsException e) {
			System.out.println(e.getMessage()+ " in server");
			throw e;
		}catch(Exception e) {
			System.out.println("other exception");
			throw e;
		}finally {
			System.out.println("close database");
		}
		
		System.out.println("Work done");
	}

}
