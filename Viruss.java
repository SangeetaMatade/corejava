package com.xworkz.collectioncodes;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.xworkz.collectioncodes.implementation.VirusNames;
import com.xworkz.collectioncodes.implementation.VirusNamesimp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Viruss {

	public static void main(String[] args) {

		List<String> col = new ArrayList<>();

		col.add("Omicron");
		col.add("Bunyavirus");
		col.add("Calicivirus");
		col.add("Corona");
		col.add("Coxsackie");
		col.add("Coxsackie");
		col.add("BK—in kidney transplant patients ");
		col.add("Ebola");
		col.add("Herpes");
		col.add("hepatitis E");
		
		Comparator<String> com=new VirusNames();
		Collections.sort(col,com);
		
		System.out.println(col.size());
	//	Collections.sort(col);
		//System.out.println();

		Iterator<String> itr = col.iterator();
		 
		while (itr.hasNext()) {
			String elements = itr.next();
			System.out.println(elements);
		}
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&7");
		
		Set<String> set = new TreeSet<String>();
		
		set.add("Hendra virus");
		set.add("Duvenhage virus");
		set.add("Eastern equine encephalitis virus");
		set.add("Ebolavirus");
		set.add("Echovirus");
		set.add("Epstein-Barr virus");
		set.add("Hantaan virus");
		set.add("Hendra virus");
		set.add("Hepatitis A virus");
		set.add("Hepatitis B virus");
		set.add("Delt");
		
		System.out.println(set.size());
		
		Comparator<String> com1 = new VirusNamesimp();
		Collections.sort(set, com1);
		
		Iterator<String> itr1 = col.iterator();
		 
		while (itr1.hasNext()) {
			String elements = itr1.next();
			System.out.println(elements);
		}
		
	
	


	}

}
