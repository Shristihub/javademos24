package com.shristi.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleToFile {

	public static void main(String[] args) {

		InputStreamReader inStreamReader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(inStreamReader);
		System.out.println("Enter data");
		// create a FileWriter or FileOutputStream
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter("demo.txt",true);
			String val = br.readLine(); // read from console line by line
			fileWriter.write(val); // write into file
			do {
				val = br.readLine(); // read from console line by line
				fileWriter.write(val);
			} while (!val.equalsIgnoreCase("STOP"));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fileWriter != null)
					fileWriter.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
