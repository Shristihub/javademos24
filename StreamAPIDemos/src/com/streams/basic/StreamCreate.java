package com.streams.basic;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamCreate {

	public static void main(String[] args) {
		List<String> courses = Arrays.asList("Java","Angular","Java","CSS","HTML","React","JUnit");
		//Stream<String> mstream = courses.stream();
		
		Consumer<String> con = (str)->System.out.println(str); 
		
		// terminal operation
		courses.stream().forEach(con);
		System.out.println();
		courses.stream().forEach(str->System.out.println(str));
		System.out.println();
		Stream.of(10,20,30,50).forEach(num->System.out.println(num));
		
		// convert array to stream
		String[] fruits = new String[] {"apple","orange","mango","papaya","pineapple"};
		Stream.of(fruits).forEach(str->System.out.println(str));
		
		System.out.println();
		// convert part of array to stream
		Arrays.stream(fruits,1,4).forEach(str->System.out.println(str));
		System.out.println();
		Arrays.stream(new int[] {1,2,3,4,5,6,7,8,9,10},4,9).forEach(num->System.out.println(num));
		
		//empty stream
		Stream.empty();
//		Supplier<String> sup = ()->"hello";
		
		// an infinite stream
//		Stream.generate(()->"hello").forEach(str->System.out.println(str));
	}

}
