package com.training.prep;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class PrepResultDemo {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jfsjunbatch";
		String username = "root";
		String password = "root";

//		String sql = "select * from student";
		String sql = "select * from student where city=?";

		try (Connection connection = DriverManager.getConnection(url, username, password);
				PreparedStatement statement = connection.prepareStatement(sql);) {
			statement.setString(1, "Bengaluru");
			try (ResultSet resultSet = statement.executeQuery();) {
				while (resultSet.next()) {
					String studentName = resultSet.getString(1);
					String city = resultSet.getString("city");
					int studentId = resultSet.getInt(2);
					System.out.println(studentName + " " + city + " " + studentId);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
