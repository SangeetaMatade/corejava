package com.xworkz.collectioncodes.implementation;

import java.util.Comparator;

public class Trainumberimp implements Comparator<Long>{

	@Override
	public int compare(Long o1, Long o2) {
		if (o2.equals(o1)) {
			System.out.println("two arg are equal");
			return 0;
		}
		if (o2 > o1) {
			System.out.println("first arg is greater than second");
			return 909;
		}
		if (o2 < o1) {
			System.out.println("first arg is less than second");
			return -909099;
		}
		return 0;
		
	}

}
