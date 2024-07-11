package com.oops.encap;

public class EmpMain {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setEmpName("Raj");
		employee.setEmpId(10);
		employee.setSalary(2000);
		System.out.println(employee.toString());
		System.out.println(employee.COMPANYNAME);
		System.out.println(Employee.COMPANYNAME);
		
	}
}
