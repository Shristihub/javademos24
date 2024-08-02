package com.shristi.threads;

public class SleepDemo {

	public static void main(String[] args) {

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


//static void sleep(long ms) throws interruptedexception