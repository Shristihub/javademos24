package com.streams.basic;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamInter {

	public static void main(String[] args) {
		List<String> courses = 
		Arrays.asList("Java","Angular","Java","CSS","HTML","React","JUnit","Javascript");
//		Predicate<String> pred  = str->{
//			if(str.startsWith("J"))
//				 return true;
//				else
//					return false;
//			};
				   
		//filter
		courses.stream()
		        .filter(str->str.startsWith("K"))
		        .forEach(str->System.out.println(str.toUpperCase()));
		System.out.println();
		
		System.out.println("Distinct, sort");
		courses.stream()
        .filter(str->str.length()>3)
        .distinct()
        .sorted()
//        .limit(3)
//        .skip(2)
        .forEach(str->System.out.println(str.toUpperCase()));
		System.out.println();
		
		Function<String, Integer> fun = str->str.length();
		
		
		// map
		System.out.println("map");
		courses.stream()
		.map(str->str.length())  // str converted to integer
		.sorted()
		.forEach(num->System.out.println(num));
	}
}
