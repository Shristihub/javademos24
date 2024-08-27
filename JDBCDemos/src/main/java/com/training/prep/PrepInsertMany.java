package com.training.prep;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class PrepInsertMany {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jfsjunbatch";
		String username = "root";
		String password = "root";
		String sql = "insert into student values(?,?,?)";
		try (Connection connection = DriverManager.getConnection(url, username, password);
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				Scanner scanner =  new Scanner(System.in);
				) {
			for(int i=0;i<5;i++) {
				System.out.println("Enter name");
				String studentName = scanner.next();
				preparedStatement.setString(1, studentName);
				
				System.out.println("Enter id");
				preparedStatement.setInt(2, scanner.nextInt());
				
				System.out.println("Enter city");
				preparedStatement.setString(3, scanner.next());
				
				
				boolean result = preparedStatement.execute();
				System.out.println(result);
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
