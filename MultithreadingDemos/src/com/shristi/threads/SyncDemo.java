package com.shristi.threads;

class RunnerChild implements Runnable{
	Thread t;
	String name;
	double amount;
	Loan loan;
	public RunnerChild(String name,double amount, Loan loan) {
		this.name = name;
		this.amount = amount;
		this.loan =loan;
		t = new Thread(this,name);
		t.start();
	}
	@Override
	public void run() {
		
		synchronized (loan) {
			System.out.println("Hello "+t.getName());
			loan.calcInterest(name, amount);
		}
		System.out.println("Work done.. You are released");
	}
}


public class SyncDemo {

	public static void main(String[] args) {
		Loan loan = new Loan();
		RunnerChild runner1 = new RunnerChild("Joe",20000,loan);
		RunnerChild runner2 = new RunnerChild("Anna",50000,loan);
		RunnerChild runner3 = new RunnerChild("Tom",30000,loan);
		;
	}
}
