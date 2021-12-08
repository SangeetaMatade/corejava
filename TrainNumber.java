package com.xworkz.collectioncodes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.xworkz.collectioncodes.implementation.PhoneNumberImp2;
import com.xworkz.collectioncodes.implementation.TrainNumberImp2;
import com.xworkz.collectioncodes.implementation.Trainumberimp;

public class TrainNumber {

	public static void main(String[] args) {
	
	

			List<Long> collections = new ArrayList<Long>();

			collections.add(701990l);
			collections.add(912342l);
			collections.add(856716l);
			collections.add(985754l);
			collections.add(885777l);
			collections.add(785774l);
			collections.add(985759l);
			collections.add(888575l);
			collections.add(989994l);
			collections.add(989564l);
			System.out.println(collections.size());
			
			Comparator<Long> com=new Trainumberimp();
			Collections.sort(collections, com);

			
			//Collections.sort(col);
			Iterator<Long> itr = collections.iterator();

			while (itr.hasNext()) {
				Long elements = itr.next();
				System.out.println(elements);
			}
			
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>");
			
			
			Set<Long> set=new TreeSet<Long>();
			
			set.add(99942l);
			set.add(95674l);
			set.add(98764l);
			set.add(90789l);
			set.add(90908l);
			set.add(80897l);
			set.add(98764l);
			set.add(90754l);
			set.add(97764l);
			set.add(99997l);
			set.add(96889l);
			System.out.println(set.size());
			Comparator<Long> com1=new TrainNumberImp2();
			Collections.sort(set,com1);
			
			Iterator<Long> itr1 = set.iterator();

			while (itr1.hasNext()) {
				Long elements = itr1.next();
				System.out.println(elements);
			}
			
		}
			

	}


