package com.shristi.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadLine {
	public static void main(String[] args) {
		InputStreamReader inStreamReader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(inStreamReader);
		System.out.println("Enter data");
		try {
			String val = br.readLine();
			do {
				System.out.print(val);
				val = br.readLine();
			}while(!val.equalsIgnoreCase("STOP"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
