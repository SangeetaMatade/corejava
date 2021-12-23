package com.xworkz.matodexamples;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CollegeNameTotalStudents {

	public static void main(String[] args) {

		Map<String, Integer> CollegeNameTotalStudents = new HashMap<String, Integer>();

		CollegeNameTotalStudents.put("SKSVMACET", 1000);
		CollegeNameTotalStudents.put("RV college", 2000);
		CollegeNameTotalStudents.put("BVB", 20000);
		CollegeNameTotalStudents.put("SDM", 30000);

		Set<String> set = CollegeNameTotalStudents.keySet();

		set.stream().sorted(Comparator.reverseOrder()).forEach((e) -> System.out.println(e));

		System.out.println("/////////////////////////////////////////////");

		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			String element = itr.next();
			System.out.println(element);

		}

		System.out.println("...............................................");
		Collection<Integer> collection = CollegeNameTotalStudents.values();
		collection.stream().sorted().forEach((e) -> System.out.println(e));

		System.out.println("//////////////////////////////////////////////");
		Iterator<Integer> itr1 = collection.iterator();
		while (itr1.hasNext()) {
			Integer element = itr1.next();
			System.out.println(element);

		}

		System.out.println(".,,..,.,..,.,.,,,,,,,,,,,,,,,,,.,.,.,.....,.,..,.");
		Set<Map.Entry<String, Integer>> set2 = CollegeNameTotalStudents.entrySet();
		// set2.stream().sorted().forEach((e)->System.out.println(e));
		Iterator<Map.Entry<String, Integer>> itr2 = set2.iterator();
		while (itr2.hasNext()) {
			Map.Entry<String, Integer> element = itr2.next();
			System.out.println(element);
		}

	}

}
