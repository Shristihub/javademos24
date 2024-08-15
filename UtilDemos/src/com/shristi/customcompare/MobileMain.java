package com.shristi.customcompare;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MobileMain {

	public static void main(String[] args) {
		List<Mobile> mobiles = Arrays.asList(
				new Mobile("Nothing","Nx12",80000),
				new Mobile("Iphone","MaxPro",150000),
				new Mobile("Samsung","s24",10000),
				new Mobile("Samsung","s23",120000),
				new Mobile("Poco","PC002",40000)
		);
		System.out.println("Before Sorting");
		for (Mobile mobile : mobiles) {
			System.out.println(mobile);
		}
		
		System.out.println("Sort by brand");
		Collections.sort(mobiles, new BrandSort());
		for (Mobile mobile : mobiles) {
			System.out.println(mobile);
		}
		System.out.println("Sort by Model");
		Collections.sort(mobiles, new ModelSort());
		for (Mobile mobile : mobiles) {
			System.out.println(mobile);
		}
		System.out.println("Sort by Price");
		Collections.sort(mobiles, new PriceSort());
		for (Mobile mobile : mobiles) {
			System.out.println(mobile);
		}
	}
	
}
