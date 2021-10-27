package com.xworkz.dp.dto;

import com.xworkz.dp.ParkDtO;

public class ParkStarterDTO {

	public static void main(String[] args) {

		ParkDtO park = new ParkDtO();

		ParkDtO park1 = new ParkDtO("sadankeri", "dharwad", "timepass", 1, true, false);
		ParkDtO park2 = new ParkDtO("sanjivini", "hubli", "walk", 2, false, true);
		ParkDtO park3 = new ParkDtO("nruptunga betta", "hubi", "fun", 1, true, true);

		ParkDtO[] ref = new ParkDtO[3];
		ref[0] = park3;
		ref[1] = park2;
		ref[2] = park1;
		for (int s = 0; s < ref.length; s++) {
			System.err.println("invoked ref as array");
			ParkDtO ref1 = ref[s];
			if (ref1 != null) {

				System.out.println(ref1.getLocation());
				System.out.println(ref1.getName());
				System.out.println(ref1.getNoOfparks());
				System.out.println(ref1.isClean());
				System.out.println(ref1.isSafety());
			} else {
				System.err.println("index is null");
			}
		}

	}

}
