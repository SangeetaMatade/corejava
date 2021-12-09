package com.xworkz.Dto.scammer;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.xworkz.Dto.ArmyDto;


public class ArmyScammer {

	public static void main(String[] args) {
		
		ArmyDto armydto1 = new ArmyDto("Captain Vikram Batra", "Himachal Pradesh", "M3 Stuart", 15);
		ArmyDto armydto2 = new ArmyDto("Major General Ian Cardozo", "Uttar Pradesh", "M5 Stuart ", 14);
		ArmyDto armydto3 = new ArmyDto("Brigadier Mohammad Usman", "Aurangabad", "M4 Sherman", 13);
		ArmyDto armydto4 = new ArmyDto("Subedar Yogendra Singh Yadav", "punjab", "Centurion A41", 12);
		ArmyDto armydto5 = new ArmyDto("Captain Vikram Batra", "Himachal Pradesh", "M3 Stuart", 11);

		Set<ArmyDto> st = new HashSet<ArmyDto>();
		
		st.add(armydto5);
		st.add(armydto4);
		st.add(armydto3);
		st.add(armydto2);
		st.add(armydto1);
		
		System.out.println(st.size());
		
		Iterator<ArmyDto> itr = st.iterator();
		while(itr.hasNext()) {
			ArmyDto elements = itr.next();
			System.out.println(elements);
		}
	}

}
