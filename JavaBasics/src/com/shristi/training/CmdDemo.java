package com.shristi.training;

public class CmdDemo {

	public static void main(String[] args) {
		String name = args[0];
		System.out.println("Name "+name);
		int age = Integer.parseInt(args[1]);
		System.out.println(age);
		String city = args[2];
		System.out.println("City "+city);
		double salary = Double.parseDouble(args[3]);
		System.out.println(salary);
	}
}
