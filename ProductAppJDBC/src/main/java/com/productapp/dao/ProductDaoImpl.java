package com.productapp.dao;

import java.util.List;

import com.productapp.model.Product;

public class ProductDaoImpl implements IProductDao {

	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateProduct(int productId, double price) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteProduct(int productId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
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

	@Override
	public List<Product> getByNameAndExpiry(String productName, String date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getByBrandAndLesserPrice(String brand, double price) {
		// TODO Auto-generated method stub
		return null;
	}

}
