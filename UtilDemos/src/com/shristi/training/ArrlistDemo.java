package com.shristi.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrlistDemo {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		System.out.println(list.size());
		list.add("Priya");
		list.add("10");
		list.add("Raju");
		System.out.println(list);
		list.add(1, "John");
		list.add("Kathy");
		System.out.println(list);
		list.set(2, "Sri");
		System.out.println(list);

		for (String str : list) {
			System.out.println(str);
		}
		System.out.println();
		
		Collections.sort(list);
		System.out.println(list);
		System.out.println("Using Iterator");
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
		}
		System.out.println();
		System.out.println("Reverse");
		ListIterator<String> listIterator = list.listIterator(list.size());
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		
	}

}
