package com.oops.inherit;

public class InheritaMain {

	public static void main(String[] args) {
		InEmployee inEmployee = new InEmployee("Ram",10);
		inEmployee.printDetails();
		
		InManager manager = new InManager("John",20,2000);
		manager.printDetails();
		manager.calcBonus(2000);
	}
}
