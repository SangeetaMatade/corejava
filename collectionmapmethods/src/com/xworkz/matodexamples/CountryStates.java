package com.xworkz.matodexamples;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountryStates {

	public static void main(String[] args) {

		Map<String, String> countrystates = new HashMap<String, String>();

		countrystates.put("India", "Karnataka");
		countrystates.put("Russia", "Altai");
		countrystates.put("South afrika", "Limpopo");
		countrystates.put("Australia", "Queenslnd");
		countrystates.put("north afrika", "sudan");

		Set<String> set = countrystates.keySet();
		set.stream().sorted(Comparator.reverseOrder()).forEach((e) -> System.out.println(e));

		System.out.println("/////////////////////////////////////////////");
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			String element = itr.next();
			System.out.println(element);

		}

		System.out.println("...............................................");
		Collection<String> collection = countrystates.values();
		collection.stream().sorted().forEach((e) -> System.out.println(e));

		System.out.println("//////////////////////////////////////////////");
		Iterator<String> itr1 = collection.iterator();
		while (itr1.hasNext()) {
			String element = itr1.next();
			System.out.println(element);

		}

		System.out.println(".,,..,.,..,.,.,,,,,,,,,,,,,,,,,.,.,.,.....,.,..,.");
		Set<Map.Entry<String, String>> set2 = countrystates.entrySet();
		// set2.stream().sorted().forEach((e)->System.out.println(e));
		Iterator<Map.Entry<String, String>> itr2 = set2.iterator();
		while (itr2.hasNext()) {
			Map.Entry<String, String> element = itr2.next();
			System.out.println(element);
		}

	}
}
