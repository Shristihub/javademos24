package com.inter.lamb;

class User implements IGreeter{
	@Override
	public void sayHello(String username) {
		System.out.println("Hello "+username);
	}
}

public class AnonyDemo {

	public static void main(String[] args) {
		/// a class that implements the interface
		IGreeter greeter = new User();
		greeter.sayHello("Sri"); //call the method
		
		IGreeter ngreeter = new IGreeter() {
			@Override // just implementation
			public void sayHello(String username) {
				System.out.println("Welcome "+username);
			}
		};
		// call the method
		ngreeter.sayHello("Priya");
		
				
	}
}








