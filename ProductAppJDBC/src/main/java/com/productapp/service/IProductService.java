package com.productapp.service;

import java.time.LocalDate;
import java.util.List;

import com.productapp.model.Product;

public interface IProductService {

	// CRUD operation
	void addProduct(Product product);
	void updateProduct(int productId,double price);
	void deleteProduct(int productId);
	
	
	List<Product> getAll();
	List<Product> getByBrand(String brand);
	List<Product> getByCategory(String category);
	List<Product> getByLesserPrice(double price);
	Product getById(int productId); // returns one product
	List<String> getProductNames();
	//"24/12/12" 12 dec 2024
	List<Product> getByNameAndExpiry(String productName,String date); // convert string to localdate
	List<Product> getByBrandAndLesserPrice(String brand, double price);
	
	
}
