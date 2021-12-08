package com.xworkz.collectioncodes;

import java.util.List;
import java.util.Set;

import java.util.TreeSet;

import com.xworkz.collectioncodes.implementation.PhoneNumberImp;
import com.xworkz.collectioncodes.implementation.PhoneNumberImp2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class PhoneNumber {

	public static void main(String[] args) {

		List<Long> col = new ArrayList<Long>();

		col.add(7019907453l);
		col.add(9123428368l);
		col.add(8567165743l);
		col.add(9857542345l);
		col.add(8857772345l);
		col.add(7857740345l);
		col.add(9857599205l);
		col.add(8885754234l);
		col.add(9899942345l);
		col.add(9895642345l);
		
		
		Comparator<Long> com=new PhoneNumberImp();
		Collections.sort(col, com);

		System.out.println(col.size());
		//Collections.sort(col);
		Iterator<Long> itr = col.iterator();

		while (itr.hasNext()) {
			Long elements = itr.next();
			System.out.println(elements);
		}
		System.out.println("...................................................");
		
		
		Set<Long> st=new TreeSet<Long>();
		
		st.add(9994298578l);
		st.add(9567465746l);
		st.add(987643219l);
		st.add(9078987887l);
		st.add(9090898987l);
		st.add(808976567l);
		st.add(987643219l);
		st.add(907541239l);
		st.add(977647829l);
		st.add(999976219l);
		st.add(968890219l);
		Comparator<Long> com1=new PhoneNumberImp2();
		Collections.sort(st,com1);
		
		System.out.println(st.size());
		

		Iterator<Long> itr1 = st.iterator();

		while (itr1.hasNext()) {
			Long elements = itr1.next();
			System.out.println(elements);
		}
		
	}

}
