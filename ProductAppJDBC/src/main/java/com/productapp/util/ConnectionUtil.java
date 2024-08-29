package com.productapp.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtil {

	static Connection connection;
	public static Connection openConnection() {
		String url = "jdbc:mysql://localhost:3306/jfsjunbatch";
		String username = "root";
		String password = "root";
		try(Connection nconnection = DriverManager.getConnection(url,username,password);){
			connection = nconnection;
			// To create a table  use prepared stmt and execute it
		}catch(Exception e) {
			e.printStackTrace();
		}
		return connection;
		
	}
	
}
