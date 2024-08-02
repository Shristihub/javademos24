package com.shristi.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialTryDemo {

	public static void main(String[] args) {
		try (
			FileInputStream fs = new FileInputStream("emp.ser"); 
			ObjectInputStream os = new ObjectInputStream(fs);) {
			
			System.out.println("Deseralizing....");
			Employee empl = (Employee)os.readObject();
			System.out.println(empl);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
