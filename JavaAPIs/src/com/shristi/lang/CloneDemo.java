package com.shristi.lang;

public class CloneDemo {

	public static void main(String[] args) {
		Student student = new Student("Raju","CSE",1);
		Student clonedStud = null;
		try {
		   clonedStud = student.clone();
			System.out.println(clonedStud);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println(clonedStud.getClass());
		System.out.println(student==clonedStud);
		System.out.println(student.getClass()==clonedStud.getClass());
	}
}
