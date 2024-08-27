package com.training.prep;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class PrepInsertDemo {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jfsjunbatch";
		String username = "root";
		String password = "root";
		String sql = "insert into student values(?,?,?)";


		try (Connection connection = DriverManager.getConnection(url, username, password);
		      PreparedStatement statement = connection.prepareStatement(sql);
				) {
			// set values for placeholders
			statement.setString(1, "Rahul");
			statement.setInt(2, 10);
			statement.setString(3, "Hasan");
			
			// call execute
			boolean result = statement.execute();
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
