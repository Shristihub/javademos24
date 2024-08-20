package com.streams.basic;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
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
				
		BinaryOperator<Integer> fun = (num1,num2)->num1+num2;
		System.out.println(fun.apply(100,200));
		
		int sum = 12000;
		for(int x:new int[] {100,200})
			sum=sum+x;
		System.out.println(sum);
		
		
		int res = Arrays.stream(new Integer[] {100,200,300,400,500})
				  .filter(x->x>600)
			      .reduce((x,y)->x+y)
			      .get();
		System.out.println(res);
		
		int res1 = Arrays.stream(new Integer[] {100,200,300,400,500})
				   .filter(x->x>600)
			      .reduce(500,(x,y)->x+y);
	   System.out.println(res1);
		
		
		
	}

}
