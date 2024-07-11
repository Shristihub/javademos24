package com.oops.inherit;

public class InEmployee {
	String empName;
	int empId;

	public InEmployee(String empName, int empId) {
		super();
		this.empName = empName;
		this.empId = empId;
	}

	void printDetails() {
		System.out.println(empName + " " + empId);
	}

}
