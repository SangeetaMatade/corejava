package com.xworkz.loops;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Mall {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Gopalan innovation mall");
		list.add("Grand majestic mall");
		list.add("Banglore central mall");
		list.add("Garuda mall");
		list.add("U mall");

		System.out.println("using for loop");
		for (String element : list) {
			System.out.println(element);
		}

		System.out.println("---------------------------------------------------------");
		System.out.println("");
		for (int i = 0; i < list.size(); i++) {
			String element = list.get(i);
			System.out.println(element);
		}
		// System.out.println(list.size());
		// System.out.println(list.remove(2));
		// System.out.println(list.size());

		System.out.println("//////////////////////////////////////////////////////////");
		System.out.println("");
		System.out.println("using for each");
		list.forEach((a) -> {
			System.out.println((a));
		});

		System.out.println("..........................................................");
		System.out.println("");
        ListIterator<String> listitr = list.listIterator(list.size());
		System.out.println("reverse order");
		while (listitr.hasPrevious()) {
			String str = listitr.previous();
			System.out.println(str);
		}
	}

}
