package com.xworkz.collectioncodes.implementation;

import java.util.Comparator;

public class TrainNumberImp2 implements Comparator<Long> {

	@Override
	public int compare(Long o1, Long o2) {
		if (o2.equals(o1)) {
			System.out.println("two arg are equal");
			return 0;
		}
		if (o2 > o1) {
			System.out.println("first arg is greater than second");
			return 565;
		}
		if (o2 < o1) {
			System.out.println("first arg is less than second");
			return -9009;
		}
		return 0;
	}

}
