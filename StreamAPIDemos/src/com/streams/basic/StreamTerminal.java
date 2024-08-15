package com.streams.basic;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;


public class StreamTerminal {
	public static void main(String[] args) {
		List<String> courses = 
			Arrays.asList("Java","Angular","Java","CSS","HTML","React","JUnit","Javascript");
	
		System.out.println("Using iterator");
		Iterator<String> it =  courses
								.stream()
								.sorted()
								.limit(5)
								.iterator();
		while(it.hasNext()) {
			String course = it.next();
			System.out.println(course);
		}
		System.out.println();
		System.out.println("Using forEach");
		courses.stream().sorted().limit(5).forEach(str->System.out.println(str));
		
		System.out.println();
		System.out.println("Using collect");
		List<String> ncourses = 
					courses.stream()
					.sorted()
					.limit(5)
					.collect(Collectors.toList());
		ncourses.forEach(str->System.out.println(str));
				
		
		
	}

}
