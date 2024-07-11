package com.oops.stat;
import static java.lang.Math.pow;
import static java.lang.System.out;
public class Trial {

	static int x =10;
	static int y;
	
	public Trial() {
		out.println("Constructor");
	}
	{
		System.out.println("instance block1");
	}
	{
		System.out.println("instance block2");
	}
	static {
		System.out.println(x+y);
		System.out.println("Block1");
		y=100;
	}
	static {
		System.out.println("Sum "+(x+y));
		System.out.println("Block2");
		System.out.println("Greetings");
		x=200;
	}
	static void greet() {
		System.out.println("Welcome");
		System.out.println("Power "+pow(y, 2));
	}
	void print() {
		System.out.println("Product "+(x+y));
		System.out.println("Bye");
	}
	public static void main(String[] args) {
		Trial.greet();
		Trial trial = new Trial();
		trial.print();
		Trial trial1 = new Trial();
		Trial trial2 = new Trial();
		Trial trial3 = new Trial();
		
	}
	

}
