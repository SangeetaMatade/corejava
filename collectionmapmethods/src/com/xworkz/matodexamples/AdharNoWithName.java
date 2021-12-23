package com.xworkz.matodexamples;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class AdharNoWithName {

	public static void main(String[] args) {

		Map<String, Long> adharNoWithName = new HashMap<String, Long>();

		adharNoWithName.put("Sangeeta", 87655678765l);
		adharNoWithName.put("Sanjota", 898987678778l);
		adharNoWithName.put("Sahana", 898767655676l);
		adharNoWithName.put("Spoorti", 87909878766l);

		Set<String> set = adharNoWithName.keySet();

		set.stream().sorted(Comparator.reverseOrder()).forEach((e) -> System.out.println(e));

		System.out.println("/////////////////////////////////////////////");

		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			String element = itr.next();
			System.out.println(element);

		}

		System.out.println("...............................................");
		Collection<Long> collection = adharNoWithName.values();
		collection.stream().sorted().forEach((e) -> System.out.println(e));

		System.out.println("//////////////////////////////////////////////");
		Iterator<Long> itr1 = collection.iterator();
		while (itr1.hasNext()) {
			Long element = itr1.next();
			System.out.println(element);

		}

		System.out.println(".,,..,.,..,.,.,,,,,,,,,,,,,,,,,.,.,.,.....,.,..,.");
		Set<Map.Entry<String, Long>> set2 = adharNoWithName.entrySet();
		// set2.stream().sorted().forEach((e)->System.out.println(e));
		Iterator<Map.Entry<String, Long>> itr2 = set2.iterator();
		while (itr2.hasNext()) {
			Map.Entry<String, Long> element = itr2.next();
			System.out.println(element);
		}

	}

}
