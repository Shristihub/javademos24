package com.shristi.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialDemo {

	public static void main(String[] args) {
		FileInputStream fs = null;
		ObjectInputStream os = null;
		try {
			fs = new FileInputStream("emp.ser");
			os = new ObjectInputStream(fs);
			Employee  employee = (Employee)os.readObject();
			System.out.println(employee);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fs != null)
					fs.close();
				if (os != null)
					os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
