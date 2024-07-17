package com.inter.basic;

public abstract class Vehicle implements Insurance, Accessories{
	private String brand;
	private String model;
	private double price;
	public Vehicle(String brand, String model, double price) {
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	public void printDetails() {
		System.out.println("Brand "+brand);
		System.out.println("Model "+model);
		System.out.println("Price "+price);
	}
	abstract void getMileage();
}
