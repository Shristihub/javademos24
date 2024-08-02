package com.exception.chain;

public class Trial {

	public static void main(String[] args)throws Exception {
		System.out.println("welcome");
		A.m1();
		System.out.println("work done");
	}
}
class A{
	static void m1(){
		System.out.println("In class A");
		try {
			B.m2();
		} catch (Exception e) {
		 System.out.println(e.getMessage());
		}
		System.out.println("completed A");
	}
}

class B{
	static void m2() throws Exception {
		System.out.println("In class B");
		C.m3();
		System.out.println("completed B");
	}
}
class C{
	static void m3() throws Exception{
		System.out.println("In class C");
		int x =10;
        if(x==10) {
        	throw new Exception(".......invalid.....");
        }
		System.out.println("completed C");
	}
}

