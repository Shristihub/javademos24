package com.training.state;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class InsertManyDemo {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jfsjunbatch";
		String username = "root";
		String password = "root";
		

		try (Connection connection = DriverManager.getConnection(url, username, password);
				Statement statement = connection.createStatement();
				Scanner scanner =  new Scanner(System.in);
				) {
			for(int i=0;i<5;i++) {
				System.out.println("Enter name");
				String empName = scanner.next();
				System.out.println("Enter id");
				int empId = scanner.nextInt();
				System.out.println("Enter department");
				String department = scanner.next();
				String sql = 
			"insert into employee values('"+empName+"',"+empId+",'"+department+ "')";
				boolean result = statement.execute(sql);
				System.out.println(result);
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
