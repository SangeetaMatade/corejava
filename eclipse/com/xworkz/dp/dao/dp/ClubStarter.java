package com.xworkz.dp;

import com.xworkz.dp.dao.ClubDAO;
import com.xworkz.dp.dto.ClubDTO;

public class ClubStarter {

	public static void main(String[] args) {

		ClubDTO dto = new ClubDTO();
		ClubDAO dao = new ClubDAO();

		ClubDTO dto1 = new ClubDTO(60, 90, 5, 100.0f, 20);
		ClubDTO dto2 = new ClubDTO(60, 65, 3, 100.0f, 10);
		ClubDTO dto3 = new ClubDTO(80, 100, 4, 150.0f, 20);
		ClubDTO dto4 = new ClubDTO(200, 250, 5, 500.0f, 30);

		dao.save(dto3);
		dao.delete(2);
		dao.update(dto2, 1);
		ClubDTO[] dtos = dao.getClub();
		dtos[0] = dto1;
		dtos[1] = dto2;
		dtos[2] = dto3;
		dtos[3] = dto4;

		for (int i = 0; i < dtos.length; i++) {
			ClubDTO dtos1 = dtos[i];
			if (dtos1 != null) {
			System.out.println(dtos1.getEntryprice());
			System.out.println(dtos1.getNoOfbottle());
			System.out.println(dtos1.getNoOfpeople());
			System.out.println(dtos1.getNoOfStaff());
			System.out.println(dtos1.getRating());

		}

		}
		}

}
