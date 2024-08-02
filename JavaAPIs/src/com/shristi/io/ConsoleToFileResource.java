package com.shristi.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleToFileResource {

	public static void main(String[] args) {
		

		try(InputStreamReader inStreamReader = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(inStreamReader);
			FileWriter fr = new FileWriter("demo.txt")){
			
			System.out.println("Write into the file");
			try {
				String val = br.readLine();
				fr.write(val);
				do {
					val = br.readLine();
					fr.write(val);
				} while (!val.equals("STOP"));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}catch(Exception e) {
			e.printStackTrace();
	}
	}
}
