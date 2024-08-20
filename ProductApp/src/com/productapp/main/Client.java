package com.productapp.main;

import java.util.List;
import java.util.function.Predicate;

import com.productapp.model.Product;
import com.productapp.service.IProductService;
import com.productapp.service.ProductServiceImpl;
import com.productapp.util.ProductUtil;

public class Client {

	public static void main(String[] args) {
//
//		List<Product> products =  ProductUtil.showProducts();
////		Consumer<Product> con = (product)-> System.out.println(product);
////		Consumer<Product> con = System.out::println;
//		
//		products.forEach(product->System.out.println(product.getProductName()));
//		System.out.println();
//		products.forEach(System.out::println);
//		
//		System.out.println();
//		System.out.println("Get By brand");
//		
//		products.stream()
//		        .filter(product->product.getBrand().equals("Camlin"))
//		        .limit(1)
//				.forEach(System.out::println);	
//		
		// interface ref =  implementation class
		IProductService productService = new ProductServiceImpl();
		List<Product> products = productService.getAll();
		products.forEach(System.out::println);
		
		
		
	}

}






