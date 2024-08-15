package com.streams.basic;

public class Employee {

	private String name;
	private int empId;
	private String desg;
	private String city;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, int empId, String desg, String city) {
		super();
		this.name = name;
		this.empId = empId;
		this.desg = desg;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + ", desg=" + desg + ", city=" + city + "]";
	}
	
	
}
