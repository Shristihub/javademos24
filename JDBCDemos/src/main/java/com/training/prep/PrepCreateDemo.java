package com.training.prep;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PrepCreateDemo {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jfsjunbatch";
		String username = "root";
		String password = "root";
		String sql = "create table student(std_name varchar(20),std_Id int primary key,city varchar(20))";

		Connection connection = null;
		PreparedStatement statement = null;
		try {

			// Get a connection object
			connection = DriverManager.getConnection(url, username, password);
			// Create a PreparedStatement object using connection
			statement = connection.prepareStatement(sql);
			// execute the query
			boolean result = statement.execute();
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
