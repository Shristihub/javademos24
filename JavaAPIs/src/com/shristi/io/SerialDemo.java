package com.shristi.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerialDemo {

	public static void main(String[] args) {
		Employee employee = new Employee("Ronnie", 2, "Tech");
		FileOutputStream fs = null;
		ObjectOutputStream os = null;
		try {
			fs = new FileOutputStream("emp.ser");
			os = new ObjectOutputStream(fs);
			os.writeObject(employee);
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
