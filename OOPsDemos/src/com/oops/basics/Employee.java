package com.oops.basics;

public class Employee {

	String empName; // null
	int empId; // 0

	public Employee(String empName, int empId) {
		this.empName = empName; //ram
		this.empId = empId;
	}

	void printDetails() {
		System.out.println("Name " + empName);
		System.out.println("empId " + empId);
	}

	String greetMessage(String message) {
		return message + empName;
	}
}
