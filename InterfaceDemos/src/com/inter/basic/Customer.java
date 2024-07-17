package com.inter.basic;

public class Customer {

	public static void main(String[] args) {
		Vehicle vehicle =new Car("Honda", "City", 121902.90, 4);
		vehicle.printDetails();
		vehicle.getMileage();
		vehicle.insurProviders();
		vehicle.insurType();
		String[] accessories = vehicle.showAccessories();
		for (String access : accessories) {
			System.out.println(access);
		}
		
		// to call the own method
		Car car = (Car)vehicle;
		car.showCarType("sedan".toUpperCase());
		
	}
}
