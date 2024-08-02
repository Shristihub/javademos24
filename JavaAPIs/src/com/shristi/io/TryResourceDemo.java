package com.shristi.io;

public class TryResourceDemo {

	public static void main(String[] args) {
		MyResource resource= new MyResource();
		resource.check();
		try {
			resource.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		try(MyResource resource1 = new MyResource();){
			resource1.check();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
