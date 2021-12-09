package com.xworkz.Dto.scammer;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.xworkz.Dto.ChocolateDto;


public class ChocolateDtoScammer {

	public static void main(String[] args) {
		
		ChocolateDto chocolateDto1=new ChocolateDto("DairyMilk", "Milk", 1, 7);
		ChocolateDto chocolateDto2=new ChocolateDto("kitkat", "semi-chock", 2, 8);
		ChocolateDto chocolateDto3=new ChocolateDto("munch", "crunch", 3, 9);
		ChocolateDto chocolateDto4=new ChocolateDto("FiveStar", "semiSweet", 4, 10);
		ChocolateDto chocolateDto5=new ChocolateDto("perk", "semimilk", 5, 11);
		ChocolateDto chocolateDto6=new ChocolateDto("DairyMilk", "Milk", 1, 7);
		
		Set<ChocolateDto> st = new HashSet<ChocolateDto>();
		st.add(chocolateDto6);
		st.add(chocolateDto5);
		st.add(chocolateDto4);
		st.add(chocolateDto3);
		st.add(chocolateDto2);
		st.add(chocolateDto1);
		
		System.out.println(st.size());
		
		Iterator<ChocolateDto> itr = st.iterator();
		while(itr.hasNext()) {
			ChocolateDto elements = itr.next();
			System.out.println(elements);
			
		}

	}

}
