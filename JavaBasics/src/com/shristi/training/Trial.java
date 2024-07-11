package com.shristi.training;

import java.util.Arrays;
import java.util.List;

public class Trial {

	public static void main(String[] args) {
		// using Set as it does not accept duplicates
		String names[] = { "Ram", "Joseph", "John", "Ram", "Ann", "Joseph" };
		List<String> nameslist = Arrays.asList(names);
		for (int i = 0; i < names.length; i++) {
			for (String name : nameslist) {
				if (name.equals(names[i])) {
					nameslist.remove(name);
				}
			}
		}
		System.out.println(nameslist);
	}
}
