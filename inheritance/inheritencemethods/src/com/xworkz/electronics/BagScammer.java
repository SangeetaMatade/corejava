package com.xworkz.electronics;

import com.xworkz.enumm.BagColor;

public class BagScammer {

	public static void main(String[] args) {
		Bag bag = new Bag();

		Bag bag1 = new Bag();

		bag.setColor(BagColor.BLACK);
		bag1.setColor(BagColor.ORANGE);
		boolean equal = bag.equals(bag1);
		System.out.println(equal);
		
		System.out.println(bag.hashCode());
		System.out.println(bag1.toString());
		
	}

}
