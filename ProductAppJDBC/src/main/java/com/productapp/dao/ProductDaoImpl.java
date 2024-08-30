package com.productapp.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.List;

import com.productapp.model.Product;
import com.productapp.util.ConnectionUtil;
import com.productapp.util.Queries;

public class ProductDaoImpl implements IProductDao {

	@Override
	public void addProduct(Product product) {
		// get a connection
		Connection connection = ConnectionUtil.openConnection();
		// create a ps
		try (PreparedStatement statement = connection.prepareStatement(Queries.INSERTQUERY);) {
//			product_name,brand,category,price,mfg_date,expiry_date,weight_in_gms
			statement.setString(1, product.getProductName());
			statement.setString(2, product.getBrand());
			statement.setDouble(4, product.getPrice());
			statement.setString(3, product.getCategory());
			// convert LocalDate to date object
			statement.setDate(5, Date.valueOf(product.getMfgDate()));
			// convert LocalDate to date object
			statement.setDate(6, Date.valueOf(product.getExpiryDate()));
			statement.setString(7, product.getWeightInGms());

			boolean isInserted = statement.execute();
			System.out.println("inserted " + !isInserted);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			ConnectionUtil.closeConnection();
		}
	}

	@Override
	public void updateProduct(int productId, double price) {
		Connection connection = ConnectionUtil.openConnection();
		try (PreparedStatement statement = connection.prepareStatement(Queries.UPDATEQUERY);) {
			statement.setDouble(1, price);
			statement.setInt(2, productId);
			int updatedCount = statement.executeUpdate();
			System.out.println("updated "+updatedCount);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			ConnectionUtil.closeConnection();
		}
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
