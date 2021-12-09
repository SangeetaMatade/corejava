package com.xworkz.Dto.scammer;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.xworkz.Dto.HospitalDto;

public class HospitalScammer {

	public static void main(String[] args) {

		HospitalDto hospitalDto1 = new HospitalDto("apollo", "MultiSepcialist", 40);
		HospitalDto hospitalDto2 = new HospitalDto("Shoba", "Pediatrics", 30);
		HospitalDto hospitalDto3 = new HospitalDto("Shivam", "Pyschiatrist", 60);
		HospitalDto hospitalDto4 = new HospitalDto("purvi", "Dermatology", 70);
		HospitalDto hospitalDto5 = new HospitalDto("jyoti", "Anesthesiology", 80);
		HospitalDto hospitalDto6 = new HospitalDto("apollo", "MultiSepcialist", 40);

		Set<HospitalDto> st = new HashSet<HospitalDto>();

		st.add(hospitalDto6);
		st.add(hospitalDto5);
		st.add(hospitalDto4);
		st.add(hospitalDto3);
		st.add(hospitalDto2);
		st.add(hospitalDto1);

		System.out.println(st.size());

		Iterator<HospitalDto> itr = st.iterator();

		while (itr.hasNext()) {
			HospitalDto elements = itr.next();
			System.out.println(elements);

		}

	}

}
