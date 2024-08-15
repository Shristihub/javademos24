package com.streams.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class EmpMain {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
				new Employee("Jo", 10, "Manager", "Bengaluru"),
				new Employee("Tom", 11, "Manager", "Bengaluru"), 
				new Employee("Jerry", 12, "Tester", "Bengaluru"),
				new Employee("John", 13, "Manager", "Bengaluru"),
				new Employee("Anna", 14, "Manager", "Bengaluru"),
				new Employee("Emily", 15, "Manager", "Bengaluru"), 
				new Employee("Denver", 16, "Developer", "Chennai"));
		List<Employee> employeesByCity = new ArrayList<Employee>();
		for (Employee employee : employees) {
			if (employee.getCity().equals("Bengaluru"))
				employeesByCity.add(employee);
		}
		System.out.println(employeesByCity);
		System.out.println(employeesByCity.size());

		List<Employee> employeesByDesg = new ArrayList<Employee>();
		for (Employee employee : employeesByCity) {
			if (employee.getDesg().equals("Manager"))
				employeesByDesg.add(employee);
		}
		System.out.println(employeesByDesg);
		System.out.println(employeesByDesg.size());
		
		List<String> empNames = new ArrayList<String>();
		for(Employee employee:employeesByDesg) {
			empNames.add(employee.getName());
		}
		System.out.println(empNames);
		System.out.println(empNames.size());
		Collections.sort(empNames);
		System.out.println(empNames);
		
	}
}
