package com.training.prep;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class PrepUpdateDemo {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jfsjunbatch";
		String username = "root";
		String password = "root";
		String sql = "update student set city=? where std_id=?";

		try (Connection connection = DriverManager.getConnection(url, username, password);
			 PreparedStatement statement = connection.prepareStatement(sql);) {
			 statement.setString(1, "Udupi");
			 statement.setInt(2, 11);
			boolean result = statement.execute();
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
