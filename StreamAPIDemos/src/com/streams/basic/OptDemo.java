package com.streams.basic;

import java.util.Optional;

public class OptDemo {

	public static void main(String[] args) {
		String username = "Priya";
//		System.out.println(username.toUpperCase());
		
		Optional<String> optstr = Optional.ofNullable(username);
		System.out.println(optstr);
		
		// do not call directly
//		System.out.println(optstr.get().toUpperCase());
		
		// check if value is there
		if(optstr.isPresent()) {
			String val = optstr.get();
			System.out.println(val.toUpperCase());
		}
		if(!optstr.isEmpty()) {
			String val = optstr.get();
			System.out.println(val.toUpperCase());
		}
		String uname = null;
		Optional<String> optstrname = Optional.ofNullable(uname);
		System.out.println(optstrname);
		// do not call directly
//		System.out.println(optstrname.get());
		
		// check if optional is empty or has value
		if(optstrname.isEmpty()) {
			System.out.println("No value present");
		}
		if(!optstrname.isPresent()) {
			System.out.println("empty");
		}
		
	}
}
