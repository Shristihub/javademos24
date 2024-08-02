package com.shristi.threads;

public class MainThread {
	public static void main(String[] args) {
		// get the thread that runs in this method
		Thread t = Thread.currentThread();
		System.out.println(t); // Thread[main,main,5]
		t.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t.getPriority());
		t.setName("Poppy");
		
		t = Thread.currentThread();
		System.out.println(t); // Thread[main,main,5]
		
		int nums[] = new int[2];
		System.out.println(nums[2]);// AIOOBE

		
		
	}

}
