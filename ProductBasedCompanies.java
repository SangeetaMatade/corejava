package com.xworkz.collectioncodes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.xworkz.collectioncodes.implementation.pbcimp2;

public class ProductBasedCompanies {

	public static void main(String[] args) {
		
		List<String> col = new ArrayList<>();
		
		col.add("Adobe.");
		col.add("Amazon");
		col.add("Amdocs");
		col.add("Facebook.");
		col.add("Microsoft");
		col.add("HP.");
		col.add("Informatica.");
		col.add("Intel.");
		col.add("McAfee");
		col.add("VMware");
		
		System.out.println(col.size());
		Comparator<String> com = new Pbcimp();
		Collections.sort(col, com);
		
		Iterator<String> itr = col.iterator();
		
		while(itr.hasNext()) {
			String elements=itr.next();
			System.out.println(elements);
			
			
		}
		
		System.out.println(".........................................................");
		
		Set<String> set = new TreeSet<String>();
		
		set.add("Flipkart");
		set.add("Uber");
		set.add("Oracle");
		set.add("BMC");
		set.add("Amdocs");
		set.add("CISCO  ");
		set.add("FACEBOOK");
		set.add("Intuit ");
		set.add("Salesforce");
		set.add("SAP");
		
		System.out.println(set.size());
		
		Comparator<String> com2 = new pbcimp2();
	 Collections.sort(set, com2);
	  Iterator<String> itr1 = set.iterator();
		
		while(itr1.hasNext()) {
			String elements=itr1.next();
			System.out.println(elements);
			
			
		}
	  
		
		
		

	}

}
