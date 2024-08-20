package com.productapp.service;

import java.util.List;

import com.productapp.model.Product;
import com.productapp.util.ProductUtil;

public class ProductServiceImpl implements IProductService {

	@Override
	public List<Product> getAll() {
		List<Product> products = ProductUtil.showProducts();
		return products;
	}

	@Override
	public List<Product> getByBrand(String brand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getByCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getByLesserPrice(double price) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getById(int productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getProductNames() {
		// TODO Auto-generated method stub
		return null;
	}

}
