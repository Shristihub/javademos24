package com.oops.encap;

public class Employee {

	private String empName;
	private int empId;
	private double salary;
	private boolean married;
	static String COMPANYNAME = "SHRISTI";
	
	public boolean isMarried() {
		return married;
	}
	public void setMarried(boolean married) {
		this.married = married;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empName:" + empName + ", \nempId=" + empId + ", salary=" + salary + ", married=" + married
				+ "]";
	}
	
	
	
	
	
}
