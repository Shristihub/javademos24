package com.shristi.threads;

class Child extends Thread{
	String name;
	int priority;
	
	public Child(String name, int priority) {
		this.name = name;
		this.priority = priority;
		this.start();
	}

	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			// 1*10 =10 ; multiplication table of 5
			System.out.println("Hello from "+name+ "  "+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}}}}

public class ExThread {
	public static void main(String[] args) {
		Child t = new Child("Thread-1",2);
		Child t1 =  new Child("Thread-2",4);
	
		System.out.println("in main");
		for(int i=1;i<=10;i++) {
			// 1*5 =5 ; multiplication table of 5
			System.out.println(i+" * 5 = "+(i*5) );
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
				
	}
}
