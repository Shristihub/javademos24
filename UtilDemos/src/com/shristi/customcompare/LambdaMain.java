package com.shristi.customcompare;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaMain {

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
		Comparator<Mobile> brandsort = (o1, o2)->{
			return o1.getBrand().compareTo(o2.getBrand());
		};
//		Collections.sort(mobiles,brandsort);	
		Collections.sort(mobiles,(o1, o2)->{
			return o1.getBrand().compareTo(o2.getBrand());
		});
		for (Mobile mobile : mobiles) {
			System.out.println(mobile);
		}
		System.out.println("Sort by Model");
		Collections.sort(mobiles,(o1,o2)->o2.getModel().compareTo(o2.getModel()));
		for (Mobile mobile : mobiles) {
			System.out.println(mobile);
		}
		
		System.out.println("Sort by Price");
		Collections.sort(mobiles,(o1,o2)->((Double)o1.getPrice()).compareTo(o2.getPrice()));
		
		for (Mobile mobile : mobiles) {
			System.out.println(mobile);
		}
	}
	
}
