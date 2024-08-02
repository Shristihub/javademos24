package com.shristi.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ExLambSyncDemo {

	public static void main(String[] args) {
		Bank bank = new Bank();
		final String name = "Ronnie";
		Runnable task1 = ()->{
			bank.calcInterest(name,30000);
		};
		Runnable task2 = ()->{
			bank.payBills(name);
		};
		
		ExecutorService exService =Executors.newFixedThreadPool(10);
		exService.execute(task1);
		exService.execute(task2);
		
	}
}
