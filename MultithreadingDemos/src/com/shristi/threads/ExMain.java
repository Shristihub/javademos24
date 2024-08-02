package com.shristi.threads;

class ChildOne extends Thread {
	String name;
	int priority;
	double amount;

	public ChildOne(String name, int priority, double amount) {
		this.name = name;
		this.priority = priority;
		this.amount = amount;
		this.start();
	}

	@Override
	public void run() {
		System.out.println("Thread name ..." + name);
		Loan loan = new Loan();
		loan.calcInterest(name, amount);

	}
}

public class ExMain {
	public static void main(String[] args) {
		ChildOne t = new ChildOne("Ronnie", 2, 30000);
//		ChildOne t1 =  new ChildOne("Helen",4,50000);

		System.out.println("in main");
		Loan loan = new Loan();
		loan.calcInterest("Joe", 20000);

	}
}
