package com.productapp.util;

import java.util.Arrays;
import java.util.List;
import com.productapp.model.Product;

public class ProductUtil {

	public static List<Product> showProducts(){
		return Arrays.asList(
			new Product("Mobile",1,"OnePlus",40000,"Gadgets"),
			new Product("Laptop",2,"Dell",140000,"Electronics"),
			new Product("Headphones",3,"OnePlus",4000,"Gadgets"),
			new Product("Pencils",4,"Camlin",100,"Stationary"),
			new Product("Crayons",5,"Camlin",320,"Stationary"),
			new Product("Webcam",6,"Logitech",1400,"Gadgets")
			
				);
				
	}
}
