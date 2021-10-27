package com.xworkz.dp.dto;

import com.xworkz.dp.CarpentarDTO;

public class CarpentarStarterDTO {

	public static void main(String[] args) {

		CarpentarDTO carpentar = new CarpentarDTO();

		CarpentarDTO carpentar0 = new CarpentarDTO("vinayak", 3, true, "banglore", 100.0f);
		CarpentarDTO carpentar1 = new CarpentarDTO("manju", 2, false, "gadag", 200.0f);
		CarpentarDTO carpentar2 = new CarpentarDTO("nayak", 4, false, "mysore", 300.0f);

		CarpentarDTO[] pulav = new CarpentarDTO[2];
		pulav[0] = carpentar2;
		// pulav[1]=carpentar1;
		for (int biriyani = 0; biriyani < pulav.length; biriyani++) {
			System.out.println("invoked pulav as array");
			CarpentarDTO ref = pulav[biriyani];
			if (ref != null) {
				System.out.println(ref.getLocation());
				System.out.println(ref.getName());
				System.out.println(ref.getNoOfcarpentars());
				System.out.println(ref.getPrice());
				System.out.println(ref.isWork());
			} else {
				System.err.println("ref is null");
			}
		}
	}
}
