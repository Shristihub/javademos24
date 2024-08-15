package com.shristi.training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnModiList {
	public static void main(String[] args) {

		List<String> courses = new ArrayList<>();
		courses.add("Java");
		courses.add("Angular");

		// Create an Unmodifiable List - pre java 9
		List<String> ncourses = 
				Collections.unmodifiableList(courses);
		System.out.println(ncourses);
		
		// Create an Unmodifiable List - from java 9
		List<String> mcourses = List.of("Html","CSS",null);
		System.out.println(mcourses);

		// Create an Unmodifiable List - from java 10
		List<String> tcourses = List.copyOf(courses);
		System.out.println(tcourses);
		
		// modifying the list 
		// throws UnSupportedOperationException in all cases
//		ncourses.add("Spring");
		tcourses.add("Spring");
		
		// the list will not accept null values
		
		

	}

}
