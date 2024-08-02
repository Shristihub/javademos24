package com.shristi.threads;

class Runner implements Runnable{
	Thread t;
	String name;
	double amount;
	public Runner(String name,double amount) {
		this.name = name;
		this.amount = amount;
		t = new Thread(this,name);
		t.start();
	}

	@Override
	public void run() {
		System.out.println("Hello "+t.getName());
		Loan loan = new Loan();
		loan.calcInterest(name, amount);
		
		
	}
	
}


public class Runthread {

	public static void main(String[] args) {

		Runner runner1 = new Runner("Joe",20000);
		Runner runner2 = new Runner("Anna",50000);
		Runner runner3 = new Runner("Tom",30000);
		;
	}
}
