package com.shristi.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerialTryDemo {

	public static void main(String[] args) {
		Employee employee = new Employee("Ronnie", 1, "Admin");
		try (FileOutputStream fs = new FileOutputStream("emp.ser");
				ObjectOutputStream os = new ObjectOutputStream(fs);) {
			System.out.println("Serializing");
			os.writeObject(employee);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
