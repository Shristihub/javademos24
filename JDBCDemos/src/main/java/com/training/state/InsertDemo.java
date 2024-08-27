package com.training.state;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertDemo {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jfsjunbatch";
		String username = "root";
		String password = "root";
		String sql = "insert into employee values('Robin',2,'Bengaluru')";

		try (Connection connection = DriverManager.getConnection(url, username, password);
				Statement statement = connection.createStatement();) {
			boolean result = statement.execute(sql);
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
