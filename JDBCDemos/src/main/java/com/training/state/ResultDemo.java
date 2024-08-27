package com.training.state;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResultDemo {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jfsjunbatch";
		String username = "root";
		String password = "root";
		
		String depart = "Design";
//		String sql = "select * from employee where department='Design'";
		String sql = "select * from employee where department='"+depart+"'";
		

		try (Connection connection = DriverManager.getConnection(url, username, password);
				Statement statement = connection.createStatement();
				ResultSet resultSet  = statement.executeQuery(sql);
	          ){
			
			
			while(resultSet.next()) {
				String employeeName = resultSet.getString(1);
				String department = resultSet.getString("department");
				int empId = resultSet.getInt(2);
				System.out.println(employeeName +" "+department+" "+empId);
				
			}

	
	
	} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
