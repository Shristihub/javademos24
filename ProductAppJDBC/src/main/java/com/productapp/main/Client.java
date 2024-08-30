package com.productapp.main;

import java.time.LocalDate;

import com.productapp.model.Product;
import com.productapp.service.IProductService;
import com.productapp.service.ProductServiceImpl;

public class Client {

	public static void main(String[] args) {
//		product_name,brand,category,price,mfg_date,expiry_date,weight_in_gms
//		ConnectionUtil.openConnection();
		Product product = 
		new Product("Atta","Annapurna",80.00,"groceries",
				LocalDate.of(2024, 9, 20),LocalDate.of(2025,9,22),"1000gms");
		
		IProductService productService = new ProductServiceImpl();
		productService.addProduct(product);
		
		System.out.println("Updating");
		productService.updateProduct(1, 38.00);
		
		
	}

}






