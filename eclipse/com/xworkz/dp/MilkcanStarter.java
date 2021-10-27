package com.xworkz.dp;

import com.xworkz.dp.dao.MilkcanDAO;
import com.xworkz.dp.dto.MilkcanDTO;

public class MilkcanStarter {
	public static void main(String[] args) {
		MilkcanDTO dto = new MilkcanDTO(2, "round", "good", "white", 30.0f);
		MilkcanDAO dao = new MilkcanDAO();
		MilkcanDTO dto1 = new MilkcanDTO(3, "square", "not bad", "ornge", 35.0f);
		MilkcanDTO dto2 = new MilkcanDTO(6, "triangle", "good", "orange", 50.0f);
		MilkcanDTO dto3 = new MilkcanDTO(5, "pyramid", "good", "yellow", 30.0f);
		MilkcanDTO dto4 = new MilkcanDTO(7, "long", "bad", "white", 40.0f);
		dao.create(dto3);
		dao.update(dto2, 1);
		dao.delete(4);
		int lock = dao.indexoccupied();
		System.out.println(lock);
		dao.matchByquality("good");

		MilkcanDTO[] dtos = dao.getmilk();
		dtos[0] = dto1;
		dtos[1] = dto2;
		for (int i = 0; i < dtos.length; i++) {
			MilkcanDTO dtos1 = dtos[i];

			if (dtos1 != null) {
				System.out.println(dtos1.getColor());
				System.out.println(dtos1.getPrice());
				System.out.println(dtos1.getQuality());
				System.out.println(dtos1.getQuantity());
				System.out.println(dtos1.getShape());

			}

		}
	}
}
