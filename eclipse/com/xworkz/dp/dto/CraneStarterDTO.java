package com.xworkz.dp.dto;

import com.xworkz.dp.CraneDTO;

public class CraneStarterDTO {

	public static void main(String[] args) {
		CraneDTO crane = new CraneDTO();

		CraneDTO crane1 = new CraneDTO("xyz", "red", true, 5);
		CraneDTO crane2 = new CraneDTO("zyx", "yellow", false, 6);
		CraneDTO crane3 = new CraneDTO("sss", "greeen", false, 7);

		CraneDTO[] intel = new CraneDTO[2];
		intel[0] = crane1;
		//intel[1] = crane2;
		

		for (int i = 0; i < intel.length; i++) {
			CraneDTO pulka = intel[i];
			System.out.println("cranes are".concat(String.valueOf(i)));
			if (pulka != null) {
				System.out.println(pulka.getColor());
				System.out.println(pulka.getName());
				System.out.println(pulka.getParts());
				System.out.println(pulka.isWork());
			} else {
				System.err.println("pulka is null");
			}
		}

	}

}
