package com.xworkz.dp.dto;

import com.xworkz.dp.SeasonDTO;

public class SeasonStarterDTO {

	public static void main(String[] args) {

		SeasonDTO season = new SeasonDTO();
		SeasonDTO season1 = new SeasonDTO("winter", 4, true, "december", "combination of cold and hot", 4);
		SeasonDTO season2 = new SeasonDTO("summer", 3, false, "june", "sunny", 3);
		SeasonDTO season3 = new SeasonDTO("rainy", 2, true, "septmber", "cold", 2);

		SeasonDTO[] ref = new SeasonDTO[3];
		ref[0] = season3;
		ref[1] = season2;
		// ref[2]=season1;
		for (int m = 0; m < ref.length; m++) {
			SeasonDTO chain = ref[m];
			System.out.println("seasons are");
			if (chain != null) {

				System.out.println(chain.getName());
				System.out.println(chain.getClimate());
				System.out.println(chain.getMonth());
				System.out.println(chain.getNoOfseasons());
				System.out.println(chain.getTypes());
			} else {
				System.err.println("index is full");
			}
		}
	}

}
