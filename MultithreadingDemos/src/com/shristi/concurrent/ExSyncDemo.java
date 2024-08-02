package com.shristi.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class RunnerChild implements Runnable{
	String name;
	double amount;
	Bank bank;
	public RunnerChild(String name,double amount, Bank bank) {
		this.name = name;
		this.amount = amount;
		this.bank =bank;
		
	}
	@Override
	public void run() {
		
		synchronized (bank) {
			System.out.println("Hello "+name);
			bank.calcInterest(name, amount);
		}
		System.out.println("Work done.. You are released");
		System.out.println();
	}
}


public class ExSyncDemo {

	public static void main(String[] args) {
		Bank bank = new Bank();
		RunnerChild runner1 = new RunnerChild("Joe",20000,bank);
		RunnerChild runner2 = new RunnerChild("Anna",50000,bank);
		
		ExecutorService exService =Executors.newFixedThreadPool(10);
		exService.execute(runner1); // thread created and given to execute tasks
		exService.execute(runner2);  //this is the task
		exService.execute(new RunnerChild("Tom",30000,bank));
		
	}
}
