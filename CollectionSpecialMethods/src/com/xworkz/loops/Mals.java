package com.xworkz.loops;

import java.util.HashSet;
import java.util.Set;

public class Mals {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();

		set.add("Gopalan innovation mall");
		set.add("Grand majestic mall");
		set.add("Banglore central mall");
		set.add("Garuda mall");
		set.add("U mall");

		for (String element : set) {
			System.out.println(element);
		}
		System.out.println("/////////////////////////////");
		set.forEach((a) -> {
			System.out.println((a));
		});

	}
}
