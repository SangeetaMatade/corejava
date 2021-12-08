package com.xworkz.collectioncodes.implementation;

import java.util.Comparator;

public class PhoneNumberImp2 implements Comparator<Long> {

	@Override
	public int compare(Long o1, Long o2) {
		if (o1.equals(o2)) {
			System.out.println("two arg are equal");
			return 0;
		}
		if (o1 > o2) {
			System.out.println("first arg is greater than second");
			return 99;
		}
		if (o1 < o2) {
			System.out.println("first arg is less than second");
			return -99;
		}
		return 0;
		
	}

}
