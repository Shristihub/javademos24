package com.inter.basic;

public class Car extends Vehicle{
	int seaterCapacity;

	public Car(String brand, String model, double price, int seaterCapacity) {
		super(brand, model, price);
		this.seaterCapacity = seaterCapacity;
	}

	@Override
	public void insurType() {
		System.out.println("For vehicles and human");
	}
	@Override
	public void insurProviders() {
		System.out.println("Star Insurance & Tata AIG");
	}
	@Override
	public String[] showAccessories() {
		String[] accessories = new String[] {"seat cover","rear a/c","music"};
		return accessories;
	}

	@Override
	void getMileage() {
		System.out.println("good mileage");
	}
	// own method
	void showCarType(String type) {
		if(type.equals("SUV")) {
			System.out.println("luxury car");
			System.out.println("seater "+seaterCapacity);
		}else if(type.equals("SEDAN")) {
			System.out.println("comfort car");
			System.out.println("seater "+seaterCapacity);
		}else 
			System.out.println("not available");
		
	}

	
}
