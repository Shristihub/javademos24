package com.shristi.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleToConsole {
	public static void main(String[] args) {
		// create an object of InputStreamReader 
		//takes console input as bytes and converts as character
		InputStreamReader inStreamReader = new InputStreamReader(System.in);
		
		//create an object of BR to read from console
		BufferedReader br = new BufferedReader(inStreamReader);
		System.out.println("Enter data");
		try {
			char val = (char)br.read();
			do {
				System.out.print(val); // write in console
				val = (char)br.read();
			}while(val!='g');
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
