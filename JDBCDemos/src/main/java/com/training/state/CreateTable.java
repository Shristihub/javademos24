package com.training.state;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/jfsjunbatch";
		String username = "root";
		String password = "root";
		String sql = "create table employee1(emp_name varchar(20),emp_Id int primary key,department varchar(20))";

		Connection connection = null;
		Statement statement = null;
		try {

			// Get a connection object
			connection = DriverManager.getConnection(url, username, password);
			// Create a Statement object using connection
			statement = connection.createStatement();
			// execute the query
			boolean result = statement.execute(sql);
			System.out.println("Table created " + result);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (connection != null)
					connection.close();
				if (statement != null)
					statement.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
