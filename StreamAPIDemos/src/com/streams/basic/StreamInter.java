package com.streams.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

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
		
//		Function<String, Integer> fun = str->str.length();
		
		
		// map
		System.out.println("map");
		courses.stream()
//		.map(str->str.length())  // str converted to integer
		.map(String::length)
		.sorted()
		.forEach(System.out::println);
		
		
		String[] fruits = new String[] {"apple","orange"}; 
		Stream<String> fruitstream = Arrays.stream(fruits);
		fruitstream.forEach(str->System.out.println(str.toUpperCase()));
		
		//flatMap
		String[][] names =  new String[][] {{"Jo","Ann","Kathy"},{"Raja","Rani"},{"Tony","Robin"}};
		//convert to a stream
		Stream<String[]> namesstream = Arrays.stream(names);
		// use flatmap to get the array
		namesstream
		 .flatMap(onestream-> Arrays.stream(onestream))
		 .forEach(str->System.out.println(str.toUpperCase()));
		
		
		
		
		
	}
}
