package com.xworkz.matodexamples;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MobileWithName {

	public static void main(String[] args) {

		Map<String, Long> mobileWithName = new HashMap<String, Long>();

		mobileWithName.put("Sharat", 8876756456l);
		mobileWithName.put("heena", 7786567645l);
		mobileWithName.put("meena", 9987876556l);
		mobileWithName.put("maneesha", 8978765654l);
		mobileWithName.put("chaitra", 9067987888l);

		Set<String> set = mobileWithName.keySet();

		set.stream().sorted(Comparator.reverseOrder()).forEach((e) -> System.out.println(e));

		System.out.println(" ");

		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			String element = itr.next();
			System.out.println(element);

		}

		System.out.println("...............................................");
		Collection<Long> collection = mobileWithName.values();
		collection.stream().sorted().forEach((e) -> System.out.println(e));

		System.out.println("//////////////////////////////////////////////");
		Iterator<Long> itr1 = collection.iterator();
		while (itr1.hasNext()) {
			Long element = itr1.next();
			System.out.println(element);

		}

		System.out.println(" ");
		Set<Map.Entry<String, Long>> set2 = mobileWithName.entrySet();
		// set2.stream().sorted().forEach((e)->System.out.println(e));
		Iterator<Map.Entry<String, Long>> itr2 = set2.iterator();
		while (itr2.hasNext()) {
			Map.Entry<String, Long> element = itr2.next();
			System.out.println(element);
		}

	}

}
