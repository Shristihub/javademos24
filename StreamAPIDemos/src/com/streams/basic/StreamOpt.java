package com.streams.basic;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class StreamOpt {
	public static void main(String[] args) {
		List<String> courses = 
			Arrays.asList("Java","Angular","Java","CSS","HTML","React","JUnit","Javascript");
	
		
		System.out.println("Using findFirst");
		Optional<String> optstr =   courses.stream()
							.filter(str->str.length()>4)
							.sorted()
							.findFirst();
		System.out.println(optstr);
		//isPresent
		if(optstr.isPresent())
			System.out.println(optstr.get());
		// isEmpty
		if(!optstr.isEmpty())
			System.out.println(optstr.get());
		
		//ifPresent
		System.out.println();
		courses.stream()
		.filter(str->str.length()>40)
		.sorted()
		.findFirst()
		.ifPresent(str->System.out.println(str));
		
		System.out.println();
		//ifPresentOrElse
		courses.stream()
		.filter(str->str.length()>40)
		.sorted()
		.findFirst()
		.ifPresentOrElse(
				str->System.out.println(str),
				()->System.out.println("no value present"));

		
		
		//orelse
		System.out.println();
		String result = courses.stream()
		.filter(str->str.length()>40)
		.sorted()
		.findFirst()
		.orElse("React");
		System.out.println(result);
				
		//orelse
		System.out.println();
		result = courses.stream()
				.filter(str->str.length()>40)
				.sorted()
				.findFirst()
				.orElseGet(()->"Node".toUpperCase());
	System.out.println(result);
	
	//orelse
	System.out.println();
	result = courses.stream()
		.filter(str->str.length()>4)
		.sorted()
		.findFirst()
		.orElseThrow(()-> new ArithmeticException());
		System.out.println(result);
	
		
	}

}












