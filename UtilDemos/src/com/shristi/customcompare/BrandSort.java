package com.shristi.customcompare;

import java.util.Comparator;

public class BrandSort implements Comparator<Mobile>{

	@Override
	public int compare(Mobile o1, Mobile o2) {
		return o2.getBrand().compareTo(o1.getBrand());
	}

}
