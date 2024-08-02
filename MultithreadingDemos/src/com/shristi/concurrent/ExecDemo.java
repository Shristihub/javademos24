package com.shristi.concurrent;

import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ExecDemo {

	public static void main(String[] args) {
		// implement Runnable using Lambda expression
		Runnable runner =  ()->{
			System.out.println("Show:  " + Thread.currentThread().getName());
		};
		
		
		// low level
//		for (int i = 0; i < 4; i++) {
//			Thread t = new Thread(()->{
//				System.out.println("show");
//			},"Poppy");
//			t.start();
//		}

//		Using Executors
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		for (int i = 0; i < 50; i++) {
			executorService.execute(()->{
				System.out.println("show "+Thread.currentThread());
			});
		}
		
		
		
		
		

	}
}
