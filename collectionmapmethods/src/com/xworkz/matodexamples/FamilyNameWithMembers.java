package com.xworkz.matodexamples;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FamilyNameWithMembers {

	public static void main(String[] args) {

		Map<String, Integer> familyNameWithMembers = new HashMap<String, Integer>();

		familyNameWithMembers.put("Sangeeta", 3);
		familyNameWithMembers.put("Maneesha", 6);
		familyNameWithMembers.put("kavita", 4);
		familyNameWithMembers.put("kavya", 3);
		familyNameWithMembers.put("abhi", 7);

		Set<String> set = familyNameWithMembers.keySet();

		set.stream().sorted(Comparator.reverseOrder()).forEach((e) -> System.out.println(e));

		System.out.println("/////////////////////////////////////////////");

		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			String element = itr.next();
			System.out.println(element);

		}

		System.out.println("...............................................");
		Collection<Integer> collection = familyNameWithMembers.values();
		collection.stream().sorted().forEach((e) -> System.out.println(e));

		System.out.println("//////////////////////////////////////////////");
		Iterator<Integer> itr1 = collection.iterator();
		while (itr1.hasNext()) {
			Integer element = itr1.next();
			System.out.println(element);

		}

		System.out.println(".,,..,.,..,.,.,,,,,,,,,,,,,,,,,.,.,.,.....,.,..,.");
		Set<Map.Entry<String, Integer>> set2 = familyNameWithMembers.entrySet();
		// set2.stream().sorted().forEach((e)->System.out.println(e));
		Iterator<Map.Entry<String, Integer>> itr2 = set2.iterator();
		while (itr2.hasNext()) {
			Map.Entry<String, Integer> element = itr2.next();
			System.out.println(element);
		}
	}

}
