package com.shristi.io;

import java.io.Serializable;

public class Employee implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	private String empName;
	private int empId;
	private String department;
	public Employee() {
		super();
	}
	public Employee(String empName, int empId, String department) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", department=" + department + "]";
	}
	
	
}
