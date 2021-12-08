package com.xworkz.collectioncodes;

import java.util.Comparator;

public class Pbcimp implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		
		return o2.compareTo(o1);
	}
	
	

}
