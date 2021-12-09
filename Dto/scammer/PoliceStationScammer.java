package com.xworkz.Dto.scammer;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.xworkz.Dto.PoliceStationDto;

public class PoliceStationScammer {

	public static void main(String[] args) {

		PoliceStationDto policeStationDto = new PoliceStationDto("Banaswadi", "Kalyan nagar", "civil",15);

		PoliceStationDto policeStationDto1 = new PoliceStationDto("Bharati", "Bharati nagar", "trafficpolice", 12);

		PoliceStationDto policeStationDto2 = new PoliceStationDto("Halsoor", "Jogupalya nagar", "army", 19);

		PoliceStationDto policeStationDto3 = new PoliceStationDto("Banaswadi", "Kalyan nagar", "civil", 15);

		Set<PoliceStationDto> st = new HashSet<PoliceStationDto>();

		st.add(policeStationDto);
		st.add(policeStationDto3);
		st.add(policeStationDto2);
		st.add(policeStationDto1);
		
		System.out.println(st.size());

		Iterator<PoliceStationDto> itr = st.iterator();
		while (itr.hasNext()) {
			PoliceStationDto elements = itr.next();
			System.out.println(elements);
		}

	}

}
