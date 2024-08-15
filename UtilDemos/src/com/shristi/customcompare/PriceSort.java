package com.shristi.customcompare;

import java.util.Comparator;

public class PriceSort implements Comparator<Mobile>{

	@Override
	public int compare(Mobile o1, Mobile o2) {
		return ((Double)o2.getPrice()).compareTo(o1.getPrice());
	}

}
