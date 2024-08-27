package com.training.state;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateDemo {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jfsjunbatch";
		String username = "root";
		String password = "root";
		String sql = "update employee set department='HR' where emp_id=1";

		try (Connection connection = DriverManager.getConnection(url, username, password);
				Statement statement = connection.createStatement();) {
			boolean result = statement.execute(sql);
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
