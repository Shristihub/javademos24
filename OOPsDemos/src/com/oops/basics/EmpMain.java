package com.oops.basics;

public class EmpMain {

public static void main(String[] args) {
		
		Employee employee = new Employee("Ram",10);
		employee.printDetails();
		String result = employee.greetMessage("Great day");
		System.out.println(result);
		
		Employee employee1 = new Employee("Sri",20);
		employee1.printDetails();
		System.out.println(employee1.greetMessage("Welcome back"));		
		
		
	}

}
