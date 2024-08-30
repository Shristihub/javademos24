package com.productapp.service;

import java.util.List;

import com.productapp.dao.IProductDao;
import com.productapp.dao.ProductDaoImpl;
import com.productapp.model.Product;

public class ProductServiceImpl implements IProductService {
    private IProductDao productDao = new ProductDaoImpl();
	@Override
	public void addProduct(Product product) {
		// call the add method of daoImpl
		productDao.addProduct(product);

	}

	@Override
	public void updateProduct(int productId, double price) {
		productDao.updateProduct(productId,price);
	}

	@Override
	public void deleteProduct(int productId) {

	}

	@Override
	public List<Product> getAll() {
		return null;
	}

	@Override
	public List<Product> getByBrand(String brand) {
		return null;
	}

	@Override
	public List<Product> getByCategory(String category) {
		return null;
	}

	@Override
	public List<Product> getByLesserPrice(double price) {
		return null;
	}

	@Override
	public Product getById(int productId) {
		return null;
	}

	@Override
	public List<String> getProductNames() {
		return null;
	}

	@Override
	public List<Product> getByNameAndExpiry(String productName, String date) {
		return null;
	}

	@Override
	public List<Product> getByBrandAndLesserPrice(String brand, double price) {
		// TODO Auto-generated method stub
		return null;
	}

}
