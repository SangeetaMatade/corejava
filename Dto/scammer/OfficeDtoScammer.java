package com.xworkz.Dto.scammer;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



import com.xworkz.Dto.OfficeDto;
import com.xworkz.Dto.PoliceStationDto;

public class OfficeDtoScammer {

	public static void main(String[] args) {
		
		OfficeDto officeDto1 = new OfficeDto("Administrate office", "Banglore",9);
		OfficeDto officeDto2 = new OfficeDto("Assured office", "Hubli",3);
		OfficeDto officeDto3 = new OfficeDto("Adapt office", "Dharwad",7);
		OfficeDto officeDto4 = new OfficeDto("Finance office", "Bellary",4);
		OfficeDto officeDto5 = new OfficeDto("Administrate office", "Banglore",9);
		
		Set<OfficeDto> st = new HashSet<OfficeDto>();
		
		st.add(officeDto5);
		st.add(officeDto4);
		st.add(officeDto3);
		st.add(officeDto2);
		st.add(officeDto1);
		System.out.println(st.size());
		
		Iterator<OfficeDto> itr = st.iterator();
		while(itr.hasNext()) {
			OfficeDto elements = itr.next();
			System.out.println(elements);
		}

		

	}

}
