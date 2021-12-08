package com.xworkz.collectioncodes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.xworkz.collectioncodes.implementation.IitGimp;
import com.xworkz.collectioncodes.implementation.IitGimp2;

public class IndianItGiants {

	public static void main(String[] args) {

		List<String> col = new ArrayList<>();

		col.add("Tata Consultancy service");
		col.add("Infosys");
		col.add("HCL Technologies");
		col.add("Wipro Limited");
		col.add("Redington India Ltd");
		col.add("Larsen & Toubro Infotech Ltd");
		col.add("Mphasis Ltd");
		col.add("Mindtree Ltd");
		col.add("Hexaware Technologies Ltd");
		col.add("Tech Mahindra Ltd. ..");

		System.out.println(col.size());

		Comparator<String> com = new IitGimp();
		Collections.sort(col, com);
		Iterator<String> itr = col.iterator();

		while (itr.hasNext()) {
			String elements = itr.next();
			System.out.println(elements);
		}
			
			System.out.println(".........................................................");
			
			Set<String> set = new TreeSet<String>();
			
			
			set.add("Ingram");
			set.add("Dell");
			set.add("IGATE");
			set.add("Capgemini");
			set.add("Lenovo");
			set.add("Syntel");
			set.add("Acer");
			set.add("Kpit");
			set.add("Cyient");
			set.add("CMC");
			
			System.out.println(set.size());
			 Comparator<String> com1=new IitGimp2();
			 Collections.sort(set, com1);
			
			Iterator<String> itr1 = col.iterator();

			while (itr1.hasNext()) {
				String elements = itr1.next();
				System.out.println(elements);
			}
			

		}

	}

}
