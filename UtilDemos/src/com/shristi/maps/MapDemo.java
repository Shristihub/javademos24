package com.shristi.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
//		Map<Integer, String> map = new LinkedHashMap<>();
//		Map<Integer, String> map = new TreeMap<>();
		map.put(1, "Raju");
		map.put(2, "Jo");
		map.put(3, "Raju");
//		map.put(null, "Raju");// accepts null keys
		map.put(4, "David");
		map.put(5, null);
		map.put(6, "Mona");
		map.put(1, "Neeraj");
		map.put(2, "Manu");
		
		System.out.println(map);
		System.out.println(map.get(1));
		System.out.println(map.get(7));
//		System.out.println(map.get(null));
		System.out.println(map.getOrDefault(7,"Fred"));
		
		System.out.println(map.containsKey(6));
		
		System.out.println();
		
		// iterate thru the map
		
		Set<Integer> keys =  map.keySet();
		for (Integer key : keys) {
			System.out.println(key+" "+map.get(key));
		}
	}
}
