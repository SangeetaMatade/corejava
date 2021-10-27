package com.xworkz.dp.dto;

import com.xworkz.dp.BraceletDto;

public class BraceletStarter {

	public static void main(String[] args) {
		BraceletDto braceletdto = new BraceletDto();

		braceletdto.setColor("black");
		braceletdto.setPrice(20.0f);
		braceletdto.setGemused(false);
		braceletdto.setGifted(true);
		braceletdto.setSize(2);

		BraceletDto braceletdto1 = new BraceletDto(40.0f, 77, "pink", true, false);
		BraceletDto braceletdto2 = new BraceletDto(88.0f, 5, "red", false, false);
		BraceletDto braceletdto3 = new BraceletDto(99.0f, 7, "blue", true, true);
		BraceletDto braceletdto4 = new BraceletDto(100.0f, 6, "gold", false, true);

		BraceletDto[] ref = new BraceletDto[5];
		ref[0] = braceletdto;
		ref[1] = braceletdto2;
		// ref[2]= null;
		ref[3] = braceletdto4;
		ref[4] = braceletdto1;

		for (int i = 0; i < ref.length; i++) {
			BraceletDto lock = ref[i];
			if (lock != null) {
				System.out.println(lock.getColor());

			} else {
				System.err.println("index is null");
			}
		}
	}
}
