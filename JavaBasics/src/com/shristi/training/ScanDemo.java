package com.shristi.training;

import java.util.Scanner;

public class ScanDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		System.out.println("Name "+name);
		int age = scanner.nextInt();
		System.out.println("Age "+age);
		scanner.nextLine();
		String city = scanner.nextLine();
		System.out.println("City "+city);
		double salary = scanner.nextDouble();
		System.out.println("Salary"+salary);
//		scanner.close();
	}
}
