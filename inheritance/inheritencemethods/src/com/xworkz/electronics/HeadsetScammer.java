package com.xworkz.electronics;

import com.xworkz.enumm.HeadsetType;

public class HeadsetScammer {

	public static void main(String[] args) {
		Headset headset = new Headset();
		System.out.println(headset.hashCode());
		System.out.println(headset.toString());

		System.out.println();

		Headset headset1 = new Headset();
		String xyz = "num";
		System.out.println(xyz.hashCode());

		headset.setBrand("xyz");
		headset.setBrand("xyz");
		boolean equal1 = headset.equals(headset1);
		System.out.println(equal1);

	}

}
