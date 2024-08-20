package com.inter.methref;

import java.util.function.Consumer;

public class MethRefDemo {

	public static void main(String[] args) {
		// impl using Lambda
		InGreeter greeter = name->System.out.println("Hello "+name);
		// call
		greeter.sayHello("Sri");
		
		Trial obj = new Trial();
		//impl using method references
		// referring to a non-static method
		InGreeter greeter1 = obj::welcomeUser;
		//call
		greeter1.sayHello("Priya");
		
		//impl using method references
		// referring to a static method
		InGreeter greeter2 = Trial::printName;
		//call
		greeter2.sayHello("Sera");
		
		Consumer<String> con = str->System.out.println("Hello "+str.toUpperCase());
		con.accept("Priya");
		
		con = System.out::println;
		con.accept("Ronnie");
		
				
		
		
	}
}
