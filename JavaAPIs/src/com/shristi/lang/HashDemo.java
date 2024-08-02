package com.shristi.lang;

public class HashDemo {

	public static void main(String[] args) {
		Mobile mobile1 = new Mobile("Samsung","S24","black");
		Mobile mobile2 = new Mobile("Samsung","S24","silver");
		Mobile mobile3 = new Mobile("Samsung","A124","black");
		
		System.out.println(mobile1);
		System.out.println(mobile2);
		System.out.println(mobile3);
		
		System.out.println(mobile1.equals(mobile2));
		System.out.println(mobile1.equals(mobile3));
		System.out.println(mobile3.equals(mobile2));
		
		System.out.println(mobile1.hashCode());
		System.out.println(mobile2.hashCode());
		System.out.println(mobile3.hashCode());
		
		System.out.println(Integer.toString(555,2));
		System.out.println(Integer.toBinaryString(11));
		
	}
}
